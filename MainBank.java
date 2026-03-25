import java.text.DecimalFormat;

public class MainBank {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("=====================================");
        System.out.println("      SMART BANKING ECOSYSTEM");
        System.out.println("        Bank GakMauRugi");
        System.out.println("=====================================");

        RekeningValas rekening = new RekeningValas("123456789", 1000000);

        System.out.println("\nValidasi Keamanan Server...");
        if (ProtokolKeamanan.validasiTransaksi("AMAN")) {
            System.out.println("Status Keamanan : VALID");
            System.out.println("ID Server       : " + ProtokolKeamanan.ID_SERVER);

            System.out.println("\n----------- PROSES TRANSAKSI -----------");
            rekening.autentikasiDigital("9876");
            rekening.konversiMataUang(15000);
            rekening.prosesTransaksi(200000);
            rekening.kirimNotifikasi("Transfer berhasil");

            System.out.println("\n----------- INFORMASI REKENING -----------");
            System.out.println("No Rekening : " + rekening.nomorRekening);
            System.out.println("Saldo Akhir : Rp " + df.format(rekening.saldo));
        } else {
            System.out.println("Transaksi ditolak oleh sistem keamanan");
        }

        System.out.println("=====================================");
        System.out.println("        TERIMA KASIH");
        System.out.println("=====================================");
    }
}