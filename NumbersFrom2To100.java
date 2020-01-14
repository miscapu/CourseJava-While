/*
 * @Author: MiSCapu
 * @Version: 1.0
 * Topic: While Structures
 * Problem: Print the numbers from 2 to 100 but 2 in 2
 * 
*/

public class NumbersFrom2To100{
	public static void main(String[] args){
		//declare x variable
		int x;
		//initialize x variable in 2
		x = 2;

		//while structure
		while(x<=100){
			System.out.print(x);
			System.out.print(" - ");

			x = x+2;
		}
	}
}