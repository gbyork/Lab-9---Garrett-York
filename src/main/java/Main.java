
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rando
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Please enter length of the first tract of land");
        Scanner keyboard = new Scanner(System.in);
        
        //first tract
        double length1 = keyboard.nextDouble();
        
        System.out.println("Please enter width of the first tract of land");
        
        Double width1 = keyboard.nextDouble();
        
        //second tract

        System.out.println("Please enter length of the second tract of land");

        double length2 = keyboard.nextDouble();
        
        System.out.println("Please enter width of the second tract of land");
        Double width2 = keyboard.nextDouble();
        
        
        LandTract landtract1 = new LandTract(length1,width1);
        LandTract landtract2 = new LandTract(length2,width2);
        
        //printing and checking if both tracts of land are equal
        
        System.out.println("The area for these tracts of land would be " + landtract1.getArea() + " for the first tract and " + landtract2.getArea() + " for the second tract");
        
    
        if (landtract1.equals(landtract2)){
            
            System.out.println("The two tracts of land are equal.");
            
        }
        
        
                
    }
    
    
    
}
