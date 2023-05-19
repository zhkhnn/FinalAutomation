package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SolvingProblem {
    WebDriver driver;

    @FindBy(xpath = "//*[@href='/problems/two-sum/']")
    WebElement Problem;
    @FindBy(xpath = "//button[contains(@id, 'listbox')]")
    WebElement LanguageBtn;
    @FindBy(xpath = "//div[text()='Java']")
    WebElement JavaBtn;

    @FindBy(xpath = "//*[@id='editor']/div[4]/div[1]/div/div/div[1]/div[2]/div[1]/div[4]/div[3]")
    WebElement Editor;


    public SolvingProblem(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ProblemLink(){
        Problem.click();
    }
    public void LanguageChoose(){
        LanguageBtn.click();
    }
    public void Java(){
        JavaBtn.click();
    }
    public void ChooseEditor(){
        Editor.click();
    }
    public void SendSolution(String solution){
        Editor.sendKeys(solution);
    }

}
