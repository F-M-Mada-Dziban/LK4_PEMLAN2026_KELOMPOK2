public class Rekening {
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}