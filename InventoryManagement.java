package inventoryManagement;

import java.util.Scanner;

public class InventoryManagement {
	public static void main(String[] args) {
		int numSoda = 100;
		int numChips = 40;
		int numCandy = 60;
		int restockSoda = 40;
		int restockChips = 20;
		int restockCandy = 40;
		int sodaSold;
		int chipsSold;
		int candySold;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to the restocking tool!");
		
		System.out.println("How many sodas have been sold today? The stock is " + numSoda);
		sodaSold = sc.nextInt();
		
		if (sodaSold > numSoda) {
			System.out.println("The number " + sodaSold + " is too high. Stock value not adjusted");
		} else {
			numSoda = numSoda - sodaSold;
			System.out.println("There are " + numSoda + " sodas left");
		}
		
		System.out.println("How many chips have been sold today? The stock is " + numChips);
		chipsSold = sc.nextInt();
		
		if (chipsSold > numChips) {
			System.out.println("The number " + chipsSold + " is too high. Stock value not adjusted");
		} else {
			numChips = numChips - chipsSold;
			System.out.println("There are " + numChips + " chips left");
		}
		
		System.out.println("How much candy has been sold today? The stock is " + numCandy);
		candySold = sc.nextInt();
		
		if(candySold > numCandy) {
			System.out.println("The number " + candySold + " is too high. Stock value not adjusted");
		} else {
			numCandy = numCandy - candySold;
			System.out.println("There are " + numCandy + " candy left");
		}
		
		System.out.println("Thank you! Based on your input, these need to be restocked: ");
		
		if(numSoda <= restockSoda) {
			System.out.println("Soda needs to be restocked");
		}
		
		if(numChips <= restockChips) {
			System.out.println("Chips need to be restocked");
		}
		
		if(numCandy <= restockCandy) {
			System.out.println("Candy needs to be restocked");
		}
	}
}
