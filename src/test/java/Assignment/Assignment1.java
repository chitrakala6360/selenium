package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment1 {
    EdgeDriver driver=new EdgeDriver();

    @Test
    public void negitve_login() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("chitra@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("admin@123");
        //driver.findElement(By.className("ng-scope")).click();
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(1000);
        String text=driver.findElement(By.id("js-notification-box-msg")).getText();
        System.out.println(text);
    }
    @Test
    public void new_login()
    {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.className("text-link")).click();
        driver.findElement(By.name("email")).sendKeys("chitra@123");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
    }
}
