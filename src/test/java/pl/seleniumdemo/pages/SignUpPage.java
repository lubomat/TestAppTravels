package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class SignUpPage {

    @FindBy(name = "firstname")
    private WebElement firstNameInput;

    @FindBy(name = "lastname")
    private WebElement lastNameInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "confirmpassword")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[text()=' Sign Up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//div[@Class='alert alert-danger']//p")
    private List<WebElement> errors;


    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void setLastName(String lastname) {
        lastNameInput.sendKeys(lastname);
    }

    public void setPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void setEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void signUp() {
        signUpButton.click();
    }

    public List<String> getErrors() {
        return errors.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

    }


//    public void fillSignUpForm(String firstName, String lastName, String phone, String email, String password) {
//        firstNameInput.sendKeys(firstName);
//        lastNameInput.sendKeys(lastName);
//        phoneInput.sendKeys(phone);
//        emailInput.sendKeys(email);
//        passwordInput.sendKeys(password);
//        confirmPasswordInput.sendKeys(password);
//        signUpButton.click();
//    }
//
//    public void fillSignUpForm(User user) {
//        firstNameInput.sendKeys(user.getFirstName());
//        lastNameInput.sendKeys(user.getLastName());
//        phoneInput.sendKeys(user.getPhone());
//        emailInput.sendKeys(user.getEmail());
//        passwordInput.sendKeys(user.getPassword());
//        confirmPasswordInput.sendKeys(user.getPassword());
//        signUpButton.click();
//    }


}
