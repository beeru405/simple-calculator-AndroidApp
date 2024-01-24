import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Existing test code...
    }

    @Test
    public void testSubtraction() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8080/calculator-app/");

            WebElement inputA = driver.findElement(By.id("inputA"));
            WebElement inputB = driver.findElement(By.id("inputB"));
            WebElement subtractButton = driver.findElement(By.id("subtractButton"));
            WebElement result = driver.findElement(By.id("result"));

            inputA.sendKeys("8");
            inputB.sendKeys("3");
            subtractButton.click();

            assertEquals("6", result.getText());
        } finally {
            driver.quit();
        }
    }

    @Test
    public void testMultiplication() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8080/calculator-app/");

            WebElement inputA = driver.findElement(By.id("inputA"));
            WebElement inputB = driver.findElement(By.id("inputB"));
            WebElement multiplyButton = driver.findElement(By.id("multiplyButton"));
            WebElement result = driver.findElement(By.id("result"));

            inputA.sendKeys("4");
            inputB.sendKeys("5");
            multiplyButton.click();

            assertEquals("20", result.getText());
        } finally {
            driver.quit();
        }
    }

    @Test
    public void testDivision() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8080/calculator-app/");

            WebElement inputA = driver.findElement(By.id("inputA"));
            WebElement inputB = driver.findElement(By.id("inputB"));
            WebElement divideButton = driver.findElement(By.id("divideButton"));
            WebElement result = driver.findElement(By.id("result"));

            inputA.sendKeys("15");
            inputB.sendKeys("3");
            divideButton.click();

            assertEquals("5", result.getText());
        } finally {
            driver.quit();
        }
    }

    // Add more test cases as needed...
}
