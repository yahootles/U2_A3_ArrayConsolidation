/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_arrayconsolidation;

/**
 *
 * @author antho6229
 */

import java.util.Scanner;
//<|°_°|>
public class U2_A3_ArrayConsolidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kinput = new Scanner(System.in);
        
        //variable declaration
        int numMarks = 0;
        double[] marks;
        double sum = 0;
        double average;
        
        //get input of the number of marks
        System.out.println("Hello. I am the MAKMEDIAN-5798. Enter the number of marks you wish to find the average of.");
        numMarks = kinput.nextInt();
        
        //initialize the array
        marks = new double[numMarks];
        
        //fill the array with doubles entered by user
        System.out.println("Enter the marks one at a time:");
        for(int i = 0; i < numMarks; i++){
            marks[i] = kinput.nextDouble();
            sum += marks[i];
        }
        
        System.out.println("\nThe numbers you entered are:");
        for(int i = 0; i < numMarks; i++){
            System.out.println(marks[i]);
        }
        
        //calculate average
        average = sum/numMarks;
        average = (int)(average*100);
        average/=100;
        
        
        System.out.println("\n\nThe average is: " + average);
    }
    
}
