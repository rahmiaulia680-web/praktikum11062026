/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum11062026;

import java.util.*;

/**
 *
 * @author Rahmi Aulia
 */
public class CekArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        try{
        int[] angka = {10,20,30,40,50};
        System.out.println("Data Array : ");
        for (int i=0;i<angka.length;i++){
            System.out.print(" "+angka[i]);
        }
        System.out.print("\nMau ditampilkan index ke berapa : ");
        int index = input.nextInt();
        System.out.println("Nilai array adalah = "+angka[index]);
        System.out.print("Mau dibagi dengan angka berapa : ");
        int n= input.nextInt();
        int hasil = angka[index]/n;
        System.out.println("Hasil pembagian : "+hasil);
        }
        catch(InputMismatchException e){
            System.out.println("Masukkan angka woi bukan huruff ");
        }
        catch(ArithmeticException e){
            System.out.println("\nNilai kedua atau pembagi tidak boleh 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index diluar range!!");
        }
        catch(Exception e){
            System.out.println("Error bosku, gatau kenapa");
        }
        finally{
            System.out.println("Program telah berhasil dijalankan");
        }
    }
    
}
