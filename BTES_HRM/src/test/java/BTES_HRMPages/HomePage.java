package BTES_HRMPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BTES_HRMTestBase.Testbase;

public class HomePage extends Testbase
{

	@FindBy(id="companyLogoHeader")
	WebElement complogo;

	@FindBy(linkText="Admin")
	WebElement homeadmin;

	@FindBy(linkText="PIM")
	WebElement homepim;

	@FindBy(linkText="Reports")
	WebElement homereports;


	@FindBy(linkText="Search By:")
	WebElement hsearchby;
	
	@FindBy(css="input[value='Search']")
	WebElement searchbtn;

	@FindBy(css="input[value='Reset']")
	WebElement resetbtn;
	
	@FindBy(css="input[value='Add']")
	WebElement addbtn;
	
	@FindBy(css="input[value='Delete']")
	WebElement deletebtn;
	
	@FindBy(name= "txtUserName")
	WebElement uname;

	@FindBy(name= "txtPassword")
	WebElement pass;

	@FindBy(name="Submit")
	WebElement loginsubmit ;

	public  void Login()
	{
		uname.sendKeys(props.getProperty("username"));
		pass.sendKeys(props.getProperty("password"));
		loginsubmit.click();

	}

	public HomePage() 
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyTitle() 
	{
		return driver.getCurrentUrl();
	}
// to check the logo on home page
	public  void Hlogo() 
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
	// to check the click availability of home , pim and reports 
	 public void Hclick()
	 {
		 homeadmin.getText();
	 }
	 public void Pclick()
	 {
		 homepim.getText();
	 }
	 public void Rclick()
	 {
		 homereports.getText();
	 }
	
	 public void Searchbtn()
	 {
		 searchbtn.getText();
	 }
	 public void Resetbtn()
	 {
		 resetbtn.getText();
	 }
	 public void Addbtn()
	 {
		 addbtn.getText();
	 }
	 public void Deletebtn()
	 {
		 deletebtn.getText();
	 }
	
}