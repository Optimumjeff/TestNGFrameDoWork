package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}

	@Test
	public void Demo () {
		System.out.println("Hello");
	}
	@AfterSuite
	public void afsuite() {
		System.out.println("Je passe apres");
	}
	@Test
	public void SecondTest() {
		System.out.println("Bye");
	}
	

}
