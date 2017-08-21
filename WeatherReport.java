// Lukas Albin

// Weather Report program

// 8/21/17

import java.util.Scanner; // imports scanner

public class WeatherReport
{

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); // Scanner becomes System in
		
		System.out.println("Hello! Please enter your temperature in Farenheit!"); 
		
		int temperature = cin.nextInt(); // introduces variable "temperature"
		
		int ans = temperature; // introduces variable "ans" that = "temperature"
		
		{
			ans = (((temperature - 32)*5)/9);   
		}
		
		System.out.println("You're temperature is" +" " + ans +" " + "centigrade."); 
		
		if(temperature<=32) 
		{
			System.out.println("It's cold outside!"); 
		}
		else if(temperature>=90) 
		{
			System.out.println("It's hot outside!"); 
		}
		cin.close(); // close the cin
			
	}

}