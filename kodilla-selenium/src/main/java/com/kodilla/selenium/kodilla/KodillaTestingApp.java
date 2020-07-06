package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");


        WebElement inputField = driver.findElement(By.xpath("//html/body/div[1]/div/form/fieldset[1]/input"));
        inputField.sendKeys("testuser@gmail.com");

        inputField = driver.findElement(By.xpath("//html/body/div[1]/div/form/fieldset[2]/input"));
        inputField.sendKeys("haslo");

        WebElement inputButton = driver.findElement(By.xpath("//html/body/div[1]/div/form/div[2]/button"));
        inputButton.submit();

        Thread.sleep(2000);
        driver.quit();

    }
}
