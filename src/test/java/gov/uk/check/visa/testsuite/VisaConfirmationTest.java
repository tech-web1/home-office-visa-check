package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends BaseTest {
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
    }

    @Test(groups = {"smoke","regression"})
    public void anAustralianCominToUKForTourism(){
        //Click on start button
        startPage.clickStartNow();

        //	Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //	Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");

        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();

        //	verify result 'You will not need a visa to come to the UK'
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");

    }

    @Test(groups = {"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        //Click on start button
        startPage.clickStartNow();

        //	Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");
        Thread.sleep(2000);

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        Thread.sleep(2000);

        //	Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        Thread.sleep(2000);

        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();
        Thread.sleep(2000);

        //	Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("6 months or less");

        //	Click on Continue button


        //	Select have planning to work for 'Health and care professional'
        //	Click on Continue button
        //	verify result 'You need a visa to work in health and care'
    }

    @Test(groups = {"smoke","sanity","regressiom"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        //Click on start button
        startPage.clickStartNow();

        //	Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality("Colombia");

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //	Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");

        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();
        //	Select state My partner of family member have uk immigration status 'yes'
        //	Click on Continue button
        //	verify result 'You’ll need a visa to join your family or partner in the UK'
    }

}
