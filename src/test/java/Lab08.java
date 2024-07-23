import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab08 {
    EdgeDriver d=new EdgeDriver();

    @Test
    public void testcase(){

        d.get("https://awesomeqa.com/webtable.html");
//      List<WebElement> rows=  d.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//      for( WebElement row : rows)
//      {
//          System.out.println(row.getText());
//"//table[@id='customers']/tbody/tr[3]/td[2]/following-sibling::td"

//       WebElement text= d.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]/following-sibling::td"));
//        System.out.println(text.getText());

        int row=d.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col=d.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
        String first_path="//table[@id='customers']/tbody/tr[";
        String second_path="]/td[";
        String third_path="]";
        for(int i=2;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                String dynamic_xpath = first_path+i+second_path+j+third_path;
                String data=d.findElement(By.xpath(dynamic_xpath)).getText();
                //System.out.println(data);
                String country_path=dynamic_xpath+"/following-sibling::td";
                if(data.contains("Helen Bennett"))
                {
                    String country=d.findElement(By.xpath(country_path)).getText();
                    System.out.println(country);
                }

            }
        }
    }
}
