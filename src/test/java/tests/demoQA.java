package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.datatransfer.Clipboard;
import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class demoQA {
    public static void main(String[] args){
        TextBox();
        CheckBox();
        RadioButton();
        WebTables();
        Buttons();
        Links();
        Links2();
    }


    public static void TextBox() {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement textBoxButton = driver.findElement(By.cssSelector("#item-0"));
        textBoxButton.click();
        Duration timeout = Duration.ofSeconds(3);
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        WebElement emailAddress = wait.until(ExpectedConditions.elementToBeClickable(By.id("userEmail")));
        emailAddress.sendKeys("carmenoltean79@gmail.com");
        WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#currentAddress")));
        address.sendKeys("Timisoara");
        driver.quit();

    }

    public static void CheckBox() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        WebElement CheckBoxButton = driver.findElement(By.id("item-1"));
        CheckBoxButton.click();
        Duration timeout = Duration.ofSeconds(3);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement HomeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/span/button")));
        HomeButton.click();
        WebElement plusButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tree-node\"]/div/button[1]")));
        plusButton.click();
        WebElement minusButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div/button[2]")));
        minusButton.click();
        driver.quit();
    }
    public static void RadioButton () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        WebElement RadioButton = driver.findElement(By.id("item-2"));
        RadioButton.click();
        Duration timeout = Duration.ofSeconds(3);
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        WebElement ImpressiveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")));
        ImpressiveButton.click();
        WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]"));
        System.out.println(text.getText());
        driver.quit();

    }

    public static void WebTables () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        WebElement WebTables = driver.findElement(By.id("item-3"));
        WebTables.click();
        Duration timeout = Duration.ofSeconds(3);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement AddButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("addNewRecordButton")));
        AddButton.click();
        //WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[1]")));
        //firstName.sendKeys("Bogdan");

        WebElement CloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-header > button")));
        CloseButton.click();
    }
    public static void Buttons () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement Buttons = driver.findElement(By.id("item-4"));
        Buttons.click();
        Duration timeout = Duration.ofSeconds(3);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement ClickMe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")));
        ClickMe.click();
        driver.quit();
    }
     public static void Links() {
         WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://demoqa.com/links");
         WebElement Links = driver.findElement(By.id("item-5"));
         Links.click();
         Duration timeout = Duration.ofSeconds(3);
         WebDriverWait wait = new WebDriverWait(driver, timeout);
         WebElement HomeLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[1]/a")));
         HomeLink.click();
         driver.quit();
     }

        public static void Links2(){
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/links");
            WebElement Links = driver.findElement(By.id("item-5"));
            Links.click();
            Duration timeout = Duration.ofSeconds(3);
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            WebElement CreatedLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[3]/a")));
            CreatedLink.click();
            List<WebElement> H5Paragraphs = driver.findElements(By.tagName("H5"));
            System.out.println(H5Paragraphs.size());
            String textDeCautare = "links";
            WebElement firstParagraph = H5Paragraphs.get(0);
            String firstParagraphText = firstParagraph.getText();
            assertThat(firstParagraphText).contains(textDeCautare);

            WebElement paragraph = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/h5[2]/strong"));
            System.out.println(paragraph.getText());


}



}
