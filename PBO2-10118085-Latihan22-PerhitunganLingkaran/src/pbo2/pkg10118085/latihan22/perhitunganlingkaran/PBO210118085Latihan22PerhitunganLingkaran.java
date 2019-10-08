/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan22.perhitunganlingkaran;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
* Deskripsi Program : Perhitungan Lingkaran
 */
public class PBO210118085Latihan22PerhitunganLingkaran {
    public static int diameter, jari;
    public static double luas, keliling;
    public static void main(String[] args) {
        boolean sukses = false;
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("====== Perhitungan Lingkaran ======");
        while(!sukses ){
 
            System.out.print("Masukan nilai diameter lingkaran : ");
            if(scanner.hasNextInt()){
                diameter = scanner.nextInt();
                sukses = true;
            }else{
                System.out.println("Tidak Sesuai");
                scanner.next();
            }
        }
        System.out.println("===== Hasil Perhitungan Lingkaran =====");
        jari = diameter/2;
        System.out.println("Jari-jari Lingkaran = " + jari);
        luas = Math.PI*(jari*jari);
        System.out.printf("Luas Lingkaran = %.2f%n" , luas);
        keliling = 2 * Math.PI*jari;
        System.out.printf("Keliling Lingkaran = %.2f%n" , keliling);
    }
}