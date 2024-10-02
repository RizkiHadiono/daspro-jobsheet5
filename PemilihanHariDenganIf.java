import java.util.Scanner;

public class PemilihanHariDenganIf {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = sc.nextInt();
        
        String hariType;

        if (angka >= 1 && angka <= 5) {
            hariType = "Weekday";
        } else if (angka == 6 || angka == 7) {
            hariType = "Weekend";
        } else {
            hariType = "Invalid Number";
        }

        System.out.println("Angka " + angka + " adalah: " + hariType);
        
    }
}
