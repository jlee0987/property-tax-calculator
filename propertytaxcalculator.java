package project1;
import java.util.*; 

/*
Description: This program calculates property tax based on the assessed value of a property. 
*/

public class propertytaxcalculator {
	
public static void main(String[] args) {
		
		//declaring console to input data using the scanner
		Scanner console = new Scanner(System.in);
		
		//defining constant or finals
		final double taxRate = 0.92; //tax rate to calculated assessed value of the property 
		final double propertyTaxRate = 1.05; //property tax rate for each $100 of the assessed value
		
		//input variables
		String myName; //input variable to store the user's name
		double myPropertyValue; //input variable to store the user's property value

		//output variables
		double propertyTax; //output variable to store the property tax
		double taxableAmount; //output variable to store the taxable amount
		
	//ask the user for input
	System.out.print("What is your first and last name?:\n");
	myName= console.nextLine();
	
	System.out.print("\nWhat is the value of your property?:\n");
	myPropertyValue= console.nextDouble();
	
	//do the calculations
	taxableAmount = (myPropertyValue * taxRate);
	propertyTax = ((taxableAmount/100) * propertyTaxRate);
	
	//output
	System.out.printf("\nProperty Tax Report For: %19s\n", myName);
	System.out.printf("\nAssessed Value:                  $%12.2f\n",myPropertyValue);
	System.out.printf("Taxable Amount:                  $%12.2f%n",taxableAmount);
	System.out.printf("Tax Rate for each $100.00:       $%12.2f%n",propertyTaxRate);
	System.out.printf("Property Tax:                    $%12.2f%n",propertyTax);
	
			
	}//end main

} //end of class
