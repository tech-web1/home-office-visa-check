package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement selectJobtypeList;

    public void selectJobType(String job){

    }
    public void clickNextStepButton(){

    }

}
