package com.usa.pages;

import com.usa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAccount {

    public AmazonAccount(){
        PageFactory.initElements(Driver.getDriver() , this);
    }


    @FindBy ( id = "nav-link-accountList")
    public WebElement signInButton;

    @FindBy ( linkText = "Start here.")
    public  WebElement startHere;


    @FindBy (  id = "ap_customer_name"  )
    public WebElement yourName;

    @FindBy( id = "ap_email")
    public  WebElement email ;

    @FindBy ( id = "ap_password")
    public  WebElement password ;

    @FindBy ( id = "ap_password_check")
    public WebElement passwordCheck;

    @FindBy (id = "continue")
    public WebElement createYourAccount;



}
