package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//This runwith is basically telling my script to run the cucumber class file 
@RunWith(Cucumber.class)
//where is cucumber class file//can you guid me//what is the name of the file
@CucumberOptions(features="Login",glue={"stepdefinition"})
public class testrunner {

}
