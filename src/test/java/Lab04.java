import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab04 {
    EdgeDriver d=new EdgeDriver();

    @Test
    public void fluentwait_testcase()
    {
        d.get("https://app.vwo.com/#/login");
        d.findElement(By.id("login-username")).sendKeys("contact+atb7x@thetestingacademy.com");
        d.findElement(By.id("login-password")).sendKeys("Wingify@1234");
        d.findElement(By.id("js-login-btn")).click();
        Wait<EdgeDriver> wait = new FluentWait<>(d)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)) //5 Times
                .ignoring(NoSuchElementException.class);

        WebElement loggedin_username = wait.until(driver -> driver.findElement(By.cssSelector("[data-qa='lufexuloga']")));


        System.out.println("Logged in User details -> " + loggedin_username.getText());
        Assert.assertEquals(loggedin_username.getText(),"Aman Ji");
    }
}
