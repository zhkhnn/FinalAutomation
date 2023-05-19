package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FilteringProblems {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='__next']/div/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a")
    WebElement String;
    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/a")
    WebElement Problem;


    public FilteringProblems(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ChooseString(){
        String.click();
    }
    public void ChooseProblem(){
        Problem.click();
    }


}
