package fr.insa.asi.boule.cucumber;

import org.junit.Assert;
import org.mockito.Mockito;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.insa.asi.boule.model.Bet;
import fr.insa.asi.boule.model.Number;
import fr.insa.asi.boule.model.User;
import fr.insa.asi.boule.service.NumberGenerator;
import fr.insa.asi.boule.service.impl.BouleGameImpl;
import fr.insa.asi.boule.service.impl.UserBetManagerImpl;

public class UserBetStepDefs {

	private UserBetManagerImpl userBetManager;
	private BouleGameImpl game;
	
	private User user;
	
	@Given("an user with (\\d+) euros")
    public void an_user_with_euros(int amount) {
        user = new User();
        user.setAmount(amount);
        
        game = new BouleGameImpl();
        
        userBetManager = new UserBetManagerImpl();
        userBetManager.setGame(game);
    }
	
	@When("he bets (\\d+) euros on (.*) and the number (\\d+) is out")
	public void he_bets_euros_on_number_and_the_number_is_out(int betAmount, String betString, int numberInt) {
		Bet bet = getBetFromString(betString);
		
		Number n = getNumberFromInt(numberInt);
		
		NumberGenerator genMock = Mockito.mock(NumberGenerator.class);
		Mockito.when(genMock.generate()).thenReturn(n);
		game.setNumberGenerator(genMock);
		
		userBetManager.bet(user, bet, betAmount);
	}
	
	@Then("the user has (\\d+) euros")
	public void the_user_has_euros(int amountToCheck) {
		Assert.assertEquals("Bad user amount", amountToCheck, user.getAmount());
	}

	private Bet getBetFromString(String betString) {
		if ("9".equals(betString)) {
			return Bet.NUMBER9;
		}
		return null;
	}

	private Number getNumberFromInt(int number) {
		if (number == 4) {
			return Number.N4;
		}
		return null;
	}
	

}
