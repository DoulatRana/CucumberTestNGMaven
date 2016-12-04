package steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

//import Transformation.SalaryCountTransformer;
//import Transformation.emailTrans;
import base.BaseUtil;
//import java.util.Map;
import cucumber.api.DataTable;
//import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
public class LoginStep extends BaseUtil{
 
 private BaseUtil base;
  
 public LoginStep(BaseUtil base){
  this.base=base;
 }
 
 
 @Given("^I navigate to the login page$")
 public void iNavigateToTheLoginPage() throws Throwable {
  
  System.out.println("the driver is "+base.StepInfo);
  
  base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
 }
 
/* @And("^I enter the email address as Email \"([^\"]*)\"$")
 public void i_enter_the_email_address_as_Email(@Transform(emailTrans.class)String email) throws Throwable {
  System.out.println("User has entered following email address "+email);
    
 }
 @And("^I verify the count of my salary digits for Rs (\\d+)$")
 public void i_verify_the_count_of_my_salary_digits_for_Rs(@Transform(SalaryCountTransformer.class)int salary) throws Throwable {
  System.out.println("Salary of the user is "+salary);
     
 }*/
 

 @And("^I enter the username as admin and password as adminpassword$")
 public void i_enter_the_username_as_admin_and_password_as_adminpassword(DataTable table) throws Throwable {
  
  /*List<Map<String, String>> data = table.asMaps(String.class, String.class);*/
  
  //ctrl+sft+/ will automatically comment the selected line
     /*System.out.println("User has entered following username "+data.get(0).get("username")+" password "+data.get(0).get("password") );*/
  
  List<User> users = new ArrayList<User>();
  users = table.asList(User.class);
  LoginPage lp = new LoginPage(base.Driver);
  for (User user:users){
	  
   System.out.println("User has entered following username "+user.username+" and password of "+user.password);
   lp.enterUnAndPwd(user.username, user.password);
   
  }
 }
/* @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
 public void i_enter_the_username_as_and_password_as(String username, String password) throws Throwable {
  System.out.println("User has entered following username "+username+" and password of "+password);
 }*/
 @And("^I click login button$")
 public void i_click_login_button() throws Throwable {
	 LoginPage lp = new LoginPage(base.Driver);
	 lp.clickLogin();
	 Thread.sleep(5000);
 }
 @Then("^I should see the userform page$") 
 public void i_should_see_the_userform_page() throws Throwable {
	 Assert.assertEquals("it is not displayed",base.Driver.findElement(By.id("Initial")).isDisplayed(),true);
     
 }
 
 @Then("^I should notsee the userform page$")
 public void i_should_notsee_the_userform_page() throws Throwable {
	 Assert.assertEquals("it is not displayed",base.Driver.findElement(By.id("dfsdsdsggds")).isDisplayed(),true);
 }

 public class User{
  
  public String username;
  public String password;
  
  public User(String userName, String passWord){
   username = userName;
   password = passWord;
   
  }
 }
}