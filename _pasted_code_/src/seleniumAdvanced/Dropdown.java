package seleniumAdvanced;
import java.util.List;

public class Dropdown {

	public static <WebDriver> void main(String[] args) {
		// TODO Auto-generated method stub
		{
			
			WebDriver driver = new WebDriver();
			//open and launch url 
			
			driver.get("http://www.facebook.com");
			
			driver.manage().window().maximize();
			
			WebElement monthdd=driver.findElement (By.xpath("//select[@id='month']"));
			
			Select Month= new Select (monthdd);
			
			Month.selectByIndex(2);
						
			Month.selectByValue("11");
									
			Month.selectByVisibleText("Aug");
							
			WebElement selectedmonth=Month.getFirstSelectedOption();
			
			System.out.println("Selected Month is " + selectedmonth.getText());
					
			List <WebElement> Monthlist = Month.getOptions();
			
			int totalmonth=Monthlist.size();
			
			System.out.println("Total month is " + totalmonth);
					
	             
			
		}
		
		
	}
		
}


