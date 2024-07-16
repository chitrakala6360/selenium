package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment3 {
    EdgeDriver driver=new EdgeDriver();
    @Test
    public void testcase_login() throws InterruptedException {

        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("augtest_040823@idrive.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("frm-btn")).click();
        Thread.sleep(30000);
        //String text=driver.findElement(By.xpath("//span[text()='Your free trial has expired']")).getText();
       // System.out.println(text);
        List<WebElement> text=driver.findElements(By.xpath("//*[text()='Your free trial has expired']"));
         String text1=text.get(0).getText();
        System.out.println(text1);
       Assert.assertEquals(text1,"Your free trial has expired");

    }
}
