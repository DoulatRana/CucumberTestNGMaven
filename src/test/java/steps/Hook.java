package steps;

import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil{
 
 private BaseUtil base;
 
 public Hook(BaseUtil base){
  this.base = base;
 }
 
 @Before
 public void initialiseTest(){
  
  System.out.println("***********Opening the browser***********************");
  //passing a dummy web driver instance
  base.StepInfo = "FirefoxDriver";
  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sharathcg\\cucumberMars\\CucumberSelenium\\Jars\\geckodriver.exe");
  base.Driver = new FirefoxDriver();
 }
 
 @After
 public void tearDown(Scenario scenario){
  
  if(scenario.isFailed()){
   
   //take screen print
   System.out.println(scenario.getName());
  }
  System.out.println("*****************tearing down the session**************");
  base.Driver.quit();
 }
}