package TestBDD.StepDefinitions;

import TestBDD.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void beforeScenario(){
        DriverManager.startDriver();
    }
    @After
    public void afterScenario(){
        DriverManager.stopDriver();
    }
}
