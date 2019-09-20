/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tugasPraktikum {
    public static void tugas1(){
        System.out.println("TUGAS 1");
        int found;
        int a = 0;
        int [] data = new int [] {74,98,72,74,72,90,81,72};
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Pilih bilangan : ");
        found = keyboard.nextInt();
        System.out.println("Data yang tersedia");
        for (int i = 0; i < data.length; i++){
            System.out.print(data [i]+ "\t");
            if(found == data[i]){
                a++;       
            }
            
            System.out.println();
        }
        System.out.println("tersedia :" + a);
    }
    
    
    public static void tugas2 (){
        System.out.println("TUGAS 2");
        int nilai [] = new int [] {83,76,45,90,85,80,78,74};
        double ratarata=0;
        System.out.println("Data pada array : ");
        for (int i = 0; i < nilai.length; i++){
            System.out.print(nilai[i]+"\t");
            ratarata+=nilai[i];
        }
        ratarata/=nilai.length;
        System.out.println("\n");
        System.out.println("Nilai rata-rata : " + ratarata);
        for (int i = 0; i<nilai.length; i++){
            if (nilai[i]>ratarata){
                int y = nilai[i];
                System.out.println("Nilai di atas rata-rata: " + y);
            }
        }
    }
    
    public static void tugas3 (){
        System.out.println("TUGAS 3");
        int a = 0;
        int hasil = 0;
        int [] nilai = new int []{92,98,76,72,84,101,39};
        System.out.print("Data pada array: ");
        for (int i = 0; i < nilai.length; i++){
            System.out.print(nilai [i] + "\t");
        }
        System.out.println();
        System.out.println("Bilangan kelipatan tiga adalah: ");
        for (int i = 0; i < nilai.length; i++){
            if (hasil == nilai [i] % 3){
                a++;
                System.out.println(nilai[i]);
            }
        }
    }
    
    public static void tugas4 (){
        System.out.println("TUGAS 4");
        Scanner keyboard = new Scanner (System.in);
        String found;
        System.out.println("Masukkan kalimatmu : ");
        found = keyboard.nextLine();
        int a = 0;int b = 0; int c = 0; int d = 0; int e = 0;
        for (int i = 0; i < found.length(); i++){
        if (found.charAt(i)== 'a'){
            a++;
        }
        if (found.charAt(i)== 'e'){
            b++;
        }
        if (found.charAt(i)== 'i'){
            c++;
        }
        if (found.charAt(i)== 'o'){
            d++;
        }
        if (found.charAt(i)== 'u'){
            e++;
        }
    }
        System.out.println("Jumlah huruf a pada kalimat Anda adalah: " + a);
        System.out.println("Jumlah huruf e pada kalimat Anda adalah: " + b);
        System.out.println("Jumlah huruf i pada kalimat Anda adalah: " + c);
        System.out.println("Jumlah huruf o pada kalimat Anda adalah: " + d);
        System.out.println("Jumlah huruf u pada kalimat Anda adalah: " + e);
    
    }
    
    public static void main(String[]args){
        tugas1();
        tugas2();
        tugas3();
        tugas4();
    }
}
