package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
    }

    @Test
    public void test() throws InterruptedException {
        System.out.println("Hello World");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/animal");
        WebElement inputField1 = driver.findElement(By.id("animalText"));
        inputField1.sendKeys("Ladybug");
        WebElement inputField2 = driver.findElement(By.id("adjective"));
        inputField2.sendKeys("silly");
        WebElement submitButton = driver.findElement(By.id("submitid"));
        submitButton.click();

        Thread.sleep(5000);
        driver.close();
    }
}
