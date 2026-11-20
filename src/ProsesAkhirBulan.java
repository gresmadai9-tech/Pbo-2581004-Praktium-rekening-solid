import java.util.List;

public class ProsesAkhirBulan {
    private double totalAdmin = 0;
    private double totalBunga = 0;

    public void prosesSemua(List<Rekening> daftar) {
        for (Rekening r : daftar) {
            if (r instanceof Tabungan) {
                double b = r.getSaldo() * ((Tabungan)r).getBunga();
                r.setor(b); totalBunga += b;
            } else if (r instanceof Giro) {
                double b = r.getSaldo() * ((Giro)r).getBunga();
                r.setor(b); totalBunga += b;
            } else if (r instanceof Deposito) {
                Deposito d = (Deposito)r;
                d.potongPremi(); totalAdmin += d.getPremi();
                double b = d.getSaldo() * d.getBunga();
                d.setor(b); totalBunga += b;
            }
        }
    }

    public double getTotalAdmin() { return totalAdmin; }
    public double getTotalBunga() { return totalBunga; }
    public double getTotalAutodebet() { return totalAdmin + totalBunga; }
}
