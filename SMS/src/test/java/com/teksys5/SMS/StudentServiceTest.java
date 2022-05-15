package com.teksys5.SMS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import antlr.collections.List;
import jpa.entitymodels.Student;
import jpa.service.StudentService;

public class StudentServiceTest {
	
	
	//tests that when we call getAllStudents it creates a list and fills it.
	@Test
	public void getAllStudentsTest() {
		StudentService ss = new StudentService();
		
		
		Assertions.assertTrue(ss.getAllStudents().size() > 0);
	}
	
	//tests that when we search for a student by email, it retrieves the correct name.
	@Test
	public void getStudentByEmailTest() {
		StudentService ss = new StudentService();
		String name = ss.getStudentByEmail("aiannitti7@is.gd").getsName();
		
		Assertions.assertEquals(name, "Alexandra Iannitti");
	}

}
