package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClass()
	{
		//selenium
		System.out.println("Avant de lancer les methode de la classe");
	}
	
	@Test
	public void WebLogincarLoan()
	{
		//selenium
		System.out.println("WebLogincar");
	}
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("je passe avant chaque methode de la classe 3");
	}
	
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("je passe apres chaque methode de la classe 3");
	}
	
	@AfterClass
	public void afterClass()
	{
		//selenium
		System.out.println("apres avoir  lancer les methode de la classe");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLogincarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("Je suis le premier");
	}
	@Test
	public void MobilesignincarLoan()
	{
		//Appium
		System.out.println("Mobile signincarLoan");
	}
	@Test
	public void MobilesignoutcarLoan()
	{
		//Appium
		System.out.println("Mobile signoutcarLoan");
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		//Rest API
		System.out.println("APILoginCar");
	}

}
