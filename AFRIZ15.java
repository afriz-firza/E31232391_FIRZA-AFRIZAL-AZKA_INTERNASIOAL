/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.afriz15;

import java.util.Scanner;

/**
 *
 * @author AFRIZ
 */
public class AFRIZ15 {

    public static void main(String[] args) {
        
    
        Scanner scan;
       int octalNumber;
       scan = new Scanner (System.in);
        System.out.println("input any octal number :");
        octalNumber = Integer.parseInt( scan.nextLine(), 8);
        
        String binaryNumber = Integer.toBinaryString(octalNumber);
        System.out.println("Equivalent binary number:" + binaryNumber);
        
    } 
    
}    