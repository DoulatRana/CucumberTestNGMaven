package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//data members
	@FindBy(how = How.NAME, using="UserName")
	private WebElement txtUsername;
	
	@FindBy(how = How.NAME, using="Password")
	private WebElement txtPassword;
	
	@FindBy(how = How.NAME, using="Login")
	private WebElement bttnLogin;
			


	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void enterUnAndPwd(String userName, String passWord){
		txtUsername.sendKeys(userName);
		txtPassword.sendKeys(passWord);
	}
	public void clickLogin(){
		bttnLogin.submit();
	}


}