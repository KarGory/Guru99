package TestBDD.Pages;

import TestBDD.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public final WebDriver driver;

    public BasePage(){
        this.driver = DriverManager.driver;
        PageFactory.initElements(this.driver,this);
    }
}
