package UITestCases;

public class LoginTest {
	
	
	LoginPage login=new LoginPage();
	@Test
	public void Logintest() {
		BaseTest.LaunchBroser("remote",url);
		login.EnterUserName("Test");
		login.EnterPassword("Test@123");
		login.clickloginbutton()
	}

}
