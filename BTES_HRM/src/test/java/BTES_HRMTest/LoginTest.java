package BTES_HRMTest;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BTES_HRMPages.LoginPage;
import BTES_HRMTestBase.Testbase;

public class LoginTest extends Testbase
{
	LoginPage LP;
	String title;
	public LoginTest() throws IOException {
		super();
	}

	@BeforeSuite
	public void Launch() throws IOException
	{
		initialisation();
		LP = new LoginPage();
	}

	@Test
	public void Check_Title()
	{
		title=LP.verifyTitle();
		Assert.assertEquals(title,"BTES HRM");
	}

	
	@Test
	public void Login_User()
	{
		LP.Login();
	}
	@Test
	public void complogo() throws IOException
	{
		LP.complogo_click();
	}
	/*@Test
	public void Invalid_User()
	{
		LP.Invalid_Login();
	}*/
	
	
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
}