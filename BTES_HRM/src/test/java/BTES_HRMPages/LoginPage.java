package BTES_HRMPages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BTES_HRMTestBase.Testbase;

public class LoginPage extends Testbase
{
	@FindBy(id="companyLogoHeader")
	WebElement complogo;

	@FindBy(name= "txtUserName")
	WebElement uname;

	@FindBy(name= "txtPassword")
	WebElement pass;

	@FindBy(name="Submit")
	WebElement loginsubmit ;

	@FindBy(name="clear")
	WebElement loginclear ;


	public LoginPage() 
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public  void Login()
	{
		uname.sendKeys(props.getProperty("username"));
		pass.sendKeys(props.getProperty("password"));
		loginsubmit.click();

	}
	public void Invalid_Login()
	{
		uname.sendKeys(props.getProperty("inv_user"));
		pass.sendKeys(props.getProperty("inv_pass"));
		loginsubmit.click();
	}
	public  void complogo_click() throws IOException
	{
		if(complogo.isDisplayed()){
			   complogo.click();
			   System.out.println("company logo present");
			 }
		else
		{
			 System.out.println("company logo is not present");
		}
	}
}