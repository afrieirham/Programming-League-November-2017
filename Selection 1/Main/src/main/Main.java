/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
        
//        Scanner input = new  Scanner (System.in);
//        long ans;
//        
//        while(input.hasNextLong()){
//            long a = input.nextLong();
//            long b = input.nextLong();
//            
//            ans = a-b;
//            
//            if(ans<0)
//                ans*=-1;
//            
//            System.out.println(ans);
//        }
//        
//    }
//        
//    
//}
        
        
        
        
        int [] a = new int[1000];
        int [] b = new int[1000];
        int [] c = new int[1000];
        
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
        
            for(int i=0; i<3 ; i++){
                a[i] = input.nextInt();
                b[i] = input.nextInt();

                c[i] = a[i]-b[i];

                if (c[i]<0)
                    c[i] *=-1;
        }
        
        
        for(int i=0; i<3 ; i++){
            System.out.println(c[i]);
        }
        }
    
    }
}