import java.util.Scanner;

public class WeatherReport 
{

	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Hello! Please enter your temperature in Farenheit!");
		
		int temp = cin.nextInt();
		
		int ans = temp;
		
		{
			ans = (((temp - 32)*5)/9);
		}
		
		System.out.println("You're temperature is" +" " + ans +" " + "centigrade");
		
		if(temp<=32)
		{
			System.out.println("It's cold outside!");
		}
		else if(temp>=90)
		{
			System.out.println("It's hot outside!");
		}
		cin.close();
			
	}

}