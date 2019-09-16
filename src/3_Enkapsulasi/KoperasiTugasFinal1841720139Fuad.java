/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author MADHA
 */
import java.util.Scanner; 
public class KoperasiTugasFinal1841720139Fuad {

 static Scanner sc = new Scanner(System.in);
 static String nomorKtp, nama;
 static int limitPinjaman;
 static AnggotaTugasUbah1841720139Fuad member;
 public static void main(String[] args) {
     System.out.print("Input Nomor KTP : ");
     nomorKtp = sc.next();
     System.out.print("Input Nama : ");
     nama = sc.next();         
     System.out.print("Limit Pinjaman : ");
     limitPinjaman = sc.nextInt();
     member = new AnggotaTugasUbah1841720139Fuad(nomorKtp, nama, limitPinjaman);
        while (true) {
        menu();
        } 


 private static void menu() {
     int input = 0;
     System.out.println("     Menu");
     System.out.println("==============");
     System.out.println("1. pinjam");
     System.out.println("2. Angsur");
     System.out.println("3. Profil");
     System.out.println("4. quit");
     System.out.println("=============="); 
     System.out.print("Input : ");
     input = sc.nextInt();
     int uang = 0; 
    }
 
 switch (input) {
     case 1: 
         System.out.print("Input Nominal Pinjam : ");
         uang = sc.nextInt()
         member.pinjam(uang);
         System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjaman());
         break;
     case 2:
         System.out.print("Input Nominal Angsur : ");
         uang = sc.nextInt();
         member.angsur(uang); 
         System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjaman());
         break;
     case 3:
         System.out.println("Nomor Ktp : " + nomorKtp);
         System.out.println("Nama : " + member.getNama());
         System.out.println("Limit Pinjaman : " + member.getLimitPinjaman());                 System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjaman());
         break;
     case 4:
         System.exit(0);
     default:
         System.out.println("Input Salah");
        }
    } 
 }