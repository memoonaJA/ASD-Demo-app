
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Memoona Anwar DZ
 */
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;


public class stepDefinition {
    
     WebDriver driver;			

       @Given("^I have opened the browser$")
       public void givenStatment(){
           System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
           driver= new ChromeDriver();							
           
           System.out.println("Given statement executed successfully");
       }
       @When("^I visit website$")
       public void whenStatement(){
              driver.get("https://asd-demo-app1.herokuapp.com/");
       }
       @Then("^website returns content$")
       public void thenStatment(){
             Assert.assertEquals("Home", driver.getTitle());
       }
}
