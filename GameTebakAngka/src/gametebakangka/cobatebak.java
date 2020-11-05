/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author veronikaabjr
 */
public class cobatebak {
    int angka;
    int angkaTersimpan;
    
    void mulaiMenebak(){
        Random r1 = new Random();
        this.angkaTersimpan = r1.nextInt(101);
        System.out.println("Hai... Nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!!!");
        do{
            Scanner a1 = new Scanner(System.in);
            System.out.print("Tebakan Anda : ");
            this.angka = a1.nextInt();
            if(angka == angkaTersimpan){
                System.out.println("Yeeee... Bilangan tebakan anda BENAR :-)");
                break;
            }
            else if(angka > angkaTersimpan){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
            }
            else{
                System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
            }
        }
        while(angka != angkaTersimpan);
    }
}