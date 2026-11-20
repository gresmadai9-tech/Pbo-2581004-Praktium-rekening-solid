public interface Rekening {
    void setor(double jumlah);
    boolean tarik(double jumlah);
    double getSaldo();
    String getKeterangan();
}
