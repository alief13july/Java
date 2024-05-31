package javadasar;

public class TernaryOperator {

    public static void main(String[] args) {

        var nilai = 75;
        String ucapan;
        String ucapan1 = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }
        System.out.println(ucapan);
        System.out.println(ucapan1);
    }
}
