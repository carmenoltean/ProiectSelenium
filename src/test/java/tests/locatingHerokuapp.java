package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class locatingHerokuapp {
    public static void main(String[] args) {
        firstLink();
        secondLink();
        thirdLink();
        fourthLink();

    }


    public static void firstLink (){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        WebElement paragraph1 = driver.findElement(By.id("para1"));
        System.out.println(paragraph1.getText());

        WebElement paragraph2 = driver.findElement(By.xpath("//*[@id=\"para2\"]"));
        System.out.println(paragraph2.getText());
        driver.quit();
    }
    public static void secondLink () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/attributes-test.html");

        WebElement paragraph1 = driver.findElement(By.id("domattributes"));
        System.out.println(paragraph1.getText());
        WebElement paragraph2 = driver.findElement(By.xpath("//*[@id=\"jsattributes\"]"));
        System.out.println(paragraph2.getText());
        WebElement paragraph3 = driver.findElement(By.id("jsautoattributes"));
        System.out.println(paragraph3.getText());
        WebElement greenButton = driver.findElement(By.cssSelector("body > div > div:nth-child(13) > button"));
        greenButton.click();

        driver.quit();
    }
    public static void thirdLink () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

        WebElement paragraphText = driver.findElement(By.id("p3"));
        System.out.println(paragraphText.getText());
        WebElement paragraphNested = driver.findElement(By.id("div2"));
        System.out.println(paragraphNested.getText());
        WebElement link = driver.findElement(By.id("li1"));
        link.click();
        System.out.println(link.getText());
        WebElement footerElement = driver.findElement(By.xpath("/html/body/div[3]/div/a[1]"));
        footerElement.click();

        driver.quit();

    }
    public static void fourthLink () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/webdriver-example-page?number-entry=");
        WebElement paragraph1 = driver.findElement(By.id("para1"));
        System.out.println(paragraph1.getText());
        WebElement paragraph2 = driver.findElement(By.id("para2"));
        System.out.println(paragraph2.getText());
        WebElement list = driver.findElement(By.id("main-example-list"));
        System.out.println(list.getText());

        Duration timeout = Duration.ofSeconds(3);
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        WebElement numbersEntry = wait.until(ExpectedConditions.elementToBeClickable(By.id("numentry")));
        numbersEntry.sendKeys("9", "5", "3");

        WebElement submitNumbers = driver.findElement(By.id("submit-to-server"));
        submitNumbers.click();
        WebElement firstButton = driver.findElement(By.id("show-as-alert"));
        firstButton.click();
        WebElement secondButton = driver.findElement(By.id("show-as-para"));
        secondButton.click();
        WebElement thirdButton = driver.findElement(By.id("clickable-link"));
        thirdButton.click();
        driver.quit();

    }
}
