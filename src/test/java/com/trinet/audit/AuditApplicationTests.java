package com.trinet.audit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.trinet.audit.controller.AuditController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AuditApplication.class)
@WebAppConfiguration
public class AuditApplicationTests {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {

		mvc = MockMvcBuilders.standaloneSetup(new AuditController()).build();
	}

	@Test
	public void getIndex() throws Exception {

		// mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		// .andExpect(content().string(equalTo("Welcome to Audit service!!! ")));

	}

}
