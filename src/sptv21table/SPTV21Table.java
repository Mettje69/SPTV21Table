/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21table;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anatoli
 */
public class SPTV21Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int correctAnswers = 0;
        int Answers = 0;
        Random numGenerator = new Random();
        Scanner inputScanner = new Scanner(System.in);
        int[] nums =  new int[2];

        while(Answers != 5) {
            nums[0] = numGenerator.nextInt(9)+1;
            nums[1] = numGenerator.nextInt(9)+1;
            System.out.print(nums[0]+" * "+nums[1]+" = ");
            int answer = inputScanner.nextInt();
            ++Answers;
            if(answer == nums[0]*nums[1]) {
                System.out.println("Correct.");
                ++correctAnswers;
            }
            else

                System.out.println("Wrong, Try again." );
        }

        System.out.println("You got "+correctAnswers+" answer(s) right");
        
    }
    
}
