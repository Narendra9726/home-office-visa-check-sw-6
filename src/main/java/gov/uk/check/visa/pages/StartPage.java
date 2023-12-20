package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptAdditionalCookies;
    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement acceptButton;
    @CacheLookup
    @FindBy(css = ".gem-c-cookie-banner__hide-button.govuk-button")
    WebElement hideCookies;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startButton;

    public void clickOnAcceptAdditionalCookiesButton() {
        log.info("Clicking on " + acceptAdditionalCookies.getText());
        clickOnElement(acceptAdditionalCookies);
    }

    public void clickOnAccept() {
        log.info("clickOnAccept: " + acceptButton.toString());
        clickOnElement(acceptButton);
    }

    public void clickOnHideButton() {
        log.info("clickOnHideButton: " + hideCookies.toString());
        clickOnElement(hideCookies);
    }

    public void clickOnStart() {
        log.info("clickOnStart: " + startButton.toString());
        clickOnElement(startButton);
    }
}
