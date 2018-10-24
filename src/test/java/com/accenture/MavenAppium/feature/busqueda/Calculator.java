package com.accenture.MavenAppium.feature.busqueda;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.accenture.MavenAppium.task.Calcular;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;



@RunWith(SerenityRunner.class)
public class Calculator {
	Actor daniel = Actor.named("Daniel");
	
	 @Managed(driver = "appium")
	    public WebDriver driver;
	 
	 
	  @Before
	  public void danielCanDriver() {
	        daniel.can(BrowseTheWeb.with(driver));
	   }
	  
	  @Test
	  public void search_result() {
		  when(daniel).attemptsTo(Calcular.theApp());		  
	  }  

}
