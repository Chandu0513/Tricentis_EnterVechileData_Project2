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
import com.Tricentis.pages.MotorCycle_EnterVechileData_US002;
import com.Tricentis.utilities.ExtentClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.Tricentis.utilities.Listener.class)

public class US002_TestCases extends BaseClass {
	
	MotorCycle_EnterVechileData_US002 Dataobj =  new MotorCycle_EnterVechileData_US002();
	ExtentClass extentObj = new ExtentClass();
	ExtentReports extent = null;
	ExtentTest test = null;
	String screenshotspath = null;
	ActionClass actionobj = new ActionClass();
	
	@BeforeSuite
	public void reports()
	{
		extent = extentObj.getExtentReportInstance(Dataobj.loadconfig("testCaseReportPath")+this.getClass().getName()+".html");
		test = extentObj.startTest("Launched US_002 Tests", extent);
		test.log(LogStatus.PASS, "Tests Started");
	}
	
	@BeforeMethod
	public void launch()
	{
		Dataobj.browserLaunch();
		Dataobj.initElements();
		screenshotspath = Dataobj.loadconfig("screenshotspath");
	}
	
	
	//verifying user can see EnterVehicleData in motorcycle.
	@Test (priority = 1)
	public void US002_TS001() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("Entervechiledata Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelectEntervehicledata();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			test.log(LogStatus.PASS, "Verified Enter Vehicle Data Page");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC001");
		}
	}

	//verifying *Message for all TextFields
	@Test (priority = 2)  
	public void US002_TS002() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("All textfield * Message Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.MakeSelectoptionMessage();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			Assert.assertTrue(Dataobj.MakeSelectoptionMsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed Make * message");
			Dataobj.ModelSelectoptionMessage();
			Assert.assertTrue(Dataobj.ModelSelectoptionMsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed Model * message");
			Dataobj.ccMandatoryMessage();
			Assert.assertTrue(Dataobj.ccThisFelidMandatorymsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed Cylinder Capacity * message");
			Dataobj.EgineMandatoryMessage();
			Assert.assertTrue(Dataobj.EngThisFelidMandatorymsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed Engine Performance * message");
			Dataobj.DateMandatoryMessage();
			Assert.assertTrue(Dataobj.DateThisFelidMandatorymsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed Date of Manufacture * message");
			Dataobj.SeatsSelectoptionMessage();
			Assert.assertTrue(Dataobj.SeatsSelectoptionMsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed Number of Seats * message");
			Dataobj.PriceMandatoryMessage();
			Assert.assertTrue(Dataobj.PriceThisFelidMandatorymsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed List Price * message");
			Dataobj.mileageMandatoryMessage();
			Assert.assertTrue(Dataobj.MileageThisFelidMandatorymsg.isDisplayed());
			test.log(LogStatus.PASS, "verifed Annual Mileage * message");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC002");
		}
	}



	// verifying Make Field with Invalid option and confirm Red box is Displayed
	@Test (priority = 3) 
	public void US002_TC003_verifyRed() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("MakeOption Motorcycle Red", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelectMake();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			Assert.assertTrue(Dataobj.maketextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Verify Make Field Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC003_verifyRed");
		}
	}

	//verifying Make Field with valid option and confirm Blue box with Tick is Displayed
	@Test (priority = 4)
	public void US002_TC003_verifyBlueTick() throws IOException {
		try {
			test = extentObj.startTest("MakeOption Motorcycle Blue", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelctAoption();
			Assert.assertTrue(Dataobj.MaketextfielBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verify Make Field Box is Blue with Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC003_verifyBlueTick");
		}
	}

	// verifying Model Field with Invalid option and confirm Red box is Displayed
	@Test (priority = 5) 
	public void US002_TC004_verifyRed() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("ModelOption Motorcycle Red", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelectModel();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			Assert.assertTrue(Dataobj.modeltextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Verify Model Field Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC004_verifyRed");
		}
	}

	//verifying Model Field with valid option and confirm Blue box with Tick is Displayed
	@Test (priority = 6) 
	public void US002_TC004_verifyBlueTick() throws IOException {
		try {
			test = extentObj.startTest("ModelOption Motorcycle Blue", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelctAmodel();
			Assert.assertTrue(Dataobj.modeltextfielBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verify Model Field Box is Blue with Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC004_verifyBlueTick");
		}
	}


	//verify CylinderCapacity motorcycle with invalid data. 
	//confirm Must be a number between 1 and 2000 is displayed 

	@Test (priority = 7)
	public void US_002_TS_005() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("CylinderCapacity Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelectCylindercapacity();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			actionobj.enterdata(Dataobj.cylindercapacity, "abc");
			Assert.assertTrue(Dataobj.Cylindernumberbetween1and2000.isDisplayed());
			actionobj.enterdata(Dataobj.cylindercapacity, "0");
			Assert.assertTrue(Dataobj.Cylindernumberbetween1and2000.isDisplayed());
			actionobj.enterdata(Dataobj.cylindercapacity, "20001");
			Assert.assertTrue(Dataobj.Cylindernumberbetween1and2000.isDisplayed());
			test.log(LogStatus.PASS, "Verified textfiled with invalid data 'abc',0,2001");
			test.log(LogStatus.PASS, "Verified Must be a number between 1 and 2000 is displayed");
			actionobj.enterdata(Dataobj.cylindercapacity, "12");
			test.log(LogStatus.PASS, " Provided valid data '12' in TextField");
			Assert.assertTrue(Dataobj.CCtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verified the textfield  Blue color and Tick");	
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_005");
		}
	}

	//verify CylinderCapacity motorcycle with invalid data. 
	//confirm TextField box color is Red

	@Test (priority = 8)
	public void US_002_TS_006TextFieldcolorRed () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("CylinderCapacity TextField Color RED Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldCylindercapacity();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.cylindercapacity, "20001");
			Assert.assertTrue(Dataobj.Cylindernumberbetween1and2000.isDisplayed());
			Assert.assertTrue(Dataobj.CCtextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Provided Invalid data '20001' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_006TextFieldcolorRed");
		}
	}

	//verify CylinderCapacity motorcycle with invalid data. 
	//confirm TextField box color is Blue with Tick

	@Test  (priority = 9)
	public void US_002_TS_006TextFieldBlueWithTick () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("CylinderCapacity TextField Color Blue Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldCylindercapacity();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.cylindercapacity, "2");

			Assert.assertTrue(Dataobj.CCtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Provided valid data '2' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Blue With Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_006TextFieldBlueWithTick");
		}
	}

	//verify EnginePerformance motorcycle with invalid data. 
	//confirm Must be a number between 1 and 2000 is displayed 

	@Test (priority = 10)
	public void US_002_TS_007() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("EnginePerformance Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelectEnginePerformance();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			actionobj.enterdata(Dataobj.engineperformance, "abc");
			Assert.assertTrue(Dataobj.Enginenumberbetween1and2000.isDisplayed());
			actionobj.enterdata(Dataobj.engineperformance, "0");
			Assert.assertTrue(Dataobj.Enginenumberbetween1and2000.isDisplayed());
			actionobj.enterdata(Dataobj.engineperformance, "20001");
			Assert.assertTrue(Dataobj.Enginenumberbetween1and2000.isDisplayed());
			test.log(LogStatus.PASS, "Verified textfiled with invalid data 'abc',0,2001");
			test.log(LogStatus.PASS, "Verified Must be a number between 1 and 2000 is displayed");
			actionobj.enterdata(Dataobj.engineperformance, "12");
			test.log(LogStatus.PASS, " Provided valid data '12' in TextField");
			Assert.assertTrue(Dataobj.EngtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verified the textfield  Blue color and Tick");	
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_007");
		}
	}


	//verify EnginePerformance motorcycle with invalid data. 
	//confirm TextField box color is Red

	@Test (priority = 11)
	public void US_002_TS_008TextFieldcolorRed () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("EnginePerformance TextField Color RED Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldcolorEngineperformance();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.engineperformance, "20001");
			Assert.assertTrue(Dataobj.Enginenumberbetween1and2000.isDisplayed());
			Assert.assertTrue(Dataobj.EngtextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Provided Invalid data '20001' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_008TextFieldcolorRed");
		}
	}

	//verify EnginePerformance motorcycle with invalid data. 
	//confirm TextField box color is Blue with Tick

	@Test (priority = 12)
	public void US_002_TS_008TextFieldBlueWithTick () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("EnginePerformance TextField Color Blue Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldcolorEngineperformance();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.engineperformance, "2");

			Assert.assertTrue(Dataobj.EngtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Provided valid data '2' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Blue With Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_008TextFieldBlueWithTick");
		}
	}

	//verify DateofManufacture motorcycle with invalid data. 
	//confirm Must be a number between 1 and 2000 is displayed 

	@Test (priority = 13)
	public void US_002_TS_009() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("Date of Manufacture Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.selectDateofmanufacture();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			actionobj.enterdata(Dataobj.dateofmanufacture, "22222");
			Assert.assertTrue(Dataobj.Mustbevaliddate.isDisplayed());
			test.log(LogStatus.PASS, "Verified textfiled with invalid data '22222'");
			test.log(LogStatus.PASS, "Verified Must be a valid date error Displayed");
			actionobj.enterdata(Dataobj.dateofmanufacture, "02/17/2024");
			Assert.assertTrue(Dataobj.Mustbetodayorsomewhereinthepast.isDisplayed());
			test.log(LogStatus.PASS, "Verified textfiled with invalid data '02/17/2024'");
			test.log(LogStatus.PASS, "Verified Must be today or somewhere in the past is displayed");
			actionobj.enterdata(Dataobj.dateofmanufacture, "01/17/2024");
			test.log(LogStatus.PASS, " Provided valid data '01/17/2024' in TextField");
			Assert.assertTrue(Dataobj.DatetextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verified the textfield  Blue color and Tick");	
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_009");
		}
	}

	//verify DateofManufacture motorcycle with invalid data. 
	//confirm TextField box color is Red

	@Test  (priority = 14)
	public void US_002_TS_010TextFieldcolorRed () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("DateofManufacture TextField Color RED Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldDateofmanufacture();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.dateofmanufacture, "2222");
			Assert.assertTrue(Dataobj.Mustbevaliddate.isDisplayed());
			Assert.assertTrue(Dataobj.DatetextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Provided Invalid data '2222' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_010TextFieldcolorRed");
		}
	}

	//verify DateofManufacture motorcycle with invalid data. 
	//confirm TextField box color is Blue with Tick

	@Test  (priority = 15)
	public void US_002_TS_010TextFieldBlueWithTick () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("DateofManufacture TextField Color Blue Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldDateofmanufacture();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.dateofmanufacture, "01/17/2024");

			Assert.assertTrue(Dataobj.DatetextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Provided valid data '01/17/2024' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Blue With Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_010TextFieldBlueWithTick");
		}
	}


	// verifying Make NumberOfseats with Invalid option and confirm Red box is Displayed
	@Test (priority = 16) 
	public void US002_TC011_verifyRed() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("NumberOfseats RED Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.Numberofseats();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			Assert.assertTrue(Dataobj.SeatstextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Verify Make Field Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC011_verifyRed");
		}
	}

	//verifying NumberOfseats with valid option and confirm Blue box with Tick is Displayed
	@Test (priority = 17) 
	public void US002_TC011_verifyBlueTick() throws IOException {
		try {
			test = extentObj.startTest("NumberOfseats Blue Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelctAoption();
			Assert.assertTrue(Dataobj.SeatstextfielBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verify Make Field Box is Blue with Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC011_verifyBlueTick");
		}
	}

	//verify ListPrice motorcycle with invalid data. 
	//confirm Must be a number between 500 to 100000 is displayed 

	@Test (priority = 18)
	public void US_002_TS_012() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("ListPrice Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.Selectlistprice();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			actionobj.enterdata(Dataobj.listprice, "abc");
			Assert.assertTrue(Dataobj.Listnumberbetween500to100000.isDisplayed());
			actionobj.enterdata(Dataobj.listprice, "499");
			Assert.assertTrue(Dataobj.Listnumberbetween500to100000.isDisplayed());
			actionobj.enterdata(Dataobj.listprice, "100001");
			Assert.assertTrue(Dataobj.Listnumberbetween500to100000.isDisplayed());
			test.log(LogStatus.PASS, "Verified textfiled with invalid data 'abc',499,100001");
			test.log(LogStatus.PASS, "Verified Must be a number between 500 to 100000 is displayed");
			actionobj.enterdata(Dataobj.listprice, "501");
			test.log(LogStatus.PASS, " Provided valid data '501' in TextField");
			Assert.assertTrue(Dataobj.ListtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verified the textfield  Blue color and Tick");	
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_012");
		}
	}


	//verify ListPrice motorcycle with invalid data. 
	//confirm TextField box color is Red

	@Test  (priority = 19)
	public void US_002_TS_013TextFieldcolorRed () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("ListPrice TextField Color RED Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.Textfieldlistprice();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.listprice, "499");
			Assert.assertTrue(Dataobj.Listnumberbetween500to100000.isDisplayed());
			Assert.assertTrue(Dataobj.ListtextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Provided Invalid data '499' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_013TextFieldcolorRed");
		}
	}

	//verify ListPrice motorcycle with invalid data. 
	//confirm TextField box color is Blue with Tick

	@Test  (priority = 20)
	public void US_002_TS_013TextFieldBlueWithTick () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("ListPrice TextField Color Blue Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.Textfieldlistprice();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.listprice, "501");

			Assert.assertTrue(Dataobj.ListtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Provided valid data '501' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Blue With Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_013TextFieldBlueWithTick");
		}
	}

	//verify AnnualMileage motorcycle with invalid data. 
	//confirm Must be a number between 500 to 100000 is displayed 

	@Test (priority = 21)
	public void US_002_TS_014() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("Annual Mileage Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.SelectAnnualmileage();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			actionobj.enterdata(Dataobj.annualmileage, "abc");
			Assert.assertTrue(Dataobj.Milegaenumberbetween100and100000.isDisplayed());
			actionobj.enterdata(Dataobj.annualmileage, "0");
			Assert.assertTrue(Dataobj.Milegaenumberbetween100and100000.isDisplayed());
			actionobj.enterdata(Dataobj.annualmileage, "100001");
			Assert.assertTrue(Dataobj.Milegaenumberbetween100and100000.isDisplayed());
			test.log(LogStatus.PASS, "Verified textfiled with invalid data 'abc',0,100001");
			test.log(LogStatus.PASS, "Verified Must be a number between 500 to 100000 is displayed");
			actionobj.enterdata(Dataobj.annualmileage, "101");
			test.log(LogStatus.PASS, " Provided valid data '101' in TextField");
			Assert.assertTrue(Dataobj.MaketextfielBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Verified the textfield  Blue color and Tick");	
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_014");
		}
	}


	//verify AnnualMileage motorcycle with invalid data. 
	//confirm TextField box color is Red

	@Test  (priority = 22)
	public void US_002_TS_015TextFieldcolorRed () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("Annual Mileage TextField Color RED Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldAnnualmileage();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.annualmileage, "0");
			Assert.assertTrue(Dataobj.Milegaenumberbetween100and100000.isDisplayed());
			Assert.assertTrue(Dataobj.MileagetextfieldRed.isDisplayed());
			test.log(LogStatus.PASS, " Provided Invalid data '0' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Red");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_015TextFieldcolorRed");
		}
	}

	//verify AnnualMileage motorcycle with invalid data. 
	//confirm TextField box color is Blue with Tick

	@Test  (priority = 23)
	public void US_002_TS_015TextFieldBlueWithTick () throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("Annual Mileage TextField Color Blue Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.TextfieldAnnualmileage();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");

			actionobj.enterdata(Dataobj.annualmileage, "9999");

			Assert.assertTrue(Dataobj.MileagefieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, " Provided valid data '9999' in TextField");
			test.log(LogStatus.PASS, " Verifed Textfleid Box is Blue With Tick");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_015TextFieldBlueWithTick");
		}
	}

	//verify all fields in EnterVehicleData and click on Next
	// Verify after clicking next page EnterInsurantData page is loaded

	@Test (priority = 24)
	public void US_002_TS_016() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("EnterInsurantData Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.InputMake();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			Assert.assertTrue(Dataobj.MaketextfielBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Selected Valid Option In MakeField");
			test.log(LogStatus.PASS, "Verified Makefield Blue with Tick");

			Dataobj.InputModel();
			Assert.assertTrue(Dataobj.ModeltextfielBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Selected Valid Option In ModelField");
			test.log(LogStatus.PASS, "Verified Modelfield Blue with Tick");

			Dataobj.InputCC();
			actionobj.enterdata(Dataobj.cylindercapacity, "100");
			Assert.assertTrue(Dataobj.CCtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Entering Valid Data In CylindercapacityField");
			test.log(LogStatus.PASS, "Verified Cylindercapacity field Blue with Tick");

			Dataobj.InputEngine();
			actionobj.enterdata(Dataobj.engineperformance,"100");
			Assert.assertTrue(Dataobj.EngtextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Entering Valid Data In engineperformance");
			test.log(LogStatus.PASS, "Verified engineperformance Field Blue with Tick");

			Dataobj.InputDate();
			actionobj.enterdata(Dataobj.dateofmanufacture,"01/17/2024");
			Assert.assertTrue(Dataobj.DatetextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Entering Valid Data In dateofmanufacture");
			test.log(LogStatus.PASS, "Verified date o fmanufacture Field Blue with Tick");

			Dataobj.InputSeat();
			Assert.assertTrue(Dataobj.SeattextfielBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Selected Valid Option In SeatsField");
			test.log(LogStatus.PASS, "Verified SeatsField Blue with Tick");

			Dataobj.InputPrice();
			actionobj.enterdata(Dataobj.listprice,"500");
			Assert.assertTrue(Dataobj.PricetextfieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Entering Valid Data In listprice Field");
			test.log(LogStatus.PASS, "Verified listpriceField Blue with Tick");

			Dataobj.InputMileage();
			actionobj.enterdata(Dataobj.annualmileage,"500");
			Assert.assertTrue(Dataobj.MileagefieldBluewithTick.isDisplayed());
			test.log(LogStatus.PASS, "Verified Entering Valid Data In annualmileage Field");
			test.log(LogStatus.PASS, "Verified annualmileage Field Blue with Tick");

			Dataobj.EnterInsurantData();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Insurant Data");
			test.log(LogStatus.PASS, "Verified Selected Next Option In EnterVechileData");
			test.log(LogStatus.PASS, "Verified Enter Insurant Data Page Loaded");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US_002_TS_016");
		}
	}

	//Defect
	@Test  (priority = 25)
	public void US002_TS017() throws IOException, InterruptedException 
	{
		try {
			test = extentObj.startTest("Entervechiledata Motorcycle", extent);
			test.log(LogStatus.PASS, "Browser is launched");
			test.log(LogStatus.PASS, "Tricentis application is launched");
			Dataobj.EnterVehicleData();
			Assert.assertEquals(BaseClass.driver.getTitle(), "Enter Vehicle Data");
			test.log(LogStatus.PASS, "Verified Enter Vehicle Data Page");
		}catch(Exception e)
		{
			ActionClass.takeScreenshotForTestFailure();
			test.log(LogStatus.FAIL, "Test failed: " + "US002_TC017");
		}
	}
	
	
	
	@AfterMethod
	public void teardwn()
	{
		driver.close();
		test.log(LogStatus.PASS, "Browser is closed");
	}
	
	@AfterSuite
	public void FlushReoprts()
	{
		extentObj.endTest(test, extent);
		extentObj.flushReport(extent);
	}
	
}
