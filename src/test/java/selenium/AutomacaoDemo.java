
package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoDemo {
    String FullName = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    String LastName = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    String Address =  "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    String EmailAddress =  "//*[@id='eid']/input";
    String Phone =    "//*[@id='basicBootstrapForm']/div[4]/div/input";
    String Gender =  "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input";
    String Hobbies =  "//*[@id='checkbox2']";
    String Skills =  "//*[@id='Skills']";
    String Android = "//*[@id='Skills']/option[5]";
    String Country = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span";
    String SouthAfrica = "//*[@id='select2-country-results']/li[10]";
   






    @Test
    public void testeAberturaNavegador() throws InterruptedException{
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();        
        drive.get("https://demo.automationtesting.in/Register.html");

       // Thread.sleep(6000);   
        drive.findElement(By.xpath(FullName)).click();;
        drive.findElement(By.xpath(FullName)).sendKeys("Luciana Janaina");

       // Thread.sleep(6000);   
        drive.findElement(By.xpath(LastName)).click();;
        drive.findElement(By.xpath(LastName)).sendKeys("Polita");

       // Thread.sleep(6000);   
        drive.findElement(By.xpath(Address)).click();;
        drive.findElement(By.xpath(Address)).sendKeys("Rua Francisco Chaves Pinheiro, 115 casa 04");
        
       // Thread.sleep(6000);   
        drive.findElement(By.xpath(EmailAddress)).click();;
        drive.findElement(By.xpath(EmailAddress)).sendKeys("lucianapolita@outlook.com");
        
       // Thread.sleep(6000);   
        drive.findElement(By.xpath(Phone)).click();;
        drive.findElement(By.xpath(Phone)).sendKeys("11983276127");

       // Thread.sleep(6000);   
        drive.findElement(By.xpath(Gender)).click();;
       // Thread.sleep(6000);   
        drive.findElement(By.xpath(Hobbies)).click();;

       JavascriptExecutor js = (JavascriptExecutor) drive;
       js.executeScript("window.scrollBy(0,400)", "");

       
        // Thread.sleep(6000);   
        drive.findElement(By.xpath(Skills)).click();;
        drive.findElement(By.xpath(Android)).click();;
        drive.findElement(By.xpath(Skills)).click();;

        Thread.sleep(6000);   
        drive.findElement(By.xpath(Country)).click();;
        drive.findElement(By.xpath(SouthAfrica)).click();;
        drive.findElement(By.xpath(Country)).click();;

        
        







    }

}