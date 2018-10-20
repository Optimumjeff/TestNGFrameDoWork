package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test
	public void APIHomeLoan()
	{
		//Rest API
		System.out.println("LoginAPIHomeLoan");
	}

}
