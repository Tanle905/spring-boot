package com.example.demo.student;

import java.time.LocalDate;

import javax.annotation.processing.Generated;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class StudentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	private Student createTestSubject() {
		return new Student();
	}

	@Test
	public void testGetId() throws Exception {
		Student testSubject;
		Long result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getId();
	}

	@Test
	public void testGetName() throws Exception {
		Student testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getName();
	}

	@Test
	public void testGetAge() throws Exception {
		Student testSubject;
		@SuppressWarnings("unused")
		Integer reback;

		// default test
		testSubject = createTestSubject();
		reback = testSubject.getAge();
	}

	@SuppressWarnings("unused")
	@Test
	public void testGetDob() throws Exception {
		Student testSubject;
		LocalDate result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDob();
	}


	@SuppressWarnings("unused")
	@Test
	public void testGetEmail() throws Exception {
		Student testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getEmail();
	}


	@Test
	public void testSetId() throws Exception {
		Student testSubject;
		Long id = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setId(id);
	}



	@Test
	public void testSetName() throws Exception {
		Student testSubject;
		String name = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setName(name);
	}


	@Test
	public void testSetAge() throws Exception {
		Student testSubject;
		Integer age = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setAge(age);
	}


	@Test
	public void testSetDob() throws Exception {
		Student testSubject;
		LocalDate dob = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setDob(dob);
	}


	@Test
	public void testSetEmail() throws Exception {
		Student testSubject;
		String email = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setEmail(email);
	}


	@Test
	public void testToString() throws Exception {
		Student testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.toString();
	}
}