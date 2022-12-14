package ninjatutorials.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginstepdefi {
    public WebDriver ldriver;
    public void loginpageobjects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(name="email")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
    WebElement submit;

    public void usernameset(String email)
    {
        username.sendKeys(email);
    }
    public void passwordset(String pwd)
    {
        password.sendKeys(pwd);
    }
    public void submitclick()
    {
        submit.click();
    }
}
