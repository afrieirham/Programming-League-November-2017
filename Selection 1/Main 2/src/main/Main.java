/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        
        int [] input = new int[n];
        
        for(int i=0; i<n; i++){
            Scanner scan = new Scanner(System.in);
            input[i] = scan.nextInt();
            
            input[i]*=567;
            input[i]/=9;
            input[i]+=7492;
            input[i]*=235;
            input[i]/=47;
            input[i]-=498;
        }
        
        
        
        for(int i=0; i<n; i++){
            input[i]%=100;
            
            if(input[i]<0)
                input[i] *=-1;
            
            input[i] /=10;
            
            System.out.println(input[i]);
        }            
        
    }
    
}
