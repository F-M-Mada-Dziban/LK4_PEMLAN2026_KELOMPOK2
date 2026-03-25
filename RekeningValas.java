public class RekeningValas extends Rekening implements TransferGlobal {

    public RekeningValas(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

    @Override
    public void prosesTransaksi(double jumlah) {
        saldo -= jumlah;
        System.out.println("Transaksi berhasil. Jumlah: " + jumlah);
    }

    @Override
    public void autentikasiDigital(String kodeOTP) {
        System.out.println("Autentikasi digital dengan OTP: " + kodeOTP);
    }

    @Override
    public void konversiMataUang(double kurs) {
        System.out.println("Konversi mata uang dengan kurs: " + kurs);
    }

    @Override
    public void kirimNotifikasi(String pesan) {
        System.out.println("Notifikasi: " + pesan);
    }
}