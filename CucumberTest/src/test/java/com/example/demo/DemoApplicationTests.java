package com.example.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = {"src/test/resources/hellocucumber/is_it_friday_yet.feature","src/test/resources/hellocucumber/calc.feature"})
public class DemoApplicationTests {

    protected RestTemplate restTemplate = new RestTemplate();

    protected final String DEFAULT_URL = "http://localhost:8082/";

}
