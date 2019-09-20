package Latihan;

import java.util.Scanner;

public class latihanPraktikum {

    public static void latihan1() {
        // praktikum 01
        System.out.println("Latihan 1");
        String cari;
        boolean found = false;
        String[] buah = new String[8];
        buah[0] = "apel";
        buah[1] = "manggis";
        buah[2] = "kiwi";
        buah[3] = "jeruk";
        buah[4] = "kiwi";
        buah[5] = "duku";
        buah[6] = "pisang";
        buah[7] = "anggur";

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan nama buah yang ingin Anda beli: ");
        cari = keyboard.nextLine();

        for (String buah1 : buah) {
            if (cari.equals(buah1)) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("tersedia : " + found);
        } else {
            System.out.println("sold out");
        }
    }
    
//praktikum02
public static void praktikum2(){
    System.out.println("Latihan 2");
int cari;
        boolean found = false;
        int[] data = new int[]{8, 90, 56, 90, 87, 76, 42};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari");
        cari = keyboard.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                found = true;
                System.out.println("Data ditemukan pada indeks ke-" + i);
            }
        }
        if (found != true){
            System.out.println("Data tidak ditemukan!");
        }
}

//praktikum 3
public static void praktikum03(){
    System.out.println("Latihan 3");
    int max = 5;
    int [] data = new int [] {-5,-4,-3,2,-1,0,1,2,3,4,5};
    System.out.println("Data pada aray: ");
    for (int i = 0; i < data.length; i++){
        System.out.print(data[i]+"\t");
        if  (data[i]>max){
        max = data[i];
    }
    }
    System.out.println("\n Data terbesar dari array adalah " + max);
}

//praktikum 4
public static void praktikum04(){
    System.out.println("Latihan 4");
    Scanner keyboard = new Scanner (System.in);
    String  cari;
    System.out.print("Masukkan kata/kalimat: ");
    cari = keyboard.nextLine();
    
    int r = 0;
    for (int i = 0; i < cari.length(); i++){
        if (cari.charAt(i) == 'r'){
            r++;
        }
    }
    System.out.println("Jumlah huruf r pada kalimat Anda adalah " + r);
}

public static void main (String[]args){
    latihan1();
    praktikum2();
    praktikum03();
    praktikum04();
} 
}
