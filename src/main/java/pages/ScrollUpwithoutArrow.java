package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ScrollUpwithoutArrow extends TestBase{
	
	@FindBy(xpath ="//h2[text()='Subscription']")
	WebElement Subsribetext;
	
	@FindBy(xpath = "//h2[text()=\"Full-Fledged practice website for Automation Engineers\"]")
	WebElement FullpageTitle;
	
	public ScrollUpwithoutArrow() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignupPageTitle() {
		 return driver.getTitle();
	}
	public String SubsribeScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 return Subsribetext.getText();
	}
	
	public String ScrollUp() {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	      js2.executeScript("window.scrollTo(0, 0)");
		return FullpageTitle.getText();
	}
	
}
