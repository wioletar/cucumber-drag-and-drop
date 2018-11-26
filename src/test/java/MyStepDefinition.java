import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DroppablePage;
import pages.MainMenuPage;

public class MyStepDefinition extends BaseTest {

    MainMenuPage mainMenuPage;
    DroppablePage droppablePage;

    @Given("^Open Droppable subpage$")
    public void open_droppable_subpage() throws Throwable {
        mainMenuPage = new MainMenuPage(driver);
        droppablePage = new DroppablePage(driver);
        mainMenuPage.openDroppable();
        throw new PendingException();
    }

    @Given("^Switch to frame$")
    public void switch_to_frame() throws Throwable {
        droppablePage.swtichToFrame();
        throw new PendingException();
    }

    @When("^Drag and drop box$")
    public void drag_and_drop_box()  {
       droppablePage.dragAndDrop();
    }

    @Then("^Verify if appears Dropped! text$")
    public void verify_if_appears_dropped_text() {
        droppablePage.verifySuccess();
    }
}
