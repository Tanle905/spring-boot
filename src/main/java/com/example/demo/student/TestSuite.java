package com.example.demo.student;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(

{ StudentServiceTest.class, StudentTest.class, StudentConfigTest.class, StudentRepositoryTest.class,
		StudentControllerTest.class })
public class TestSuite { // nothing
}
