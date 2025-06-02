import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        System.out.println("testing good login");
        driver.get("https://letsusedata.com/index.html");

        WebElement user = driver.findElement(By.id("txtUser"));
        WebElement pass = driver.findElement(By.id("txtPassword"));
        user.sendKeys("test1");
        pass.sendKeys("Test12456" + Keys.ENTER);

        Thread.sleep(3000);

        String url = driver.getCurrentUrl();
        if (url.contains("CourseSelection.html")) {
            System.out.println("login passed");
        } else {
            System.out.println("login failed");
        }
        driver.quit();

        WebDriver driver2 = new ChromeDriver();
        System.out.println("testing bad login");
        driver2.get("https://letsusedata.com/index.html");
        Thread.sleep(1000);

        WebElement badUser = driver2.findElement(By.id("txtUser"));
        WebElement badPass = driver2.findElement(By.id("txtPassword"));
        badUser.sendKeys("test1");
        badPass.sendKeys("test1234" + Keys.ENTER);
        Thread.sleep(3000);

        String Page = driver2.getPageSource().toLowerCase();
        if (Page.contains("password was incorrect")) {
            System.out.println("Log in Failed");
        } else {
            System.out.println("Log in failed but no incorrect sign found");
        }
    }}
