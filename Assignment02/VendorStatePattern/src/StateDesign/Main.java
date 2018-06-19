package StateDesign;

import java.util.Scanner;

/**
 * Created by Subangkar on 19-Jun-18.
 */
public class Main {
	
	
	public static void main( String[] args ) {
		DrinkSupply[] drinkSupply = { new DrinkSupply( "Dew" , 25 , 3 ) ,
				new DrinkSupply( "RC" , 25 , 5 ) ,
				new DrinkSupply( "Coca-Cola" , 25 , 1 ) ,
				new DrinkSupply( "Fanta" , 25 , 7 ) , };
		
		VendingMachine vendingMachine = new VendingMachine( drinkSupply );
		
		
		Scanner scanner = new Scanner( System.in );
		int choice = 5;
		while (choice != 0) {
			System.out.println( "1.Insert Coin 2.Select Drink 3.Get Drink 4.Get Extra Inserted Cash\n0.Exit" );
			System.out.println( "Enter a choice: " );
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					vendingMachine.insertCoin();
					break;
				case 2:
					vendingMachine.selectItem();
					break;
				case 3:
					vendingMachine.getDrinks();
					break;
				case 4:
					vendingMachine.getMoney();
					break;
			}
		}
	}
	
}