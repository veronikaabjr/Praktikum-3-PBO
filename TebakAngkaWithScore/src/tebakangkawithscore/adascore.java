/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangkawithscore;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author veronikaabjr
 */
public class adascore {
    int angka;
    int angkaRandom;
    int score = 100;
    int bonus = 50;
    int maxtebakbonus = 5;
    
    void mulaiMenebak(){
        Random r1 = new Random();
        this.angkaRandom = r1.nextInt(101);
        System.out.println("Hai... Nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!!!");
        do{
            Scanner a1 = new Scanner(System.in);
            System.out.print("Tebakan Anda : ");
            this.angka = a1.nextInt();
            
            if(score == 0){
                System.out.println("Sayang sekali, Score anda 0.");
                break;
            }
            if(angka == angkaRandom){
                System.out.println("Yeeee... Bilangan tebakan anda BENAR :-)");
                if(maxtebakbonus > 0){
                    System.out.println("Score :" + score);
                    System.out.println("Bonus : " + bonus);
                    System.out.println("Total Score :" + (score + bonus));
                }
                else{
                System.out.println("Score Anda : " + score);
                System.out.println("Bonus : 0");
                System.out.println("Total Score :" + score);
                }
            }
            else if(angka > angkaRandom){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
                score -= 2;
                maxtebakbonus -= 1;
            }
            else{
                System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
                score -= 2;
                maxtebakbonus -= 1;
                
            }
        }
        while(angka != angkaRandom);      
    }
}
