package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {
    //resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;

    public String getResultMessage(){
        return getTextFromElement((By) resultMessage);
    }
    public void confirmResultMessage(String expectedMessage){
        //verify result 'You will not need a visa to come to the UK'
        Assert.assertTrue(getResultMessage().equalsIgnoreCase(expectedMessage));
    }
}
