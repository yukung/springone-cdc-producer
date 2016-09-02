package org.yukung.demo;

import org.junit.Before;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

public class MvcTest {

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.standaloneSetup(new ProducerSideController());
    }
}
