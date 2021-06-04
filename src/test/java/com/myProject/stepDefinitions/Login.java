package com.myProject.stepDefinitions;

import com.myProject.pages.LoginPage;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Login {

    LoginPage login = new LoginPage();

    @Given("user is in the main page")
    public void user_is_in_the_main_page() {
        Driver.getDriver().get("https://home.paynearme.com/");
    }


    @When("user clicks Platform")
    public void user_clicks() {

        login.platform.click();

    }
    @Then("user should be able to see platform page")
    public void user_should_be_able_to_see_platform_page() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("platform"));
    }


}
