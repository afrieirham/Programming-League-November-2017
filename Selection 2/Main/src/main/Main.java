/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float a,b,c;
        
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Enter 3 length of triangle:");
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();

            if ((a==0) ||(b== 0) || (c==0)){
                break;
            }
            if ((a>30000) || (b>30000) || (c>30000)){
                System.out.println("Limit exceeded");
                break;
            }
            if ((a<0) || (b<0) || (c<0)){
                break;
            }


            tri(a,b,c);
        }while((a!=0) && (b!= 0) && (c!=0));
        
    }
    
    public static void tri(float a, float b, float c){
        
        float ans1 = (float) sqrt((a*a)+(b*b));
        float ans2 = (float) sqrt((a*a)+(c*c));
        float ans3 = (float) sqrt((c*c)+(b*b));
        
        
        if((ans1==c) || (ans2==b) || (ans3==a)){
            System.out.println("Right");
        }
        else{
            System.out.println("Wrong");
        }
    }
    
}
