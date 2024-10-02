import java.util.Scanner;

public class SIAKAD11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String nama,nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomer absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        double nilaiAngka;
        int kuis = 70, tugas = 80, ujian = 90;
        String kualifikasi, nilaiHuruf;
        nilaiAngka = (kuis + tugas + ujian) /3 ;

        if (nilaiAngka>80 && nilaiAngka<=100) {
            nilaiHuruf = "A";kualifikasi = "Sangat Baik";
        } else if (nilaiAngka>73 && nilaiAngka<=80){
            nilaiHuruf = "B+";kualifikasi = "Lebih dari Baik";
        } else if (nilaiAngka>65 && nilaiAngka<=73) {
            nilaiHuruf = "B";kualifikasi = "Baik";
        } else if (nilaiAngka>60 && nilaiAngka<=65) {
            nilaiHuruf = "C";kualifikasi = "Cukup";
        } else if (nilaiAngka>39 && nilaiAngka<=50) {
            nilaiHuruf = "D";kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama: " + nama + " NIM: " + nim + " Kelas: " + kelas + " nomor absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Angkanya setelah adalah: " + nilaiAngka);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

    }
}
