/*
 * Nama  : Rahmi Aulia
 * NIM   : 2501083021 
 */
package com.mycompany.praktikum11062026;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rahmi Aulia
 */
public class CekAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int hasil;
        try{
        System.out.print("Masukkan bilangan pertama : ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        b = input.nextInt();
        hasil = a/b;
        System.out.println(a+" / "+b+ " = "+hasil);
        }
        catch(InputMismatchException e){
            System.out.println("Masukkan angka woi bukan huruff ");
        }
        catch(ArithmeticException e){
            System.out.println("\nNilai kedua atau Penyebut tidak boleh 0");
        }
        catch(Exception e){
            System.out.println("Error bosku, gatau kenapa");
        }
        finally{
            System.out.println("Program telah berhasil dijalankan");
        }
    }
}

