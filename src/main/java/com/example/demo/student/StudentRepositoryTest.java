package com.example.demo.student;

import java.util.Optional;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class StudentRepositoryTest {

	private StudentRepository createTestSubject() {
		return null;
	}


	@Test
	public void testFindStudentByEmail() throws Exception {
		StudentRepository testSubject;
		String email = "";
		Optional<Student> result;

		// default test
		testSubject = createTestSubject();
		result = invokeMethod(testSubject, "findStudentByEmail", new Object[] { email });
	}


	private Optional<Student> invokeMethod(StudentRepository testSubject, String string, Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}
}