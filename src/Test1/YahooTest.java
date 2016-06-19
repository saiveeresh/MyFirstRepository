package Test1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooTest {
	
	@Test(priority=1,dataProvider="YahooData")
	public void YahooLogin(String UserName, String Password){
		
		System.out.println(UserName+"---"+Password);
		
	}
	
	 @Test(priority=2)
	  public void testRecieveMail() {
		  System.out.println("Testing Yahoo Receiving Mail");
	  }
	  @Test(priority=3)
	  public void testSendingMail() {
		  System.out.println("Testing Yahoo Sending Mail");
		  Assert.assertEquals("Good", "Bad");
	  }
	  
	  @Test(priority=4)
	  public void YahooLogout() {
		  System.out.println("Yahoo Logout");
	  }
	

	  @DataProvider
	  public Object[][] YahooData(){
		  
		  Object[][] data = new Object[2][2];
		  data[0][0]="Yuser1";
		  data[0][1]="Ypass1";
		  
		  data[1][0]="Yuser2";
		  data[1][1]="Ypass2";
		  
		  return data;
		  
	  }
	  
	  
}
