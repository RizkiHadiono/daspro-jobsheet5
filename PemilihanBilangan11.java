import java.util.Scanner;

public class PemilihanBilangan11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka ");
        int angka = sc.nextInt();
    
        // Menggunakan operator ternary untuk menentukan genap atau ganjil
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        
        System.out.println("Angka " + angka + " termasuk bilangan " + hasil);

    }
}