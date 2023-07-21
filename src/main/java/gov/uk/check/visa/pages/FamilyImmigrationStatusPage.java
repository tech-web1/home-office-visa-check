package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    //nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
    //  (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()

    @CacheLookup
    @FindBy(xpath = "")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "")
    WebElement yes;
    @CacheLookup
    @FindBy(xpath = "")
    WebElement no;

    public void selectImmigrationStatus(String status){

    }
    public void clickNextStepButton(){

    }


}
