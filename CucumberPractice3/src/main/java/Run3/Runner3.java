package Run3;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\main\\java\\Feature3\\ContactOfCustomer3.Feature"},glue= {"StepDefinition3"},monochrome = true,tags = "@Adhoc,@Function")
public class Runner3 {

}
