package Test1;

import org.testng.annotations.DataProvider;

public class TestData1 {
	
	 @DataProvider
	  public static Object[][] GmailData(){
		  
		  Object[][] data = new Object[2][2];
		  data[0][0]="Guser1";
		  data[0][1]="Gpass1";
		  
		  data[1][0]="Guser2";
		  data[1][1]="Gpass2";
		  
		  return data;
		  
	  }

}
