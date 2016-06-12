package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {

	private WebDriver driver;
	private String url = "http://www.gmail.com";

	@FindBy(xpath = ".//*[@id='Email']")
	private WebElement Username;

	@FindBy(xpath = ".//*[@id='next']")
	private WebElement NextBtn;

	@FindBy(xpath = "//*[@id='Passwd']")
	private WebElement Password;
	
	@FindBy(xpath=".//*[@id='signIn']")
	private WebElement SignInBtn;

	public GmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void openGmail() {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void EnterUsername(String username) {
		Username.clear();
		Username.sendKeys(username);
	}

	public void EnterPassword(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
	}

	public void ClickNext() {
		NextBtn.click();
	}
	
	public void ClickSignIn() {
		SignInBtn.click();
	}
}
