package com.training.controller;

import com.training.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.repository.StudentRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by chriscone on 9/11/17.
 */

public class StudentControllerTest {

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @InjectMocks
    private StudentController studentController;

    @Mock
    private StudentRepository studentRepositoryMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
        this.objectMapper = new ObjectMapper();
    }

    @Test
    public void getUserShouldReturn200AndRequestedUser() throws Exception {

        Mockito.when(studentRepositoryMock.findOne(1)).thenReturn(getSampleStudent());

        MvcResult response = mockMvc.perform(MockMvcRequestBuilders.get("/student/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String responseBody = response.getResponse().getContentAsString();
        Student responseStudent = objectMapper.readValue(responseBody, Student.class);

        Assert.assertEquals(responseStudent.getFirstName(), getSampleStudent().getFirstName());
        Assert.assertEquals(responseStudent.getLastName(), getSampleStudent().getLastName());
        Assert.assertEquals(responseStudent.getEmail(), getSampleStudent().getEmail());
    }

    @Test
    public void getUserShouldReturn400BadRequestWhenIdIsInvalid() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/student/notanumber")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    private Student getSampleStudent() {
        Student student = new Student();
        student.setStudentId(1);
        student.setEmail("test_email@mycompany.com");
        student.setFirstName("Bob");
        student.setLastName("Smith");

        return student;
    }
}
