/*
 * @Author: MiSCapu
 * @Version: 1.0
 * Topic: While Structures
 * Problem: Write a program than request the charge of the positive value and show us 
 * from 1 to the value entered 1 in 1.
 *
*/

//to request a value entered by keyboard we need of the Scanner Class
import java.util.Scanner;

public class NumbersEnteredForUser1{
	public static void main(String[] args){
		//instantiated EnterForUser
		Scanner EnterForUser = new Scanner(System.in);

		//declare x variable
		int x;
		//initialize x variable in 1
		x = 1;

		//We ask the user to enter a positive value
		System.out.print("Please, enter a value: ");
		//initialize value entered for the user
		int valueUser = EnterForUser.nextInt();

		//while structure
		while(x <= valueUser){
			System.out.print(" * ");
			System.out.println(x);

			x = x + 1;
		}  
		 
	}
}