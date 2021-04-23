package BTES_HRMTest;
import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import BTES_HRMPages.HomePage;
import BTES_HRMTestBase.Testbase;

public class HomeTest extends Testbase
{
	HomePage HP;
	String title;

	public HomeTest() {
		super();
	}

	@BeforeSuite
	public void Launch()
	{
		initialisation();
		HP = new HomePage();
	}
	@Test(priority=0)
	public void Check_Title() 
	{
		HP.verifyTitle();		
	}
	@Test(priority=1)
	public void Login_User()
	{
		HP.Login();
	}

	@Test(priority=2)
	public void Check_HLogo()  throws IOException
	{
		HP.Hlogo();
	}

	@Test(priority=3)

	public void Check_Hadmin()
	{
		HP.Hclick();
	}
	@Test(priority=4)

	public void Check_Pim()
	{
		HP.Pclick();
	}
	@Test(priority=5)

	public void Check_Reports()
	{
		HP.Rclick();
	}
	@Test(priority=6)

	public void Check_Searchbtnclick()
	{
		HP.Searchbtn();
	}
	@Test(priority=7)

	public void Check_Resetbtnclick()
	{
		HP.Resetbtn();
	}
	@Test(priority=8)

	public void Check_Addbtnclick()
	{
		HP.Addbtn();
	}
	@Test(priority=9)

	public void Check_Deletebtnclick()
	{
		HP.Deletebtn();
	}

	@AfterSuite
	public void close()
	{
		terminate();
	}

}