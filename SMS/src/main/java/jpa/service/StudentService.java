package jpa.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM Student";
		Query query = session.createQuery(hql);
		List<Student> results = query.getResultList();
		session.close();
		return results;
		
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class, sEmail);
		session.close();
		return student;
		
	}

	@Override
	public Boolean validateStudent(String sEmail, String sPassword) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class, sEmail);
		if(student.getsPassword().equals(sPassword)) {
			session.close();
			return true;
		}
		session.close();
		return false;
		
	}

	@Override
	public void registerStudentToCourse(String sEmail, Integer cId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Student student = session.load(Student.class, sEmail);
		Course course = session.get(Course.class, cId);
		List<Course> list = student.getsCourses();
		list.add(course);
		student.setsCourses(list);
		session.save(student);
		t.commit();
		session.close();
		
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class, sEmail);
		return student.getsCourses();	
	}

}
