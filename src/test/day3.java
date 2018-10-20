package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClass()
	{
		//selenium
		System.out.println("Avant de lancer les methode de la classe");
	}
	
	@Parameters({ "URL","APIKey/usrname" })
	@Test
	public void WebloginCarLoan(String urlname,String key)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
		
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
	@Test(enabled=false)
	public void MobilesignincarLoan()
	{
		//Appium
		System.out.println("Mobile signincarLoan");
	}
	
	
	@Test(timeOut=400000,dataProvider="getData")
	public void MobilesignoutcarLoan(String username,String password)
	{
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods={"WebloginCarLoan","MobilesignoutcarLoan"})
	public void APIcarLoan()
	{
		//Rest API
		System.out.println("APILoginCar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		// on definit un tableau multidimentionnel
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}

}
