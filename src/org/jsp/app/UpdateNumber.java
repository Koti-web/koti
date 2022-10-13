package org.jsp.app;
import java.util.Scanner;

import javax.persistence.*;
public class UpdateNumber {
	public static void main(String[] args) {
		//jpa template
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Firstproject");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		//update operation
		//reverse Engineering process
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Student id:");
		Student student=manager.find(Student.class,scanner.nextInt());
		if(student != null)
		{
			System.out.println("Enter Number");
			student.setSnumber(scanner.nextInt());
		}
		else
		{
			System.err.println("Invalid Data........!!!!");
		}
	
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
