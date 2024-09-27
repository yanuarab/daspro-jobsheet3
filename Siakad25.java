import java.util.Scanner;
public class Siakad25 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama, nim;
    char kelas ;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
    System.out.println("Masukan nama: "); 
    nama = sc.nextLine(); 
    System.out.println("Masukan NIM: ");
    nim = sc.nextLine();
    System.out.println("Masukan Kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.println("Masukan nomer absen: ");
    absen = sc.nextByte();
    System.out.println("Masukan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.println("Masukan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.println("Masukan nilai ujian: ");
    nilaiUjian = sc.nextDouble();
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
    System.out.println(" Nama: " + nama + " NIM: " + nim);
    System.out.println("kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai akhir: " + nilaiAkhir);
}
}
