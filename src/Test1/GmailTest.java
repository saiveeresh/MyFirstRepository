package Test1;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailTest {
	
	@BeforeSuite//once before executing all test in all java files
	public void InitializeSelenium() {
		  System.out.println("Initializing Selenium");
	  }
		
	 @BeforeTest//before executing all test cases
	  public void OpenConnection() {
		  System.out.println("Connecting to DB");
	  }
	 @AfterTest//after executing all test cases
	  public void CloseConnection() {
		  System.out.println("Close DB connection");
	  }
	 @BeforeMethod//Before executing every test
	  public void OpenBrowser() {
		  System.out.println("Opening Browser");
	  }
	 @AfterMethod//After executing every test
	  public void CloseBrowser() {
		  System.out.println("Closing Browser");
	  }
	 
	 @Test(priority=1, dataProviderClass=TestData1.class,dataProvider="GmailData")
	  public void GmailLogin(String UserName, String Password) {
		 System.out.println(UserName+"---"+Password);
		  
	  }
	
	 @Test(priority=2)
	  public void testRecieveMail() {
		  System.out.println("Testing Gmail Receiving Mail");
		  throw new SkipException("Skipping testcase");
	  }
	  @Test(priority=3)
	  public void testSendingMail() {
		  System.out.println("Testing Gmail Sending Mail");
	  }
	  
	  @Test(priority=4)
	  public void GmailLogout() {
		  System.out.println("Gmail Logout");
	  }
	  
	  @AfterSuite//once after executing all test in all java files
		public void CloseSelenium() {
			  System.out.println("Closing Selenium");
		  }
	  
	 /* @DataProvider
	  public Object[][] GmailData(){
		  
		  Object[][] data = new Object[2][2];
		  data[0][0]="Guser1";
		  data[0][1]="Gpass1";
		  
		  data[1][0]="Guser2";
		  data[1][1]="Gpass2";
		  
		  return data;
		  
	  }*/

}
