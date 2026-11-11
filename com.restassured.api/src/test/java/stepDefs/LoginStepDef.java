package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	/*
	TextContext textContext;
	
	LoginStepDef(TextContext textContext)
	{
		this.textContext=textContext;
	}
	*/
	
	@Given("I am on the login page")
	public void iAmOnTheLoginPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I enter my username {string} and password {string}")
	public void iEnterMyUsernameAndPassword(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I click the {string} button")
	public void iClickTheButton(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should be redirected to the dashboard")
	public void iShouldBeRedirectedToTheDashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should see a welcome message {string}")
	public void iShouldSeeAWelcomeMessage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I login with email {string} and password {string}")
	public void iLoginWithEmailAndPassword(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should see the message {string}")
	public void iShouldSeeTheMessage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
