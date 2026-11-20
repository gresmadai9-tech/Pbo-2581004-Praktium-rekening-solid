import java.util.List;

public class LaporanBank {
    public void tampilkan(String judul, List<Rekening> daftar, ProsesAkhirBulan proses) {
        System.out.println("===== " + judul + " =====");
        for (Rekening r : daftar) {
            System.out.println(r.getKeterangan());
            System.out.printf("Saldo: Rp%,.2f%n", r.getSaldo());
            System.out.println("-------------------");
        }
        System.out.printf("Total Premi: Rp%,.2f%n", proses.getTotalAdmin());
        System.out.printf("Total Bunga: Rp%,.2f%n", proses.getTotalBunga());
        System.out.printf("Total Autodebet: Rp%,.2f%n", proses.getTotalAutodebet());
    }
}
