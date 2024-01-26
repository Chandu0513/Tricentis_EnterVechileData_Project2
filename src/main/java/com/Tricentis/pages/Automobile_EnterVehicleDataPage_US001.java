package com.Tricentis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tricentis.action.ActionClass;
import com.Tricentis.base.BaseClass;

public class Automobile_EnterVehicleDataPage_US001  extends ActionClass{
	
	BaseClass baseObj = new BaseClass();
	ActionClass actionObj = new ActionClass();
	
	@FindBy(id = "nav_automobile")
	public WebElement automobiletab;
	
	@FindBy(id = "make")
	public WebElement makefield;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[1]/i")
	public WebElement MStartIcon;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[1]/span")
	public WebElement MakeMessage;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-select-one invalid']")
	public WebElement MakeRedBox;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-select-one valid']")
	public WebElement MakeBlueBox;
	
	@FindBy(id = "engineperformance")
	public WebElement EnginePerformanceField;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[2]/span")
	public WebElement EPMessage;
	
	@FindBy(xpath = "//span[text()='Must be a number between 1 and 2000']")
	public WebElement ErrEPMessage;
	
	@FindBy( xpath = "//div[@class='field idealforms-field idealforms-field-text invalid']")
	public WebElement EPRedBox;
	
	@FindBy( xpath = "//div[@class='field idealforms-field idealforms-field-text valid']")
	public WebElement EPBlueBox;
	
	@FindBy(id = "dateofmanufacture")
	public WebElement dateofmanufacture;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[3]/span")
	public WebElement DateOfMnfctrMessage;
	
	@FindBy(id = "opendateofmanufacturecalender")
	public WebElement calendarIcon;
	
	@FindBy(xpath = "//div[@id='ui-datepicker-div']//table/tbody/tr[5]/td[4]")
	public WebElement futureDate;
	
	@FindBy(xpath = "//span[text()='Must be today or somewhere in the past']")
	public WebElement DateOfMnfctrErrorMsg;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-text valid']")
	public WebElement DateOfMnfctrBlueBox;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-text invalid']")
	public WebElement DateOfMnfctrRedBox;
	
	@FindBy(id = "numberofseats")
	public WebElement numberofseats;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[4]/i")
	public WebElement NoOfSeatsStar;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[4]/span")
	public WebElement NoOfSeatMessage;
	
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-select-one invalid'][2]")
	public WebElement NoOfSeatsRedBox;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-select-one valid']")
	public WebElement NoOfSeatsBlueBox;
	
	
	@FindBy(id = "fuel")
	public WebElement fuel;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[5]/i")
	public WebElement fuelStar;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[5]/span")
	public WebElement fuelMessage;
	
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-select-one invalid'][2]")
	public WebElement fuelRedBox;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-select-one valid']")
	public WebElement fuelBlueBox;
	
	@FindBy(id = "listprice")
	public WebElement listprice;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[6]/span")
	public WebElement listpriceMessage;
	
	@FindBy(xpath = "//span[text()='Must be a number between 500 and 100000']")
	public WebElement ErrlistpriceMessage;
	
	@FindBy( xpath = "//div[@class='field idealforms-field idealforms-field-text invalid']")
	public WebElement listpriceRedBox;
	
	@FindBy( xpath = "//div[@class='field idealforms-field idealforms-field-text valid']")
	public WebElement listpriceBlueBox;
	
	@FindBy(id = "licenseplatenumber")
	public WebElement licenseplatenumber;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[7]/span")
	public WebElement ErrMsglicenseplatenumber;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[7]/i")
	public WebElement licenseplatestaricon;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-text invalid']")
	public WebElement licenseplatenumberRebBox;
	
	@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-text valid']")
	public WebElement licenseplatenumberBlueBox;
	
	@FindBy(id = "annualmileage")
	public WebElement annualmileage;
	
	@FindBy(xpath = "//*[@id='insurance-form']/div/section[1]/div[8]/span")
	public WebElement annualmileageMessage;
	
	@FindBy(xpath = "//span[text()='Must be a number between 100 and 100000']")
	public WebElement ErrannualmileageMessage;
	
	@FindBy( xpath = "//div[@class='field idealforms-field idealforms-field-text invalid']")
	public WebElement annualmileageRedBox;
	
	@FindBy( xpath = "//div[@class='field idealforms-field idealforms-field-text valid']")
	public WebElement annualmileageBlueBox;
	
	@FindBy(id = "nextenterinsurantdata")
	public WebElement nextenterinsurantdata;
	
	@FindBy(id = "nav_truck")
	public WebElement nav_truck;
	
	@FindBy(id = "nextenterinsurantdata12")
	public WebElement nextenterinsurantdataTruck;
	
	
	
	public Automobile_EnterVehicleDataPage_US001()
	{
		baseObj = new ActionClass();
		initElements();
	}
	
	public void initElements()
	{
		PageFactory.initElements(BaseClass.getDriver(),this);
	}
	
	
	public void HeaderTab()
	{
		click(driver, automobiletab);
	}
	
	
	public void ValidateMakeFieldDropdown()
	{
		HeaderTab();
		 click(driver,makefield);
	}
	
	public void ValidateMakeFieldMessage()
	{
		HeaderTab();
		click(driver, MStartIcon);
	}
	
