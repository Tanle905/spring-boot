package com.example.demo;
import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import com.example.demo.student.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
class DemoApplicationTests {
  public static Logger logger=Logger.getLogger("global");
	@Autowired
    private StudentRepository repository;
    @Autowired
    private WebApplicationContext webApplicationContext;
  private MockMvc mvc;
    @MockBean
  private StudentService service;
  

  @BeforeEach
  public void setUp() {
    mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
  }

	@Test
	public void methodGETTest()
			throws Exception {

		Student alex = new Student("alex", LocalDate.of(2000, Month.APRIL, 22), "alex@test.com");
        repository.save(alex);

		List<Student> allStudents = Arrays.asList(alex);

		 given(service.getStudent()).willReturn(allStudents);
	mvc.perform(MockMvcRequestBuilders.get("/api/v1/student")
      .contentType(MediaType.APPLICATION_JSON))
      .andExpectAll(
       status().isOk(),
       jsonPath("$", hasSize(1))
   );
	}

	@Test
  public void methodPOSTTest()
			throws Exception {
        Student alex = new Student("alex", LocalDate.of(2000, Month.APRIL, 22), "alex@test.com");

	mvc.perform(MockMvcRequestBuilders.post("/api/v1/student")
      .content(asJsonString(alex))
      .contentType(MediaType.APPLICATION_JSON))
      .andExpectAll(
       status().isOk()
   );
	}

  public static String asJsonString(final Object obj) {
    try {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        final String jsonContent = mapper.writeValueAsString(obj);
        return jsonContent;
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}  

}
