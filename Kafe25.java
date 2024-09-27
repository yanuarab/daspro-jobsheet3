import java.util.Scanner;
public class Kafe25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargakopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga = 13500;
        byte totalByte;
        totalByte = (byte) totalHarga;
        System.out.println("Total harga sebagai byte: " + totalByte);
        double nominalBayar = 10000;
        int nominalInt;
        nominalInt = (int) nominalBayar;
        System.out.println("Nominal bayar sebagai int: " + nominalInt);
        float diskon = 10 / 100f;
        System.out.println("Masukan keanggotaan (true/flase): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukan pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
       totalHarga = (jmlKopi * hargakopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
       nominalBayar = totalHarga - (diskon * totalHarga);
       System.out.println("Keanggotaan pelanggan " + keanggotaan);
       System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlTeh + "teh, " + jmlRoti + "roti");
       System.out.println("Nominal bayar Rp " + nominalBayar);
    }
}