	public void ValidateMakeBoxColorVthValidData()
	{
		HeaderTab();
		click(driver, makefield);
		selectByVisibleText("BMW",makefield);
	}
	
	public void ValidateMakeBoxColorVthInValidData()
	{
		HeaderTab();
		click(driver, makefield);
	}
	
	public void ValidateEnginePrfmncMessage()
	{
		HeaderTab();
		click(driver,  EnginePerformanceField);
	}
	
	public void ValidateEnginePrfmncErrMsg()
	{
		HeaderTab();
		click(driver, EnginePerformanceField);
	}
	
	public void ValidateEnginePrfmncBoxColorVthValidData()
	{
		HeaderTab();
		enterdata(EnginePerformanceField, "100");
	}
	
	public void ValidateEnginePrfmncBoxColorVthInValidData()
	{
		HeaderTab();
		enterdata(EnginePerformanceField, "5000");
	}
	
	public void ValidateDateOfMnfctrMsg()
	{
		HeaderTab();
		click(driver, dateofmanufacture);
	}
	
	public void ValidateEnterDateManually()
	{
		click(driver, automobiletab);
		enterdata(dateofmanufacture, "01/01/2024");
	}
	
	public void ValidateDateOfMnfctrErrorMsg()
	{
		HeaderTab();
		click(driver, calendarIcon);
		enterdata(dateofmanufacture, "01/31/2024");
	}
	
	public void ValidateDateOfMnfctrBoxColorVthValidData()
	{
		HeaderTab();
		enterdata(dateofmanufacture, "01/17/2024");
	}
	
	public void ValidateDateOfMnfctrBoxColorVthInValidData()
	{
		HeaderTab();
		enterdata(dateofmanufacture, "01/17/2026");
	}
	
	public void ValidateNoOSeatsDropdown()
	{
		HeaderTab();
		 click(driver,numberofseats);
	}
	
	public void ValidateNoOSeatsFieldMessage()
	{
		HeaderTab();
		click(driver,NoOfSeatsStar);
	}
	
	public void ValidateNoOSeatsBoxColorVthValidData()
	{
		HeaderTab();
		click(driver, numberofseats);
		selectByVisibleText("6",numberofseats);
	}
	
	public void ValidateNoOSeatsBoxColorVthInValidData()
	{
		HeaderTab();
		click(driver, numberofseats);
		selectByVisibleText("1", numberofseats);
		selectByVisibleText("– please select –", numberofseats);
	}
	
	public void ValidatefuelDropdown()
	{
		HeaderTab();
		scrolldown();
		click(driver,fuel);
	}
	
	public void ValidatefuelFieldMessage()
	{
		HeaderTab();
		scrolldown();
		click(driver, fuelStar);
	}
	
	public void ValidatefuelFieldBoxColorVthValidData()
	{
		HeaderTab();
		scrolldown();
		click(driver, fuel);
		selectByVisibleText("Diesel",fuel);
	}
	
	public void ValidatefuelFieldBoxColorVthInValidData()
	{
		HeaderTab();
		scrolldown();
		click(driver, fuel);
		selectByVisibleText("Petrol",fuel);
		selectByVisibleText("– please select –",fuel);
	}
	
	public void ValidatelistpriceMessage()
	{
		HeaderTab();
		scrolldown();
		click(driver,  listprice);
	}
	
	public void ValidatelistpriceErrMsg()
	{
		HeaderTab();
		scrolldown();
	}
	
	public void ValidatelistpriceBoxColorVthValidData()
	{
		HeaderTab();
		scrolldown();
		enterdata(listprice, "1000");
	}
	
	public void ValidatelistpriceBoxColorVthInValidData()
	{
		HeaderTab();
		scrolldown();
		enterdata(listprice, "300");
	}
	
	public void ValidatelicenseplateErrMsg()
	{
		HeaderTab();
		scrolldown();
		enterdata(licenseplatenumber, "TC06I999912");
	}
	
	public void ValidatelicenseplateBoxColorVthValidData()
	{
		HeaderTab();
		scrolldown();
		enterdata(licenseplatenumber, "AP27CC6799");
	}
	
	public void ValidatelicenseplateBoxColorVthInValidData()
	{
		HeaderTab();
		scrolldown();
		enterdata(licenseplatenumber, "TN060000567");
	}
	
	public void ValidateannualmileageMessage()
	{
		HeaderTab();
		scrolldown();
		click(driver,  annualmileage);
	}
	
	public void ValidateannualmileageErrMsg()
	{
		HeaderTab();
		scrolldown();
		
	}
	
	public void ValidateannualmileageBoxColorVthValidData()
	{
		HeaderTab();
		scrolldown();
		enterdata(annualmileage, "3000");
	}
	
	public void ValidateannualmileageBoxColorVthInValidData()
	{
		HeaderTab();
		scrolldown();
		enterdata(annualmileage, "50");
	}
	
	public void ValidateNextButton()
	{
		HeaderTab();
		scrolldown();
		click(driver, nextenterinsurantdata);
	}
	
	public void ValidateEnterdataVhcleNxtBtn()
	{
		click(driver,nav_truck);
		scrolldown();
		click(driver, nextenterinsurantdataTruck);
	}

}
