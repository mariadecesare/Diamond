/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author mariadecesare
 */
import java.util.Scanner;

public class MainDiamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();         
        
        Diamond diamond1 = new Diamond();
        
        
        diamond1.diamondShape(rows);
        

    }   
}
