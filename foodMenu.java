/**
 * @(#)FoodMenu.java
 *
 *
 * @Shoueb Mamoor 
 * @version 1.00 2015/1/26
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class foodMenu 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
			
		String foodPrompt = (" Enter 1 for a Meatlover's Burger"
							+"\n Enter 2 for a Veggie Delight Burger"
							+"\n Enter 3 for the Daily Special Burger"
							+"\n Once complete, Enter 4: ");
		int ordersOnCheck=0, checkOption, members;
							
		double checkNumber=0, mBurger=4.99, vBurger=3.99, dBurger=6.99, tax=0.07, subTotal=0, grandTotal, suggestedTip, suggestedTipA, suggestedTipB, suggestedTipC;
		
		System.out.println("Welcome to Shoueb's Place! How many in your party?");
		members=keyboard.nextInt();
		
		if (members==1)
		{
			for (int choice=0; choice!=4; ordersOnCheck++)
			{
				System.out.print(foodPrompt);
				choice=keyboard.nextInt();
				System.out.println();
					if(choice==1)
					{
						System.out.println("The Meatlover's Burger is 4.99, Order taken.");
						subTotal+=mBurger;
						System.out.println();
					}
					else if(choice==2)
					{
						System.out.println("The Veggie Delight Burger is 3.99, Order taken.");
						subTotal+=vBurger;
						System.out.println();
					}
					else if(choice==3)
					{
						System.out.println("The Daily Special Burger is 6.99, Order taken.");
						subTotal+=dBurger;
						System.out.println();
					}
			}
				
			grandTotal=((subTotal*tax)+(subTotal));
			suggestedTipA=(grandTotal*0.20);
			suggestedTipB=(grandTotal*0.18);
			suggestedTipC=(grandTotal*0.15);
	
			System.out.println("Subtotal: "+subTotal);
			System.out.println("Taxes: "+(grandTotal-subTotal));
			System.out.println("Grand Total: "+grandTotal);
			System.out.println("Suggest Tips:"+
								"\n\t 20% "+(suggestedTipA)+
								"\n\t 18% "+(suggestedTipB)+
								"\n\t 15% "+(suggestedTipC));
			System.out.print("Number of Items Ordered: "+ (ordersOnCheck-1));
		}
	
		else
		{
			System.out.print("Will this be (1) all on one check or (2) seperate? ");
			checkOption=keyboard.nextInt();
			if(checkOption==1)
			{
				for (int choice=0; choice!=4; ordersOnCheck++)
				{
					System.out.print(foodPrompt);
					choice=keyboard.nextInt();
					System.out.println();
						if(choice==1)
						{
							System.out.println("The Meatlover's Burger is 4.99, Order taken.");
							subTotal+=mBurger;
							System.out.println();
						}
						else if(choice==2)
						{
							System.out.println("The Veggie Delight Burger is 3.99, Order taken.");
							subTotal+=vBurger;
							System.out.println();
						}
						else if(choice==3)
						{
							System.out.println("The Daily Special Burger is 6.99, Order taken.");
							subTotal+=dBurger;
							System.out.println();
						}

				}
					
				grandTotal=((subTotal*tax)+(subTotal));
				suggestedTipA=(grandTotal*0.20);
				suggestedTipB=(grandTotal*0.18);
				suggestedTipC=(grandTotal*0.15);
		
				System.out.println("Subtotal: "+subTotal);
				System.out.println("Taxes: "+(grandTotal-subTotal));
				System.out.println("Grand Total: "+grandTotal);
				System.out.println("Suggest Tips:"+
									"\n\t 20% "+(suggestedTipA)+
									"\n\t 18% "+(suggestedTipB)+
									"\n\t 15% "+(suggestedTipC));
				System.out.print("Number of Items Ordered: "+ (ordersOnCheck-1));
			}
			else
			{
				while (members>0)
				{
					for (int choice=0; choice!=4; ordersOnCheck++)
					{
						System.out.print(foodPrompt);
						choice=keyboard.nextInt();
						System.out.println();
						if(choice==1)
						{
							System.out.println("The Meatlover's Burger is 4.99, Order taken.");
							subTotal+=mBurger;
							System.out.println();
						}
						else if(choice==2)
						{
							System.out.println("The Veggie Delight Burger is 3.99, Order taken.");
							subTotal+=vBurger;
							System.out.println();
						}
						else if(choice==3)
						{
							System.out.println("The Daily Special Burger is 6.99, Order taken.");
							subTotal+=dBurger;
							System.out.println();
						}

					}	
				
					System.out.println("FOR THIS CHECK: ");
					grandTotal=((subTotal*tax)+(subTotal));
					suggestedTipA=(grandTotal*0.20);
					suggestedTipB=(grandTotal*0.18);
					suggestedTipC=(grandTotal*0.15);
	
					System.out.println("Subtotal: "+subTotal);
					System.out.println("Taxes: "+(grandTotal-subTotal));
					System.out.println("Grand Total: "+grandTotal);
					System.out.println("Suggest Tips:"+
										"\n\t 20% "+(suggestedTipA)+
										"\n\t 18% "+(suggestedTipB)+
										"\n\t 15% "+(suggestedTipC));
					System.out.print("Number of Items Ordered: "+ (ordersOnCheck-1));
					System.out.println();
					System.out.println();
					ordersOnCheck-=ordersOnCheck;
					subTotal-=subTotal;
					members--;
				}
			}
		}
	}
}	 

 
    
