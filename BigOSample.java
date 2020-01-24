/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author int320
 */
public class BigOSample {
    static Scanner sc = new Scanner(System.in);
    static final int N = sc.nextInt();
    static Random r = new Random();
    
    public static void main(String[] args) {
        long mp = MyProgram();
        long as = ArraySort();
        if(mp > as){
            System.out.println("My program's execution time is more than Arrays.sort for " + (mp-as) + " Milliseconds.");
        }
        else if(mp == as){
            System.out.println("My program's execution time is equal Arrays.sort in " + mp + " Milliseconds.");
        }
        else{
            System.out.println("My program's execution time is less than Arrays.sort for " + (as-mp) + "Milliseconds");
        }
    }
    
    public static long MyProgram(){
        int temp;
        int n = N;
        int[] a = new int[n];
        System.out.println("-------------------------------------");
        System.out.println("Putting in " + n + " random integers.");
        System.out.println("-------------------------------------");
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        
        long startTime  = System.currentTimeMillis();
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("My program's execution time : " + (System.currentTimeMillis() - startTime));
        return System.currentTimeMillis() - startTime;
    }
    
    public static long ArraySort(){
        int temp;
        int n = N;
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        
        long startTime  = System.currentTimeMillis();
        Arrays.sort(a);
        System.out.println("Arrays.sort's execution time : " + (System.currentTimeMillis() - startTime));
        System.out.println("-------------------------------------");
        return System.currentTimeMillis() - startTime;
    }
}
