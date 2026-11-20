public class Tabungan implements Rekening {
    private double saldo;
    private static final double BUNGA = 0.025;

    public Tabungan(String nama, double saldoAwal) {
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
        return "Tabungan, bunga 2.5% per bulan";
    }
}
