package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {

	   
	@Id
	private int sid;
	private String sname;
	private int snumber;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}   
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}   
	public int getSnumber() {
		return this.snumber;
	}

	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}
   
}
