import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Lab02 {
    EdgeDriver d=new EdgeDriver();

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        d = new EdgeDriver(options);
    }

    @Test
    public void print_details()
    {
        d.manage().window().maximize();
        d.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        d.findElement(By.cssSelector("input[role^='comb']")).sendKeys("macmini");
        d.findElement(By.className("btn")).click();
        //to print all macmini products
       List<WebElement> products= d.findElements(By.xpath("//div[@class='s-item__title']"));
//
//        for( WebElement product : products)
//        {
//            System.out.println(product.getText());
//        }
//        //To print all prices
      List<WebElement> prices= d.findElements(By.xpath("//span[@class='s-item__price']"));
//        for( WebElement price : prices)
//        {
//            System.out.println(price.getText());
//        }

        int size=Math.min(products.size(),prices.size());
        for(int i=0;i<size;i++)
        {
            System.out.println(products.get(i).getText() + " || " + prices.get(i).getText());
        }
    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        d.quit();
    }
}
