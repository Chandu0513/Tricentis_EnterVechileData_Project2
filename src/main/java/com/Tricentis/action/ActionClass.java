package com.Tricentis.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Tricentis.base.BaseClass;

public class ActionClass extends BaseClass{
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 20;
	
	
	public void AppLaunch(String url)
	{
		driver.get(url);
	}
	
	public void findElement(WebDriver driver, WebElement element)
	{
		element.isDisplayed();
	}
	
	
	public void enterdata(WebElement ele , String a)
	{
		ele.clear();
		ele.sendKeys(a);
	}
	
	public void selectByVisibleText( String visibletext, WebElement ele)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(visibletext);
	}
	
	public void selectByIndex(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void click(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}
	
	public void getTitle(WebDriver driver)
	{
		  driver.getTitle();
	}
	
	public void getText(WebElement element)
	{
		element.getText();
	}
	
	public String getWindowId()
	{
		return driver.getWindowHandle();
	}
	
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	
	public static void takeScreenshotForTestFailure() throws IOException
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/Screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void closeAllBrowser()
	{
		driver.quit();
	}
	
}
