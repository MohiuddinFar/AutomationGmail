	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Then;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GmailAutomationCucumber {
	  private WebDriver driver;

	  @Given("I am logged into Gmail")
	  public void iAmLoggedIntoGmail() {
	    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    driver = new ChromeDriver();
	    driver.get("https://www.gmail.com");
	  }

	  @When("I click on the \"Compose\" button")
	  public void iClickOnComposeButton() {
	    driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
	  }

	  @And("I enter {string} in the subject field")
	  public void iEnterSubjectInField(String subject) {
	    driver.findElement(By.name("subjectbox")).sendKeys("Incubyte Deliverables:1");
	  }

	  @And("I enter {string} in the email body")
	  public void iEnterEmailBody(String body) {
	    driver.switchTo().frame(driver.findElement(By.xpath("//div[@aria-label='Message Body']//iframe")));
	    driver.findElement(By.tagName("body")).sendKeys("Automation QA test for Incubyte");
	    driver.switchTo().defaultContent();
	  }

	  @And("I click on the \"Send\" button")
	  public void iClickOnSendButton() {
	    driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
	  }

	  @Then("the email should be sent successfully")
	  public void emailShouldBeSentSuccessfully() {
	    
	  }
	}

}
