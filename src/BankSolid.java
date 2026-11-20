import java.util.ArrayList;
import java.util.List;

public class BankSolid {
    public static void main(String[] args) {
        List<Rekening> daftarRekening = new ArrayList<>();

        daftarRekening.add(new Tabungan("Beri", 1000000));
        daftarRekening.add(new Giro("Ani", 2000000));
        daftarRekening.add(new Deposito("Citra", 5000000));

        ProsesAkhirBulan proses = new ProsesAkhirBulan();
        proses.prosesSemua(daftarRekening);

        LaporanBank laporan = new LaporanBank();
        laporan.tampilkan("LAPORAN AKHIR BULAN", daftarRekening, proses);
    }
}
