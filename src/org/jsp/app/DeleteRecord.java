package org.jsp.app;
import java.util.Scanner;

import javax.persistence.*;
public class DeleteRecord {
 public static void main(String[] args) {
	
	 
	 EntityManagerFactory factory=Persistence.createEntityManagerFactory("Firstproject");
	 EntityManager manager=factory.createEntityManager();
	 
	 
	manager.getTransaction().begin();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the student Id :");
	Student student=manager.find(Student.class, scanner.nextInt());
	if(student != null)
	{
		manager.remove(student);
		System.out.println("Delete Record........!!!!!!");
	}
	else
	{
		System.err.println("Invalid Data......!!!!!");
	}
	manager.getTransaction().commit();
	manager.close();
	factory.close();
}
}
