package TestBDD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    @FindBy(how = How.CLASS_NAME, using = "barone")
    WebElement BankName;
   // @FindBy(how = How.ID_OR_NAME, using = "gdpr-consent-notice")
   // WebElement cookieConfirmationDiv;

    @FindBy(how = How.ID_OR_NAME, using = "save")
    WebElement getCookieConfirmation;

    @FindBy(how = How.NAME, using = "uid")
    WebElement nameInput;
    @FindBy(how = How.NAME, using = "password")
    WebElement passwordInput;
    @FindBy(how = How.ID_OR_NAME, using = "btnLogin")
    WebElement loginButton;

    @FindBy(how = How.CLASS_NAME, using = "heading3")
    WebElement WelcomeInscription;



    public void openHomePage() {
        String HOMEPAGE_URL = "https://demo.guru99.com/v4/index.php";
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(BankName));
    }
    public String getBankName() {
        return BankName.getText();
    }


    public void clickCookieConfirmation(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(getCookieConfirmation));


    }
    public void inputName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }
    public void inputPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();

    }

    public String getWelcomeInscription() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(WelcomeInscription));
        return null;
    }


    public void waitForLoginButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(loginButton));
    }
}


