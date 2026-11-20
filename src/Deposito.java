public class Deposito implements Rekening {
    private double saldo;
    private static final double BUNGA = 0.040;
    private static final double PREMI = 50000;

    public Deposito(String nama, double saldoAwal) {
        this.saldo = saldoAwal;
    }

    @Override public void setor(double jumlah) { saldo += jumlah; }
    @Override public boolean tarik(double jumlah) {
        throw new UnsupportedOperationException("Deposito tidak bisa ditarik");
    }
    @Override public double getSaldo() { return saldo; }
    public double getBunga() { return BUNGA; }
    public double getPremi() { return PREMI; }
    public void potongPremi() { saldo -= PREMI; }
    @Override public String getKeterangan() {
        return "Deposito, bunga 4.0% per bulan";
    }
}
