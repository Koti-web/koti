package org.jsp.app;
import javax.persistence.*;
public class ReverseEngineeringProcess {
	public static void main(String[] args) {
		//jpa template
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Firstproject");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		//retrive data
		Student student=manager.find(Student.class,1003);
		if(student!=null)
		{
		System.out.println("Enter the Student id "+student.getSid());
		System.out.println("Enter the student name "+student.getSname());
		System.out.println("Enter the Student number "+student.getSnumber());
		}
		else
		{
			System.err.println("Inavalid Student Id.........!!!!!!!!");
		}
		
		
		
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
