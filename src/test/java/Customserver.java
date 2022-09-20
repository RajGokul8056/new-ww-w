import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Customserver {


	public  void customserver() throws MalformedURLException {
		
		AppiumDriverLocalService server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4723)
			.withLogFile(new java.io.File("../AppiumSDET17/Logs.txt")));
		server.start();
		
				
		
		

}
}