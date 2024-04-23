/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

/**
 *
 * @author Jovanca Morris
 */
import java.util.Scanner;

public class Garden {
    
    int pil, siramAir, beriPupuk, keadaan;
    String tanaman;
    Scanner inp = new Scanner(System.in);
    
    public void declar(){
        System.out.println("TANAM KUY");
        System.out.println("Presented by DJ\n");
        System.out.println("====================\n");
        siramAir = 0;
        beriPupuk = 0;
        keadaan = 0;
    }
    
    public void input(){
        for(int i = keadaan; keadaan <= 3; i++){
        System.out.println("Status Tanaman = " + umur());
        System.out.println("Sudah Disiram Sebanyak = " + siramAir + " kali");
        System.out.println("Sudah Diberi Pupuk Sebanyak = "+ beriPupuk + " kali\n");
        System.out.println("[1] Siram\n[2] Pupuk");
        System.out.print("Masukkan Pilihan Anda = ");
        pil = inp.nextInt();
        System.out.println("\n");
        pilihan();
        }
        if (keadaan == 4){
            System.out.println("Status Tanaman Anda = Sudah "+ umur());
        }
    }
    
    public void pilihan(){
        if(pil == 1){
            siram();
        }else if(pil == 2){
            pupuk();
        }else{
            System.out.println("Pilihan Anda Salah, Masukkan Pilihan Yang Benar (1 / 2)\n");
        }
    }
    
    public void siram(){
        siramAir++;
        tumbuh();
    }
    
    public void pupuk(){
        beriPupuk++;
        tumbuh();
    }
    
    public void tumbuh(){
        if (siramAir >= 3 && beriPupuk >=1 ){
            tanamanTumbuh();
        }
    }
    
    public void tanamanTumbuh(){
        if(keadaan <= 5){
            siramAir = siramAir - 3;
            beriPupuk = beriPupuk - 1;
            keadaan++;
        }
    }
    
    public String umur(){
        switch (keadaan) {
            case 0:
                tanaman = "Benih";
                break;
            case 1:
                tanaman = "Tunas";
                break;
            case 2:
                tanaman = "Tanaman Kecil";
                break;
            case 3:
                tanaman = "Tanaman Besar";
                break;
            case 4:
                tanaman = "Berbunga";
        }
        return tanaman;
    }
    
    public static void main(String[] args){
        Garden tarik = new Garden();
        
        tarik.declar();
        tarik.input();
    }
    
}
