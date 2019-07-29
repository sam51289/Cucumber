package com.example.demo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalcTest extends  DemoApplicationTests{

    int response = 0;
    String url = DEFAULT_URL + "calc/";

    @When("the client calls \\/calc\\/add with values (\\d+) and (\\d+)")
    public void the_client_calls_arithmetic_add_with_values_and(int int1, int int2) {
        response = restTemplate.getForObject(url + "add?a=" +
                int1 + "&b=" + int2, Integer.class);
    }

    @Then("the client receives answer as (\\d+)")
    public void the_client_receives_answer_as(int result) {
        assertEquals(result, response);
    }

    @When("the client calls \\/calc\\/sub with values (\\d+) and (\\d+)")
    public void the_client_calls_calc_sub_with_values_and(Integer int1, Integer int2) {
        response = restTemplate.getForObject(url + "sub?a=" +
                int1 + "&b=" + int2, Integer.class);
    }

    @When("the client calls \\/calc\\/mul with values (\\d+) and (\\d+)")
    public void the_client_calls_calc_mul_with_values_and(Integer int1, Integer int2) {
        response = restTemplate.getForObject(url + "mul?a=" +
                int1 + "&b=" + int2, Integer.class);
    }

    @When("the client calls \\/calc\\/div with values (\\d+) and (\\d+)")
    public void the_client_calls_calc_div_with_values_and(Integer int1, Integer int2) {
        response = restTemplate.getForObject(url + "div?a=" +
                int1 + "&b=" + int2, Integer.class);
    }

}


