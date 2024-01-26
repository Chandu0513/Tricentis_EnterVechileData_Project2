package com.Tricentis.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Tricentis.action.ActionClass;
import com.Tricentis.base.BaseClass;
import com.Tricentis.pages.Truck_EnterProductDataPage_US004;
import com.Tricentis.utilities.ExtentClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.Tricentis.utilities.Listener.class)

public class US004_TestCases {
	
	Truck_EnterProductDataPage_US004 product=new Truck_EnterProductDataPage_US004();
	ExtentClass extentObj = new ExtentClass();
	ExtentReports extent = null;
	ExtentTest test = null;
	String screenshotspath = null;
	
	@BeforeSuite
	public void reports()
	{
		extent = extentObj.getExtentReportInstance(product.loadconfig("testCaseReportPath")+this.getClass().getName()+".html");
		test = extentObj.startTest("Launched US_004 Tests", extent);
		test.log(LogStatus.PASS, "Tests Started");
	}
	
	@BeforeMethod
	public void launch()
	{
		product.browserLaunch();
		product.initElements();
		screenshotspath = product.loadconfig("screenshotspath");
	}
	
	@Test(priority = 0)
	public void TC_001() throws IOException 
	{
		try {
		test = extentObj.startTest("Validate truck tab from header", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		product.ValidateTruckTab();
        System.out.println("Truck tab is opened");
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
		test.log(LogStatus.PASS, "Verified Truck From Header");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_001");
		}		
		test.log(LogStatus.PASS, "Verified Truck tab");
	}
	
	
	@Test(priority = 1)
	public void TC_002() throws IOException 
	{
		try {
		test = extentObj.startTest("Validate enter product data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		product.ValidateProductPageTab();
		System.out.println("Landed On Enter Product Data Tab Page ");
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Product Data");
		test.log(LogStatus.PASS, "Verified Enter Product Data");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_002");
		}		
		test.log(LogStatus.PASS, "Verified product data enter tab");
	}
	
	@Test(priority = 2)
	public void TC_003() throws IOException 
	{
		
		try {
		test = extentObj.startTest("Validate insurance sum", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		product.ValidateInsuranceSumField();
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Product Data");
		Assert.assertTrue(product.InsuranceSumBlueTick.isDisplayed());
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_003");
		}		
		test.log(LogStatus.PASS, "Verified Insurance Sum[$] field");
	}
	
	@Test(priority = 3)
	public void TC_004() throws IOException 
	{
		
		try {
		test = extentObj.startTest("Validate damage insurance", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		product.ValidateDamageInsuranceField();
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Product Data");
		Assert.assertTrue(product.DamageInsuranceBlueTick.isDisplayed());
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_004");
		}		
		test.log(LogStatus.PASS, "Verified Damage Insurance field");
	}
	

	@Test(priority = 4)
	public void TC_005() throws IOException 
	{
		try {
		test = extentObj.startTest("Valiadte Optional product", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		product.ValidateOptionalProduct();
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Product Data");
		Assert.assertTrue(product.OptinalBlueTick.isDisplayed());
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_005");
		}		
		test.log(LogStatus.PASS, "Verified Optinal products field");
	}
	
	@Test(priority = 5)
	public void TC_006() throws IOException 
	{
		try {
		test = extentObj.startTest("Validate start date field red color", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		product.ValidateStartDateField();
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Product Data");
		Assert.assertTrue(product.DateThisFieldMandatory.isDisplayed());
		product.enterdata(product.startdate, "01/16/2024");
		Assert.assertTrue(product.DateFieldRed.isDisplayed());
		Assert.assertTrue(product.Mustbemorethanonemonthinfuture.isDisplayed());
		test.log(LogStatus.PASS, "Verified Start Date With Invalid Data ' 01/16/2024'");
		test.log(LogStatus.PASS, "Verified  Error Message");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_006");
		}		
		test.log(LogStatus.PASS, "Verified Start date field");
	}
	
	
		@Test(priority = 6)			//Verify Start Date With valid Data    //Verify Start Date Text Field Blue With Tick
		public void TC_007() throws IOException 
		{
			try {
				test = extentObj.startTest("Validate start date field blue color", extent);
				test.log(LogStatus.PASS, "Browser is launched");
				test.log(LogStatus.PASS, "Tricentis application is launched");
				product.ValidateStartDateField();
				Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Product Data");
				product.enterdata(product.startdate, "03/16/2024");
				Assert.assertTrue(product.DateFieldBlueWithTick.isDisplayed());
				test.log(LogStatus.PASS, "Verified Start Date With Invalid Data ' 03/16/2024'");
				test.log(LogStatus.PASS, "Verified  Start Date Filed is Blue With Tick ");
				}catch(Exception e)
				{
				ActionClass.takeScreenshotForTestFailure();
				test.log(LogStatus.FAIL, "Test failed: " +"TC_007");
				}		
				test.log(LogStatus.PASS, "Verified Start date field");
		}
		
		@Test(priority = 7)
		public void TC_008() throws IOException 
		{		
			try {
			test = extentObj.startTest("Validate ", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			product.ValidateDefect();
			}catch(Exception e)
			{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " +"TC_008");
			}		
			test.log(LogStatus.PASS, "Verified Start Date field");
		}
		
		@Test(priority = 8)
		public void TC_009() throws IOException 
		{
			try {
				test = extentObj.startTest("Validate * message", extent);
				test.log(LogStatus.PASS, "Browser is launched");
				test.log(LogStatus.PASS, "Tricentis application is launched");
				product.InsuranceStarMessage();
				Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Product Data");
				Assert.assertTrue(product.InsuranceMessage.isDisplayed());
				test.log(LogStatus.PASS, "verifed Insurance Sum * message");
				product.DamageStarMessage();
				Assert.assertTrue(product.DamageMessage.isDisplayed());
				test.log(LogStatus.PASS, "verifed Damage Insurance * message");
				product.OptionalStarMessage();
				Assert.assertTrue(product.Optionalmessage.isDisplayed());
				test.log(LogStatus.PASS, "verifed Optional products * message");
			}catch(Exception e)
			{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " +"TC_009");
			}		
			test.log(LogStatus.PASS, "Verified Start Date field");
		}
		
		
		@AfterMethod
		public void teardwn()
		{
			product.closeBrowser();
			test.log(LogStatus.PASS, "Browser is closed");
		}
		
		@AfterSuite
		public void FlushReoprts()
		{
			extentObj.endTest(test, extent);
			extentObj.flushReport(extent);
		}
		
	
}
