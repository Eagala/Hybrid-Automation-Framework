
public class BaseClass {

	Public Webdriver Driver=null;
	
	
	public static void LaunchBrowser(browserType,loginUrl) {
		if(browerType="Chrome") {
			Driver=new ChromeDriver();
			//Maximize browser
		}
		else if(browserType="firefox") {
			Driver=new FireFoxDriver();
		}
		elseif(browserType=="remote")
		{
			Driver=new remoteDriver();
			Capbalitiles for mobile here
			Devicename
			browser
			os
			
		}
		
	}
}
