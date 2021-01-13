package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Balok blk=new Balok();
        Scanner in=new Scanner(System.in);
        int i=1;
        java.io.File file = new java.io.File("TugasProject.txt");
        System.out.println("========================");
        System.out.println("======TUGAS PROJECT=====");
        System.out.println("====KALKULATOR BALOK====");
        System.out.println("========================");
        System.out.print("Masukkan Panjang: ");
        blk.panjang=in.nextDouble();
        System.out.print("Masukkan Lebar  : ");
        blk.lebar=in.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        blk.tinggi=in.nextDouble();
        try {
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.println("========================");
            output.println("======TUGAS PROJECT=====");
            output.println("====KALKULATOR BALOK====");
            output.println("========================");
            output.println("Masukkan Panjang: "+blk.panjang+" cm");
            output.println("Masukkan Lebar  : "+blk.lebar+" cm");
            output.println("Masukkan Tinggi : "+blk.tinggi+" cm");
            output.println("Keliling : "+blk.Keliling()+" cm");
            output.println("Luas Permukaan : "+blk.Luaspermukaan()+" cm2");
            output.println("Volume : "+blk.Volume()+" cm3");
            if(blk.panjang<blk.lebar){
                throw new Exception("Inputan nilai Panjang harus lebuh besar dari nilai Lebar !!");
            }if(blk.lebar<blk.tinggi){
                throw new Exception("Inputan nilai Lebar harus lebih besar dari nilai Tinggi !!");
            }
            blk.balok();
            output.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
