package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


@Test
public class GetData2 
{
	public void testResponsecode()
	{
		
		
	    int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		System.out.println("Status code is " +code );
		
		Assert.assertEquals(code, 200);
	}
	@Test
	public void testbody()
	{
		
		
		
		String data=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
		long time=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		
		System.out.println("Response time "+time);
	}
	
}
