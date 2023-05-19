import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;



public class Main{
    WebDriver driver;
    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test()
    public void Login() throws InterruptedException {
       Login LoginPage = new Login(driver);
        driver.get("https://leetcode.com/problemset/all/");
        LoginPage.SignInLink();
        LoginPage.user_login("200103125@stu.sdu.edu.kz");
        LoginPage.user_password("Sikow.2020");
        Thread.sleep(2000);
        LoginPage.SignBtn();
        Thread.sleep(2000);
        Assert.assertEquals(LoginPage.CurrentUrl(), "https://leetcode.com/problemset/all/");
    }
    @Test(priority = 1)
    public void SolvingProblem() throws InterruptedException {
        SolvingProblem SolveProblem = new SolvingProblem(driver);
        driver.get("https://leetcode.com/problemset/all/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(2000);
        SolveProblem.ProblemLink();
        Thread.sleep(5000);
        SolveProblem.LanguageChoose();
        Thread.sleep(5000);
        SolveProblem.Java();
        SolveProblem.ChooseEditor();
        Thread.sleep(2000);
        SolveProblem.SendSolution("Aruzhan");
    }
    @Test(priority = 2)
    public void FilteringProblems() throws InterruptedException {
        FilteringProblems Filter = new FilteringProblems(driver);
        driver.get("https://leetcode.com/problemset/all/");
        Thread.sleep(2000);
        Filter.ChooseString();
        Thread.sleep(2000);
        Filter.ChooseProblem();
    }
}

