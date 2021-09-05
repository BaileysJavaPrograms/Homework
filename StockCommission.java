/*Name:Bailey Pickett

Course:ITSE 2317

Date:9/4/2021

Assignment Description:Kaitlyn purchased some stock in an electronic car stock. Here are the details of the purchase:

The number of shares that Kaitlyn purchased was 1,000. (10 pts)

When Kaitlyn purchased the stock, he paid $45.50 per share.  (10 pts)

Kaitlyn paid his stockbroker a commission that amounted to 2 percent of the amount he paid for the stock.  (10 pts)

Two weeks later, Kaitlyn sold the stock. Here are the details of the sale:

The number of shares that Kaitlyn sold was 1,000.  (10 pts)

He sold the stock for $50.50 per share. (10 pts)

He paid his stockbroker another commission that amounted to 2 percent of the amount he received for the stock. (10 pts)

Write a program that displays the following information for any user not just Kaitlyn:  ( 10 pts)

The amount of money a user paid for the stock.

The amount of commission a user paid his broker when he bought the stock.

The amount that a user sold the stock for.

The amount of commission a user paid his broker when he sold the stock.

 */
import java.util.*;
import java.io.*;
public class StockCommission 
{

	public static void main(String[] args) 
	{
		//varibles being used
		int sharesBought  = 0;
		double  sharePrice = 0.0;
		double commission = 0.0;  //double = float
		int shareSold = 0;
		double salePrice = 0.0;
		double  sellcommission = 0.0;
		
		//turning on the keyboard for users
		Scanner kb = new Scanner (System.in);
	
		
		//display messages for the user to begin inputting their own shares, commission, prices of share, etc.
		System.out.print("How many shares did you buy?");
		sharesBought = kb.nextInt();
		
		System.out.print("What was the purchase price of the share?");
		sharePrice = kb.nextDouble();
		
		
		System.out.print("What percent commission did you pay?");
		commission = kb.nextDouble();
		
		System.out.print("How many shares did you sell?");
		shareSold =kb.nextInt();
		
		System.out.print("What was the sale price of the shares?");
		salePrice =  kb.nextDouble();
		
		System.out.print("What percent commission did you pay to sell the shares?");
		sellcommission =  kb.nextDouble();
		
		//calculations
		double purchasePrice = sharesBought * sharePrice ; //how i got the purchase price
		double purchaseCommission  = commission * purchasePrice; //how i got the purchase commission
		double amountRecievedForStock = salePrice * shareSold;// how i found the sale price
		double saleCommission = amountRecievedForStock  *sellcommission;//how i got the   sale commission
		double profit  = (amountRecievedForStock - purchasePrice - saleCommission -   purchaseCommission);//found the profit 101
		
		//display
		System.out.println("=====================================");// weird line thing on example haha
		
		System.out.printf("Purchase Price:$ %,.2f%n",purchasePrice);// purchase price
		
		System.out.printf("Purchase Commission:$ %,.2f%n",purchaseCommission); //purchase commission
		
		System.out.printf("Sale Price:$ %,.2f%n",amountRecievedForStock);//sale price
		
		System.out.printf("Sale Commission: $ %,.2f%n",saleCommission);//sale commission
		
		System.out.printf("Profit: $ %,.2f%n",profit);//profit
	}

}
