package com.example.demo.student;

import javax.annotation.processing.Generated;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.CommandLineRunner;

@Generated(value = "org.junit-tools-1.1.0")
public class StudentConfigTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	private StudentConfig createTestSubject() {
		return new StudentConfig();
	}

	@Test
	public void testCommandLineRunner() throws Exception {
		StudentConfig testSubject;
		StudentRepository repository = null;
		CommandLineRunner result;

		// default test
		testSubject = createTestSubject();
		result = invokeMethod(testSubject, "commandLineRunner", new Object[] { StudentRepository.class });
	}

	private CommandLineRunner invokeMethod(StudentConfig testSubject, String string, Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}
}