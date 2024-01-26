package com.Tricentis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tricentis.action.ActionClass;
import com.Tricentis.base.BaseClass;

public class Truck_EnterProductDataPage_US004 extends ActionClass {
	
	BaseClass baseObj = null;
	ActionClass actionObj = new ActionClass();
	
	@FindBy(id = "nav_truck")
	public WebElement trucktab;
	
	
	@FindBy(id  = "enterproductdata")
	public WebElement enterproduct;
	
	@FindBy(xpath = "//a[@id='enterproductdata']")
	public WebElement EnterProductData;
	

	@FindBy(xpath = "//input[@id='startdate']")
	public WebElement startdate;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[1]")
	public WebElement DateFieldRed;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[1]")
	public WebElement DateFieldBlueWithTick;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[1]/span")
	public WebElement DateThisFieldMandatory;
	
	
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[1]/span")
	public WebElement Mustbemorethanonemonthinfuture;
	
	
    
    @FindBy(xpath = "//select[@id='insurancesum']")
	public WebElement insurancesum;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[2]")
	public WebElement InsuranceSumBlueTick;
	
	@FindBy(xpath = "//select[@id='damageinsurance']")
	public WebElement damage;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[3]")
	public WebElement DamageInsuranceBlueTick;
	

	@FindBy(xpath = "//label[normalize-space()='Optional Products']")
	public WebElement optionalProduct;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span")
	public WebElement radioCheck;
	
	@FindBy(id = "entervehicledata")
	public WebElement entervehicledata;
	
	@FindBy(xpath = "//*[@id=\"insurancesum\"]/option[10]")
	public WebElement InsuranceList;
	
	@FindBy(xpath = "//*[@id=\"damageinsurance\"]/option[4]")
	public WebElement DamageInsuranceList;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[4]")
	public WebElement OptinalBlueTick;
	
	@FindBy(xpath = "//input[@id='startdat']")
	public WebElement startdatee;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[2]/span")
	public WebElement InsuranceMessage;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[4]/i")
	public WebElement OptionnalStar;
	
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[3]/span")
	public WebElement DamageMessage;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[4]/span")
	public WebElement Optionalmessage;
	
	
	
	
	
	
	
	
	
	
	
	
	


    
    
	
	
	
	public Truck_EnterProductDataPage_US004()
	{
		actionObj = new ActionClass();
		initElements();
	}
	
	public void initElements()
	{
		PageFactory.initElements(BaseClass.getDriver(),this);
	}
	
	public void ValidateProductPageTab()
	{
		 click(getDriver(), trucktab);
		 click(getDriver(),enterproduct);
		
	}
	
	public void ValidateTruckTab()
	{
		 click(getDriver(), trucktab);
		 click(getDriver(), entervehicledata);
	}
	
	public void ValidateStartDateField()
	{
		 click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 click(getDriver(), startdate);
		 
		 
		 	 
	}
	
	public void ValidateStartDateField1()
	{
		 click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 click(getDriver(), startdate);	 	 		 	 
	}
	
	public void ValidateInsuranceSumField()
	{
		 click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 insurancesum.click();
		 InsuranceList.click();	  
	}
	
	public void ValidateDamageInsuranceField()
	{
		 click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 damage.click();
		 DamageInsuranceList.click();
		 
		 
	}
	
	public void ValidateOptionalProduct()
	{
		 click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 click(getDriver(), optionalProduct);
		 click(getDriver(), radioCheck);
		 
	}
	
	public void ValidateDefect()
	{
		  trucktab.click();
		 enterproduct.click();
		 click(getDriver(), startdatee);
		 		 
	}
	
	public void InsuranceStarMessage() {
		click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 click(getDriver(),insurancesum);
		 
		 	
	}
	
	public void DamageStarMessage() {
		click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 click(getDriver(),damage);
	}
	
	public void OptionalStarMessage() {
		click(getDriver(), trucktab);
		 click(getDriver(), enterproduct);
		 click(getDriver(),OptionnalStar);
		 
	}
	
	

}



