package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_ELEMENT;
	
	public void varifyDashboardPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "dashboard not found");
		
	}
    public void dashBoardPage(WebDriver driver) {
    	this.driver = driver;
    }
    public void clickCustomerMenuButton() {
    	CUSTOMER_ELEMENT.click();
    }
    public void clickAddCustomerButton() {
    	ADD_CUSTOMER_ELEMENT.click();
    }
}
