package org.jsp.app;
import java.util.Scanner;

import javax.persistence.*;
public class InsertDataIntoStudent {

	public static void main(String[] args) {
		//jpa template
		//establish connection
		EntityManagerFactory factroy=Persistence.createEntityManagerFactory("Firstproject");
		//create platfrom
		EntityManager manager=factroy.createEntityManager();
		//start operation
		manager.getTransaction().begin();
		//insert opertion
		Student student=new Student();
		Scanner sacnner=new Scanner(System.in);
		System.out.println("Enter the Student Id : ");
		student.setSid(sacnner.nextInt());
		//student.setSid(1001);
		System.out.println("Enter the student name :");
		student.setSname(sacnner.next());
		//student.setSname("koti");
		System.out.println("Enter the student number :");
		student.setSnumber(sacnner.nextInt());
		//student.setSnumber(1234);
		
		manager.persist(student);
		System.out.println("Record Inserted  Sucussfully.......!!!!!");
		
		
		
		//save Transction
		manager.getTransaction().commit();
		//close
		manager.close();
		factroy.close();
	}
}
