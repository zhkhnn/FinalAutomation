package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(id = "navbar_sign_in_button")
    WebElement SignIn;
    @FindBy(id = "id_login")
    WebElement Login;
    @FindBy(id = "id_password")
    WebElement password;

    @FindBy(xpath = "//*[@id='signin_btn']/div/span")
    WebElement SignInBtn;


    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SignInLink(){
        SignIn.click();
    }
    public void user_login(String login){
        Login.sendKeys(login);
    }
    public void user_password(String pass){
        password.sendKeys(pass);
    }
    public void SignBtn(){
        SignInBtn.click();
    }
    public String CurrentUrl(){
        return driver.getCurrentUrl();
    }

}
