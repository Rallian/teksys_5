package jpa.entitymodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")

public class Student {
	
	@Column(name = "email")
	@Id
	private String sEmail;
	@Column(name="name")
	private String sName;
	@Column(name="password")
	private String sPassword;
	@OneToMany(targetEntity = Course.class, cascade = {CascadeType.ALL})
	private List<Course> sCourses = new ArrayList<Course>();
	
	
	public Student() {
		
	}

	
	
	

	public Student(String email, String name, String password) {
		
		this.sEmail = email;
		this.sName = name;
		this.sPassword = password;
	
	}





	public String getsEmail() {
		return sEmail;
	}





	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}





	public String getsName() {
		return sName;
	}





	public void setsName(String sName) {
		this.sName = sName;
	}





	public String getsPassword() {
		return sPassword;
	}





	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}





	public List<Course> getsCourses() {
		return sCourses;
	}





	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}


	
	

}
