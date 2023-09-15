package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
	//POM Class 1
	
	//Step-1 - declaration 
	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PSW;
	@FindBy(xpath="//input[@id='login-button']") private WebElement LoginBTN;
	
	
	
	//Initialization
	
	public SwagLabLoginPage (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);   //className.methodename(WebDriverObject.this)
	}
	
	//Step3:usage
	
	public void enterUN(String username) 
	{
		UN.sendKeys(username);
	}
	
	public void enterPSW(String password)
	{
		PSW.sendKeys(password);
	}
	
	public void clickLoginbtn()
	{
		LoginBTN.click();
	}
}
