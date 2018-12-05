package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.DroppablePage;
import pages.MainMenuPage;

import java.net.MalformedURLException;


public class MyStepDefinition {

    MainMenuPage mainMenuPage;
    DroppablePage droppablePage;
    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com");

    }

    @After
    public void teadDown() {
        driver.quit();
    }

    @Given("^Open drag and drop sub page$")
    public void open_drag_and_drop_sub_page() {
        mainMenuPage = new MainMenuPage(driver);
        droppablePage = new DroppablePage(driver);
        mainMenuPage.openDroppable();

    }

    @Given("^Switch to frame$")
    public void switch_to_frame() {
        droppablePage.swtichToFrame();

    }

    @When("^Drag and drop box$")
    public void drag_and_drop_box()  {
       droppablePage.dragAndDrop();
    }

    @Then("^Verification if appears Dropped! text$")
    public void verification_if_appears_Dropped_text() {
        droppablePage.verifySuccess();
    }
}
