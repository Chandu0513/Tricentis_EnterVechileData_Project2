package com.Tricentis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tricentis.action.ActionClass;
import com.Tricentis.base.BaseClass;

public class MotorCycle_EnterVechileData_US002 extends BaseClass  {


BaseClass baseobj = null;
ActionClass actionobj = new ActionClass();

@FindBy(id = "nav_motorcycle")
public WebElement motorcycle;

@FindBy(id = "entervehicledata")
public WebElement entervehicledata;

@FindBy(id = "entervehicledata1")
public WebElement entervehicledat;

@FindBy(id = "make")
public WebElement Make;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[1]/span")
public WebElement MakeSelectoptionMsg;

@FindBy(id = "model")
public WebElement model;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[2]")
public WebElement ModelSelectoptionMsg;

@FindBy(id = "cylindercapacity")
public WebElement cylindercapacity;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[3]/span")
public WebElement ccThisFelidMandatorymsg;

@FindBy(id = "engineperformance")
public WebElement engineperformance;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[4]/span")
public WebElement EngThisFelidMandatorymsg;

@FindBy(id = "dateofmanufacture")
public WebElement dateofmanufacture;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]/span")
public WebElement DateThisFelidMandatorymsg;

@FindBy(id = "numberofseatsmotorcycle")
public WebElement numberofseatsmotorcycle;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[6]/span")
public WebElement SeatsSelectoptionMsg;

@FindBy(id = "listprice")
public WebElement listprice;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/span")
public WebElement PriceThisFelidMandatorymsg;

@FindBy(id = "annualmileage")
public WebElement annualmileage;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[8]/span")
public WebElement MileageThisFelidMandatorymsg;

@FindBy(xpath = "//*[@id=\"numberofseatsmotorcycle\"]/option[3]")
public WebElement Seatslist;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[6]")
public WebElement SeatstextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[6]")
public WebElement SeatstextfielBluewithTick;

@FindBy(xpath = "//*[@id=\"model\"]/option[2]")
public WebElement ModelList;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[2]")
public WebElement modeltextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[2]")
public WebElement modeltextfielBluewithTick;

@FindBy(xpath = "//*[@id=\"make\"]/option[2]")
public WebElement makelist;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[2]")
public WebElement maketextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]" )
public WebElement ListtextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/span" )
public WebElement Listnumberbetween500to100000;

@FindBy(id = "nextenterinsurantdata")
public WebElement nextenterinsurantdata;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[1]")
public WebElement MaketextfielBluewithTick;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[2]")
public WebElement ModeltextfielBluewithTick;

@FindBy(xpath = "//div[@class='field idealforms-field idealforms-field-text valid']" )
public WebElement CCtextfieldBluewithTick;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[4]" )
public WebElement EngtextfieldBluewithTick;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]" )
public WebElement DatetextfieldBluewithTick; 

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[6]")
public WebElement SeattextfielBluewithTick;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]" )
public WebElement PricetextfieldBluewithTick;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[8]" )
public WebElement MileagefieldBluewithTick;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[8]/span" )
public WebElement Milegaenumberbetween100and100000;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[8]" )
public WebElement MileagetextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]" )
public WebElement ListtextfieldBluewithTick;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]" )
public WebElement DatetextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]/span" )
public WebElement Mustbevaliddate;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]/span" )
public WebElement Mustbetodayorsomewhereinthepast;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[4]/span" )
public WebElement Enginenumberbetween1and2000;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[4]" )
public WebElement EngtextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[3]" )
public WebElement CCtextfieldRed;

@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[3]/span" )
public WebElement Cylindernumberbetween1and2000;






public MotorCycle_EnterVechileData_US002()
{
	initElements();
}

public void initElements()
{
	PageFactory.initElements(BaseClass.getDriver(),this);

}

public void MakeSelectoptionMessage() { 

	motorcycle.click();
	entervehicledata.click();
	Make.click();	
}

public void SelectEnginePerformance() { 

	motorcycle.click();
	entervehicledata.click();
	engineperformance.click();	
}

public void ModelSelectoptionMessage() { 

	model.click();	
}

public void ccMandatoryMessage() { 

	cylindercapacity.click();	
}

public void EgineMandatoryMessage() { 

	engineperformance.click();	
}

public void DateMandatoryMessage() { 

	dateofmanufacture.click();	
}

public void SeatsSelectoptionMessage() { 

	numberofseatsmotorcycle.click();
}

public void PriceMandatoryMessage() { 

	listprice.click();
}

public void mileageMandatoryMessage() { 

	annualmileage.click();
}

public void Numberofseats(){
	motorcycle.click();
	entervehicledata.click();
	numberofseatsmotorcycle.click();
}


public void SelctAseatoption() {
	motorcycle.click();
	entervehicledata.click();
	numberofseatsmotorcycle.click();
	Seatslist.click();
	
}

public void SelectModel(){
	motorcycle.click();
	entervehicledata.click();
	model.click();
}


public void SelctAmodel() {
	motorcycle.click();
	entervehicledata.click();
	model.click();
	ModelList.click();
	
	
}

public void SelectMake(){
	motorcycle.click();
	entervehicledata.click();
	Make.click();
}


public void SelctAoption() {
	motorcycle.click();
	entervehicledata.click();
	Make.click();
	makelist.click();
	
}

public void Textfieldlistprice() { 

	motorcycle.click();
	entervehicledata.click();
	listprice.click();	
}

public void Selectlistprice() { 

	motorcycle.click();
	entervehicledata.click();
	listprice.click();	
}

public void SelectEntervehicledata(){
	motorcycle.click();
	entervehicledata.click();
	
}

public void InputMake() {
	motorcycle.click();
	entervehicledata.click();
	Make.click();
	makelist.click();
}

public void InputModel() {
	
	model.click();
	ModelList.click();
}


public void InputCC() { 
	cylindercapacity.click();	
}

public void InputEngine() { 

	engineperformance.click();	
}

public void InputDate() { 

	dateofmanufacture.click();	
}

public void InputSeat() { 

	numberofseatsmotorcycle.click();
	Seatslist.click();
}

public void InputPrice() { 

	listprice.click();
}

public void InputMileage() { 

	annualmileage.click();
}

public void EnterInsurantData() { 

	nextenterinsurantdata.click();
}

public void TextfieldcolorEngineperformance() { 

	motorcycle.click();
	entervehicledata.click();
	engineperformance.click();	
}

public void EnterVehicleData() {
	motorcycle.click();
	entervehicledat.click();
}

public void TextfieldDateofmanufacture() { 

	motorcycle.click();
	entervehicledata.click();
	dateofmanufacture.click();	
}

public void selectDateofmanufacture() { 

	motorcycle.click();
	entervehicledata.click();
	dateofmanufacture.click();	
}

public void TextfieldCylindercapacity() { 

	motorcycle.click();
	entervehicledata.click();
	cylindercapacity.click();	
}

public void SelectCylindercapacity() { 

	motorcycle.click();
	entervehicledata.click();
	cylindercapacity.click();	
}

public void TextfieldAnnualmileage() { 

	motorcycle.click();
	entervehicledata.click();
	annualmileage.click();	
}

public void SelectAnnualmileage() { 

	motorcycle.click();
	entervehicledata.click();
	annualmileage.click();	
}

}
