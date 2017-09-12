package generalFunctions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.Screen;

public class Functions {

	ChromeOptions chromeOptions = new ChromeOptions();
	public static String driverPath = "C:\\Users\\abdv220\\workspace\\all External jars\\";	
	public WebDriver driver;
	Screen s= new Screen();
	
	 public String sikulImages="C:\\Users\\abdv220\\git\\ABSA_FrameWork_Selinium\\ABSA_AutomationFrameWork_CIB\\SikuliImages";
	
	
	
	
public static void main(String[]args) throws FileNotFoundException, ParseException{
      
    	String path = "\\\\22.149.62.84\\pr\\SITIN\\AOFIRA22082017-PRO20170822145338.csv";
    	
    	generalFunctions.Functions.CreateFile_SRF(path);
    	
    	
    	
    }
    

public static void CreateFile_SRF(String path) throws FileNotFoundException

{
	
	PrintWriter pw = new PrintWriter(new File(path));
    StringBuilder sb = new StringBuilder();
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date date = new Date();
    Calendar c = Calendar.getInstance();    
    c.add(Calendar.DATE, 60);
   
    //SRF File  //        
  
    sb.append("EXPORT_DATE,,,,,,,,,,,,,,,,,");        
    sb.append('\n');
    sb.append("22-Aug-2017 14:15 (SAST),,,,,,,,,,,,,,,,,");        
    sb.append('\n');               
    
    //sb.append('"');
    sb.append("Offer Acceptance Date");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append("Advanced Value");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Obligor External ID");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Program Name");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Obligor");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Currency");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("FI Payment");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Invoice Reference");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Repayment Date");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("SP Rate Amount");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("FI Rate and Base Amount");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Seller External ID");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Seller");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append("Supplier Receipt");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append("Trade Payment Date");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append("Offer Reference");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append("Tenor Days (Trade payment to Repayment)");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append("Invoice Value");
    //sb.append('"');        
    sb.append('\n');
    
    

    //sb.append('"');
    sb.append(dateFormat.format(date));
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append(3341.16);
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append(79044);
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Farmwise on ABSA: Woolworths (79044)");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Woolworths (Pty) Ltd");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("ZAR");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append(3281.66);
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("INV21484");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');     
    sb.append(dateFormat.format(c.getTime()));
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append(2.14);
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append(59.5);
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Farmwise");
    //sb.append('"');
    sb.append(',');
    //sb.append('"');
    sb.append("Farmwise Marketing (Pty) Ltd");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append(3279.52);
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append(dateFormat.format(date));
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append("SCQCGOSQITKNDCY");
    //sb.append('"');        
    sb.append(',');
    //sb.append('"');
    sb.append(60);
    //sb.append('"');       
    sb.append(',');
    //sb.append('"');
    sb.append(3712.4);
    //sb.append('"');        
    sb.append('\n');

    pw.write(sb.toString());
    pw.close();
    System.out.println("done!");




}



public void AD_ConfirmTradeLoan() throws Exception {
    
	try{ 	
		
		
		
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		//driver = new ChromeDriver();
	    // driver = new FirefoxDriver();

	  chromeOptions.addArguments("--start-maximized");
	  driver = new ChromeDriver(chromeOptions);		      
	 
      driver.get("http://22.149.62.84:8088/auth/realms/supplierfinance/protocol/openid-connect/auth?client_id=supplierfinance-app&redirect_uri=http%3A%2F%2F22.149.62.84%3A9085%2F%3Fredirect_fragment%3D%252F&state=f8901771-49fd-445e-a680-7367ae52a347&nonce=8a2b393a-996b-4484-8634-a316317442e1&response_mode=fragment&response_type=code");
    
      
      s.click(sikulImages+"maximize.png");
      driver.findElement(By.id("username")).clear();
      driver.findElement(By.id("username")).sendKeys("abdv220");
      driver.findElement(By.id("password")).clear();
      driver.findElement(By.id("password")).sendKeys("Deepak@123");	      
      driver.findElement(By.id("kc-login")).click();
    
	      
	     
	    }
	    catch (Exception e) {e.printStackTrace();}
       
	



}


}




