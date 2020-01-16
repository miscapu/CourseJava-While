/*
 * @Author: MiSCapu
 * @Version: 1.0
 * Topic: While Structures
 * Problem: Develop a program that allows the loading of 10 values by keyboard and then we show the sum 
 * of the input values and their average.
 *
*/

//For allows the loading of values by keyboard, we need of the Scanner Class
import java.util.Scanner;

public class NumbersEnteredSumAverage{
	public static void main(String[] args){
            //instantiated EnterForUser values
            Scanner EnterForUser = new Scanner(System.in);
            
            /*declare count(cycles while), acumulator(sum of the valuesEntered), 
            * valueEntered and average variable
            */
            int countX;
            //initialize countX variable
            countX =1;
            int acumulator;
            //initialize acumulator(sum values) in 0. "The first sum =0"
            acumulator = 0;
            int valueEntered;
            int average;
            
            
            //We requested to the user for enter 10 values, using while Structure
            while(countX <= 10){
            System.out.print("Please, enter a value: ");
            valueEntered = EnterForUser.nextInt();
            //acumulator variable must be the same to sum(acumulator) + value entered 
            //for the user(value Entered)
            acumulator = acumulator + valueEntered;
            countX = countX + 1;
            }
            average = acumulator/10;
            //showing sum of the numbers
            System.out.println("The sum of the numbers is: "+acumulator);
            //showing average of the numbers
            System.out.println("The average of the numbers is: "+average);
        }
}