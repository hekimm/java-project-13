/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ana para miktarını giriniz:");
        int anaPara =scanner.nextInt();
        double faizOrani = 0.06;
        System.out.println("Kaç yıl vade ile yatırmak istiyorsunuz");
        int vadeYilSayisi = scanner.nextInt();
        int i =0;
       
        while(i<=vadeYilSayisi){
            anaPara += anaPara*faizOrani*vadeYilSayisi;
            i++;
            
        }
        
        System.out.println("Paranızın " + vadeYilSayisi + " yıl sonundaki  faizli tutarı"+ anaPara);
        



    }
    
}
