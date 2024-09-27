import java.util.Scanner;

public class HitungNilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        double bobotKuis = 0.20, bobotTugas = 0.15, bobotUTS = 0.30, bobotUAS = 0.35;
        System.out.println("Masukkan nilai kuis (0-100): ");
        nilaiKuis = input.nextDouble();
        System.out.println("Masukkan nilai tugas (0-100): ");
        nilaiTugas = input.nextDouble();
        System.out.println("Masukkan nilai UTS (0-100): ");
        nilaiUTS = input.nextDouble();
        System.out.println("Masukkan nilai UAS (0-100): ");
        nilaiUAS = input.nextDouble();
        nilaiAkhir = (nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);
        System.out.println("Nilai akhir adalah: " + nilaiAkhir);
    }
}
