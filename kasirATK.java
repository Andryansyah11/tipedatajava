import java.util.Scanner;

public class kasirATK {

    public static void main(String[] args) {
    //     double bukuTulis , pensil , penghapus , penggaris , kotak;
    //     bukuTulis=2500;
    //     pensil=1000;
    //     penghapus=1500;
    //     penggaris=1000;
    //     kotak=5000;


    // Scanner input = new Scanner(System.in);

    // System.out.println("Masukkan jumlah beli pensil: ");
    // double jumlahPensil = input.nextDouble();
    // double total = jumlahPensil*pensil;

    // System.out.println("Masukkan jumlah beli Buku Tulis: ");
    // double jumlahBuku = input.nextDouble();
    // total += jumlahBuku*bukuTulis;

    // System.out.println("Masukkan jumlah beli penghapus: ");
    // double jumlahPenghapus = input.nextDouble();
    // total += jumlahPenghapus*penghapus;

    // System.out.println("Masukkan jumlah beli penggaris: ");
    // double jumlahPenggaris = input.nextDouble();
    // total += jumlahPenggaris*penggaris;

    // System.out.println("masukan jummlah beli kotak");
    // double jumlahkotak = input.nextDouble();
    // total += jumlahkotak*kotak;

    // System.out.println("Masukkan Pembayaran: ");
    // double bayar = input.nextDouble();
    // double diskon = 0.05*total;
    // double kembali = bayar-(total-diskon);
    // System.out.println("Total diskon: "+diskon);
    // System.out.println("Total kembalian: "+kembali);
    double jajan , minuman;
    jajan= 2000;
    minuman= 5000;

    Scanner input = new Scanner (System.in);

    System.out.println("masukan jumlah beli jajan" );
    double jumlahjajan = input.nextDouble();
    double total =jumlahjajan*jajan;

    System.out.println("masukan jumlah beli minuman" );
    double jumlahminuman = input.nextDouble();
    total +=jumlahminuman*minuman;

    System.out.println("masukan pembayaran:" );
    double bayar = input.nextDouble();
    double diskon = 0.05*total;
    double kembalian = bayar-(total-diskon);
    System.out.println("total kembalian: "+kembalian);
    
}
}