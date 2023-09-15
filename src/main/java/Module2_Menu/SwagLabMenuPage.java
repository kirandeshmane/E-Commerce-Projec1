package Module2_Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage
{
	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement ClickLogoutBtn;
	
	public SwagLabMenuPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Clickloutbtn()
	{
		ClickLogoutBtn.click();
	}


}
