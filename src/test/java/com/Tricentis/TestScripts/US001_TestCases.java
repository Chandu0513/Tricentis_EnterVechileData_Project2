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
import com.Tricentis.pages.Automobile_EnterVehicleDataPage_US001;
import com.Tricentis.utilities.ExtentClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.Tricentis.utilities.Listener.class)

public class US001_TestCases {
	
	Automobile_EnterVehicleDataPage_US001 VehicleObj = new Automobile_EnterVehicleDataPage_US001();
	ExtentClass extentObj = new ExtentClass();
	ExtentReports extent = null;
	ExtentTest test = null;
	String screenshotspath = null;
	
	@BeforeSuite
	public void reports()
	{
		extent = extentObj.getExtentReportInstance(VehicleObj.loadconfig("testCaseReportPath")+this.getClass().getName()+".html");
		test = extentObj.startTest("Launched US_001 Tests", extent);
		test.log(LogStatus.PASS, "Tests Started");
	}
	
	@BeforeMethod
	public void launch()
	{
		VehicleObj.browserLaunch();
		VehicleObj.initElements();
		screenshotspath = VehicleObj.loadconfig("screenshotspath");
	}
	
	
	
	@Test  (priority = 0)   // Validation for Automobile tab from header
	public void TestCase1() throws IOException 
	{
		try {
		test = extentObj.startTest("Header verification", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.HeaderTab();
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
		
		test.log(LogStatus.PASS, "Verified Automobile tab");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_001");
		}		
	}
	
	
	@Test (priority = 1)   // Validation for drop down in Make field
	public void TestCase2() throws IOException 
	{
		try {
		test = extentObj.startTest("Make field  dropdown list verification", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateMakeFieldDropdown();
		Assert.assertTrue(VehicleObj.makefield.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified dropdown list for Make field");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_002");
		}		
	}
	
	
	@Test (priority = 2)  // Validation for message beside Make field
	public void TestCase3() throws IOException 
	{
		try {
		test = extentObj.startTest("Beside Make field message verification", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateMakeFieldMessage();
		Assert.assertEquals(VehicleObj.MakeMessage.getText(),"Select an option");
		
		test.log(LogStatus.PASS, "Verified that beside Make field message is displayed");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_003");
		}		
	}
	
	
	@Test (priority = 3)   // Validation for Make Field box color with invalid data
	public void TestCase4() throws IOException 
	{
		try {
		test = extentObj.startTest("Make field box color verification ", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateMakeBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.MakeRedBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering invalid data box color turned into red");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_004");
		}		
	}
	
	
	@Test (priority = 4) // Validation for Make Field box color with valid data
	public void TestCase5() throws IOException 
	{
		try {
		test = extentObj.startTest("Make field box colour verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateMakeBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.MakeBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_005");
		}		
	}
	
	
	@Test  (priority = 5)	// Validation for message beside Engine Performance field
	public void TestCase6() throws IOException 
	{
		try {
		test = extentObj.startTest("Message verification beside Engine Performance field", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateEnginePrfmncMessage();
		Assert.assertEquals(VehicleObj.EPMessage.getText(),"This field is mandatory");
		
		test.log(LogStatus.PASS, "Verified that message is displayed beside Engine Performance field ");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_006");
		}		
	}
	
	
	@Test (priority = 6)// Validation for error message in Engine Performance Field 
	public void TestCase7() throws IOException 
	{
		try {
		test = extentObj.startTest(" Verification for error message in Engine Performance  field", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateEnginePrfmncErrMsg();
		VehicleObj.enterdata(VehicleObj.EnginePerformanceField,"abc");
		Assert.assertEquals(VehicleObj.ErrEPMessage.getText(),"Must be a number between 1 and 2000");
		
		VehicleObj.enterdata(VehicleObj.EnginePerformanceField,"0");
		Assert.assertEquals(VehicleObj.ErrEPMessage.getText(),"Must be a number between 1 and 2000");
		
		VehicleObj.enterdata(VehicleObj.EnginePerformanceField,"2001");
		Assert.assertEquals(VehicleObj.ErrEPMessage.getText(),"Must be a number between 1 and 2000");
		
		test.log(LogStatus.PASS, "Verified error message beside Engine Performance field");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_007");
		}		
	}
	
	
	@Test  (priority = 7) // Validation for Engine Performance field box color with valid data
	public void TestCase8() throws IOException 
	{
		try {
		test = extentObj.startTest("Engine Performance box colour verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateEnginePrfmncBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.EPBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_008");
		}		
	}
	
	
	@Test (priority = 8)   // Validation for Engine Performance field box color with invalid data
	public void TestCase9() throws IOException 
	{
		try {
		test = extentObj.startTest("Engine Performance box colour verification with invalid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateEnginePrfmncBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.EPRedBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering invalid data box color turned into red colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_009");
		}		
	}
	
	
	@Test (priority = 9)   // Validation for message beside Date of Manufacture field
	public void TestCase10() throws IOException 
	{
		try {
		test = extentObj.startTest("Message verification beside Date of Manufacture field ", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateDateOfMnfctrMsg();
		Assert.assertEquals(VehicleObj.DateOfMnfctrMessage.getText(), "This field is mandatory");
		
		test.log(LogStatus.PASS, "Verified message beside Date of Manufacture field");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_010");
		}		
	}
	
	
	@Test (priority = 10)   // Validation for date manually enter in Date of Manufacture field
	public void TestCase11() throws IOException 
	{
		try {
		test = extentObj.startTest("Verify can data enter manually in Date of Manufacture field ", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateEnterDateManually();
		Assert.assertTrue(VehicleObj.DateOfMnfctrBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified Date of Manufacture field is accepting data entered by user manually");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_011");
		}		
	}
	
	@Test (priority = 11)   // Validation for error message after selecting date from future
	public void TestCase12() throws IOException, InterruptedException 
	{
		try {
		test = extentObj.startTest("Verify error message after selecting date from future ", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateDateOfMnfctrErrorMsg();
		Assert.assertEquals(VehicleObj.DateOfMnfctrErrorMsg.getText(),"Must be today or somewhere in the past");
		
		test.log(LogStatus.PASS, "Verified error message beside Date of Manufacture field after selecting date from future ");
 		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_012");
		}		
	}
	
	
	@Test (priority = 12)    // Validation for Date of Manufacture field box color with valid data
	public void TestCase13() throws IOException, InterruptedException 
	{
		try {
		test = extentObj.startTest("Date of Manufacture field box colour verification with valid data ", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateDateOfMnfctrBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.DateOfMnfctrBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue colour");
 		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_013");
		}		
	}
	
	
	@Test (priority = 13)   // Validation for Date of Manufacture field box color with invalid data
	public void TestCase14() throws IOException, InterruptedException 
	{
		try {
		test = extentObj.startTest("Date of Manufacture field box colour verification with invalid data ", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateDateOfMnfctrBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.DateOfMnfctrRedBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue colour");
 		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_014");
		}		
	}
	
	
	@Test (priority = 14) // Validation for drop down in Make field
	public void TestCase15() throws IOException 
	{
		try {
		test = extentObj.startTest("Number of Seats field  dropdown list verification", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateNoOSeatsDropdown();
		Assert.assertTrue(VehicleObj.numberofseats.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified dropdown list for Number of Seats");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_015");
		}		
	}
	
	
	@Test (priority = 15) // Validation for message beside Number of Seats field
	public void TestCase16() throws IOException 
	{
		try {
		test = extentObj.startTest("Beside Number of Seats field message verification", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateNoOSeatsFieldMessage();
		Assert.assertEquals(VehicleObj.NoOfSeatMessage.getText(),"Select an option");
		
		test.log(LogStatus.PASS, "Verified that beside Number of Seats field message is displayed");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_016");
		}		
	}
	
	
	@Test  (priority = 16)  // Validation for Number of Seats Field box color with valid data
	public void TestCase17() throws IOException 
	{
		try {
		test = extentObj.startTest("Number of Seats field box color verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateNoOSeatsBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.NoOfSeatsBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_017");
		}		
	}
	
	
	@Test(priority = 17)    // Validation for Number of Seats Field box color with invalid data
	public void TestCase18() throws IOException 
	{
		try {
		test = extentObj.startTest("Number of Seats field box color verification with invalid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateNoOSeatsBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.NoOfSeatsRedBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering invalid data box color turned into red");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_018");
		}		
	}
	
	
	@Test(priority = 18)  // Validation for drop down in Fuel Type field
	public void TestCase19() throws IOException 
	{
		try {
		test = extentObj.startTest("Fuel Type field  dropdown list verification", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatefuelDropdown();
		Assert.assertTrue(VehicleObj.fuel.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified dropdown list for Fuel Type");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_019");
		}		
	}
	
	
	@Test(priority = 19)  // Validation for message beside Fuel Type field
	public void TestCase20() throws IOException 
	{
		try {
		test = extentObj.startTest("Beside Fuel Type field message verification", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatefuelFieldMessage();
		Assert.assertEquals(VehicleObj.fuelMessage.getText(),"Select an option");
		
		test.log(LogStatus.PASS, "Verified that beside Fuel Type field message is displayed");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_020");
		}		
	}
	
	
	@Test(priority = 20)    // Validation for Fuel Type Field box color with Valid Data
	public void TestCase21() throws IOException 
	{
		try {
		test = extentObj.startTest("Fuel Type field box color verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatefuelFieldBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.fuelBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_021");
		}		
	}
	
	
	@Test  (priority = 21)  // Validation for Fuel Type Field box color with invalid Data
	public void TestCase22() throws IOException 
	{
		try {
		test = extentObj.startTest("Fuel Type field box color verification with invalid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatefuelFieldBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.fuelRedBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering invalid data box color turned into red");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_022");
		}		
	}
	
	
	@Test(priority = 22)  // Validation for message beside List Price field
	public void TestCase23() throws IOException 
	{
		try {
		test = extentObj.startTest("Message verification beside List Price field", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatelistpriceMessage();
		Assert.assertEquals(VehicleObj.listpriceMessage.getText(),"This field is mandatory");
		
		test.log(LogStatus.PASS, "Verified that message is displayed beside List Price field ");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_023");
		}		
	}
	
	
	@Test(priority = 23) // Validation for error message in List Price Field 
	public void TestCase24() throws IOException 
	{
		try {
		test = extentObj.startTest(" Verification for error message after entering invalid data in List Price field", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatelistpriceErrMsg();
		VehicleObj.enterdata(VehicleObj.listprice,"abc");
		Assert.assertEquals(VehicleObj.ErrlistpriceMessage.getText(),"Must be a number between 500 and 100000");
		
		VehicleObj.enterdata(VehicleObj.listprice,"499");
		Assert.assertEquals(VehicleObj.ErrlistpriceMessage.getText(),"Must be a number between 500 and 100000");
		
		VehicleObj.enterdata(VehicleObj.listprice,"100001");
		Assert.assertEquals(VehicleObj.ErrlistpriceMessage.getText(),"Must be a number between 500 and 100000");
		
		test.log(LogStatus.PASS, "Verified error message beside List Price field");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_024");
		}		
	}
	
	
	@Test (priority = 24)  // Validation for List Price field box color with Valid Data
	public void TestCase25() throws IOException 
	{
		try {
		test = extentObj.startTest("List Price box colour verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatelistpriceBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.listpriceBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_025");
		}		
	}
	
	
	@Test (priority = 25)   // Validation for List Price field box color with invalid Data
	public void TestCase26() throws IOException 
	{
		try {
		test = extentObj.startTest("List Price box colour verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatelistpriceBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.listpriceRedBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering invalid data box color turned into red colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_026");
		}		
	}
	
	
	@Test (priority = 26)    // Validation for error message with star field in License Plate Number Field 
	public void TestCase27() throws IOException 
	{
		try {
		test = extentObj.startTest(" Verification for error message after entering invalid data in License Plate Number  field", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatelicenseplateErrMsg();	
		Assert.assertEquals(VehicleObj.ErrMsglicenseplatenumber.getText(),"Must be under 10 characters");
		Assert.assertTrue(VehicleObj.licenseplatestaricon.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified error message beside License Plate Number field");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_027");
		}		
	}
	
	
	@Test (priority = 27)  // Validation for License Plate Number field box color with Valid Data
	public void TestCase28() throws IOException 
	{
		try {
		test = extentObj.startTest("License Plate Number box colour verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatelicenseplateBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.licenseplatenumberBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_028");
		}		
	}
	
	
	@Test (priority = 28)   // Validation for License Plate Number field box color with invalid Data
	public void TestCase29() throws IOException 
	{
		try {
		test = extentObj.startTest("License Plate Number box colour verification with invalid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidatelicenseplateBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.licenseplatenumberRebBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering invalid data box color turned into red colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_029");
		}		
	}
	
	
	@Test(priority = 29)  // Validation for message beside Annual Mileage field
	public void TestCase30() throws IOException 
	{
		try {
		test = extentObj.startTest("Message verification beside Annual Mileage field", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateannualmileageMessage();
		Assert.assertEquals(VehicleObj.annualmileageMessage.getText(),"This field is mandatory");
		
		test.log(LogStatus.PASS, "Verified that message is displayed beside Annual Mileage field ");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_030");
		}		
	}
	
	
	@Test (priority = 30)   // Validation for error message in Annual Mileage Field 
	public void TestCase31() throws IOException 
	{
		try {
		test = extentObj.startTest(" Verification for error message in Annual Mileage field", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateannualmileageErrMsg();
		VehicleObj.enterdata(VehicleObj.annualmileage,"abc");
		Assert.assertEquals(VehicleObj.ErrannualmileageMessage.getText(),"Must be a number between 100 and 100000");
		
		VehicleObj.enterdata(VehicleObj.annualmileage,"99");
		Assert.assertEquals(VehicleObj.ErrannualmileageMessage.getText(),"Must be a number between 100 and 100000");
		
		VehicleObj.enterdata(VehicleObj.annualmileage,"100001");
		Assert.assertEquals(VehicleObj.ErrannualmileageMessage.getText(),"Must be a number between 100 and 100000");
		
		test.log(LogStatus.PASS, "Verified error message beside Annual Mileage field");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_031");
		}		
	}
	
	
	@Test (priority =31)  // Validation for Annual Mileage field box color with Valid Data
	public void TestCase32() throws IOException 
	{
		try {
		test = extentObj.startTest("Annual Mileage box colour verification with valid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateannualmileageBoxColorVthValidData();
		Assert.assertTrue(VehicleObj.annualmileageBlueBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering valid data box color turned into blue colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_032");
		}		
	}
	
	
	@Test (priority = 32)   // Validation for Annual Mileage field box color with invalid Data
	public void TestCase33() throws IOException 
	{
		try {
		test = extentObj.startTest("Annual Mileage box colour verification with invalid data", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateannualmileageBoxColorVthInValidData();
		Assert.assertTrue(VehicleObj.annualmileageRedBox.isDisplayed());
		
		test.log(LogStatus.PASS, "Verified after entering invalid data box color turned into red colour");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_033");
		}		
	}
	
	
	@Test(priority = 33)    // Validation for Next button verification in enter vehicle data page for Automobile tab
	public void TestCase34() throws IOException 
	{
		try {
		test = extentObj.startTest("Next button verification in enter vehicle data page for Automobile tab", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateNextButton();
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Insurant Data");
		
		test.log(LogStatus.PASS, "Verified Next button in enter vehicle data page");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"TC_034");
		}		
	}
	
	

	@Test (priority = 34)   // Validation for Next button verification in enter vehicle data page for Truck tab
	public void DefectTest() throws IOException 
	{
		try {
		test = extentObj.startTest("Next button verification in enter vehicle data page for Truck tab", extent);
		test.log(LogStatus.PASS, "Browser is launched");
		test.log(LogStatus.PASS, "Tricentis application is launched");
		
		VehicleObj.ValidateEnterdataVhcleNxtBtn();
		Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Insurant Data");
		
		test.log(LogStatus.PASS, "Verified Next button in enter vehicle data page");
		}catch(Exception e)
		{
		ActionClass.takeScreenshotForTestFailure();
		test.log(LogStatus.FAIL, "Test failed: " +"Defect");
		}		
	}
	
	
	@AfterMethod
	public void teardwn()
	{
		VehicleObj.closeBrowser();
		test.log(LogStatus.PASS, "Browser is closed");
	}
	
	@AfterSuite
	public void FlushReoprts()
	{
		extentObj.endTest(test, extent);
		extentObj.flushReport(extent);
	}
	

	

}
