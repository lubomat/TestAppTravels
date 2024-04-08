package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ResultsPage {

    @FindBy(xpath = "//h4[contains(@class,'list_title')]//b")
    List<WebElement> hotelList;

    @FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div[1]/div[3]/div/div/h2")
    public WebElement resultHeading;

    public ResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<String> getHotelNames() {
        return hotelList.stream()
                .map(el -> el.getAttribute("textContent"))
                .collect(Collectors.toList());

    }

    public String getHeadingText() {
        return resultHeading.getText();
    }


}
