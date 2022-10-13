package org.jsp.app;
import javax.persistence.*;
public class JpaTemplate {
  public static void main(String[] args) {
	//jpa template
	  //establish connection
	  EntityManagerFactory factory=Persistence.createEntityManagerFactory("Firstproject");
	  System.out.println("Connection Establish......!!!");
	  //to carry of state of an object make use of platfrom
	  EntityManager manager=factory.createEntityManager();
	  System.out.println("platfrom Created....!!!!");
	  
	  //start Transction
	  manager.getTransaction().begin();
	  
	  //perfrom crud operation
	  
	  
	  //save transction
	  manager.getTransaction().commit();
	  manager.close();
	  factory.close();
	  System.out.println("Jpa Templated Complted....!!!!!");
}
}
