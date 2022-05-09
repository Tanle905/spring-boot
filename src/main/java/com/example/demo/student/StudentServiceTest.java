package com.example.demo.student;

import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class StudentServiceTest {

	private StudentService createTestSubject() {
		return new StudentService(null);
	}


	@Test
	public void testGetStudent() throws Exception {
		StudentService testSubject;
		List<Student> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getStudent();
	}


	@Test
	public void testAddNewStudent() throws Exception {
		StudentService testSubject;
		Student student = null;

		// default test
		testSubject = createTestSubject();
		testSubject.addNewStudent(student);
	}
}