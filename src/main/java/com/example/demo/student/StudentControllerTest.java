package com.example.demo.student;

import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class StudentControllerTest {

	private StudentController createTestSubject() {
		return new StudentController(new StudentService(null));
	}


	@Test
	public void testGetStudent() throws Exception {
		StudentController testSubject;
		List<Student> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getStudent();
	}


	@Test
	public void testRegisterNewStudent() throws Exception {
		StudentController testSubject;
		Student student = null;

		// default test
		testSubject = createTestSubject();
		testSubject.registerNewStudent(student);
	}
}