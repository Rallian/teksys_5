package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")

public class Course {
	@Column(name="id")
	@Id
	private Integer cId;
	@Column(name="name")
	private String cName;
	@Column(name="Instructor")
	private String cInstructor;
	
	
	public Course() {
		
	}


	public Course(Integer cId, String cName, String cInstructor) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructor = cInstructor;
	}


	public Integer getcId() {
		return cId;
	}


	public void setcId(Integer cId) {
		this.cId = cId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getcInstructor() {
		return cInstructor;
	}


	public void setcInstructor(String cInstructor) {
		this.cInstructor = cInstructor;
	}

	
	
	

}
