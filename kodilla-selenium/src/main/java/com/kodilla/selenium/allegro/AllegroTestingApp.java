package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement inputButton = driver.findElement(By.xpath("//html/body/div[3]/div[8]/div/div[2]/div/div[2]/button[2]"));
        inputButton.click();

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"_r65gb mp7g_oh\"]/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement categoryInput = driver.findElement(By.xpath("//div[@data-box-id=\"h4GzErVDTJybCQTEmPd4NA==bo4mG6sXTzKqaApDskeC1g==\"]/div/form/input"));
        categoryInput.sendKeys("Mavic mini");
        categoryInput.submit();


        Thread.sleep(6000);
        driver.quit();
    }
}
