public class Giro implements Rekening {
    private double saldo;
    private static final double BUNGA = 0.015;

    public Giro(String nama, double saldoAwal) {
        this.saldo = saldoAwal;
    }

    @Override public void setor(double jumlah) { saldo += jumlah; }
    @Override public boolean tarik(double jumlah) {
        if (jumlah <= saldo) { saldo -= jumlah; return true; }
        return false;
    }
    @Override public double getSaldo() { return saldo; }
    public double getBunga() { return BUNGA; }
    @Override public String getKeterangan() {
        return "Giro, bunga 1.5% per bulan";
    }
}
