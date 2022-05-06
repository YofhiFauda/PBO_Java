//Nama  : Yofhi Fauda Pradana
//Nim   : 21533425
//Kelas : Teknik Informatika
//Membuat Program Kalkulator

package program.tugas4;
import java.util.*;
public class Tugas4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
              int nilai,pilih;
              double a,b,hasil;
              do {
               System.out.println("""
                 ______________________________________
                |_________________BIODATA______________|
                |                                      |
                |     Nama    = Yofhi Fauda Pradana    | 
                |     NIM     = 21533425               | 
                |     Kelas   = Teknik Informatika     | 
                |     Tugas   = PBO                    |             
                |______________________________________|  """);
    System.out.println("\nPilih Operator => ");
    System.out.println("""
            \t\t (1) Operator Pertambahan
            \t\t (2) Operator Pengurangan
            \t\t (3) Operator Pembagian
            \t\t (4) Operator Perkalian""");   
              
              
              System.out.print("Pilih Operator Sesuai Nomer : ");
              nilai = input.nextInt();
              System.out.print("Masukkan nilai 1 : ");
              a = input.nextDouble();
              System.out.print("Masukkan nilai 2 : ");
              b = input.nextDouble();
           switch (nilai) {
               case 1 -> {
                   hasil = a+b;
                   System.out.println( a + " + " + b + " = " +hasil);
                   System.out.println("Hasil penjumlahan: " + hasil);
                   System.out.println("===================================================");
                   break;
               }
               case 2 -> {
                   hasil = a - b;
                   System.out.println( a + " - " + b + " = " +hasil);
                   System.out.println("Hasil pengurangan: " + hasil);
                   System.out.println("===================================================");
                   break;
               }
               case 3 -> {
                   hasil = a * b;
                   System.out.println("Hasil perkalian : " + hasil);
                   System.out.println( a + " x " + b + " = " +hasil);
                   System.out.println("===================================================");
                   break;
               }
               case 4 -> {
                   hasil = a / b;
                   System.out.println(  a + " / " + b + " = " +hasil);
                   System.out.println("Hasil pembagian: " + hasil);
                   System.out.println("===================================================");
                   break;
               }
               default -> {
                       System.out.println("Nomer Yang Anda Masukan Salah");
                       System.out.println("===================================================");
               }
           }
              
              System.out.println(" Apakah Anda Ingin Melanjutkan ? ");
              System.out.println(" 1 = iya");
              System.out.println(" 2 = tidak");
              System.out.print(" Jawaban : ");
              pilih = input.nextInt();
              } while (pilih == 1);
              if (pilih == 2);
                     System.out.println("Terima Kasih Telah Menggunakan Program kami");
              System.out.println("===================================================");      
              
    }
}