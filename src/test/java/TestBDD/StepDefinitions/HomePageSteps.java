package TestBDD.StepDefinitions;

import TestBDD.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Browser is open")
    public void browser_is_open() {
        homePage.openHomePage();
    }

    @Given("I am on the main site")
    public void i_am_on_the_main_site() {
        String name = homePage.getBankName();
        Assertions.assertEquals("Guru99 Bank", name);
    }

    //@When("Wait for cookie confirmation")
   // public void waitForCookieConfirmation() {
     //   homePage.cookieConfirmationDiv();
   // }
    @When("Click cookie confirmation")
    public void clickCookieConfirmation() {
        homePage.clickCookieConfirmation();
    }


    @When("Fill name input with {string}")
    public void fillNameInputWith(String name) {
        homePage.inputName(name);
    }
    @When("Fill password input with  {string}")
    public void inputPassword(String password) {
        homePage.inputPassword(password);
    }

    @When("Click login button")
    public void clickLoginButton() {
        homePage.clickLoginButton();

    }

    @Then("Wait for the welcome inscription")
    public void waitForTheWelcomeInscription() {
        String nazwa = homePage.getWelcomeInscription();
        Assertions.assertEquals("Guru99 Bank", nazwa);
    }

    @When("Wait for login button")
    public void waitForLoginButton() {homePage.waitForLoginButton();
    }
}


