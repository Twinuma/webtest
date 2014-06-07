package jp.art.flagshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://art.flagshop.jp/");
		sleep(10000);
		driver.findElement(By.cssSelector("ul.globalMenuNormal li:first-child")).click();
		driver.quit();
	}

	/**
	 * 待機時間設定
	 * @param microtime
	 */
	private static void sleep(int microtime) {
		try {
            Thread.sleep(microtime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
