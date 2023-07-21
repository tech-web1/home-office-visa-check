package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> reasonForVisitList;

    public void selectReasonForVisit(String reason)
    {
        for (WebElement rsnElement : reasonForVisitList) {
            if (rsnElement.getText().contains(reason)) {
                clickOnElement(rsnElement);
                break;
            }
        }
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
}
