import java.util.Scanner;

public class PenjumlahanRekursif {

    // Fungsi rekursif untuk menghitung penjumlahan bilangan
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Menghitung penjumlahan bilangan menggunakan fungsi rekursif
        int hasil = penjumlahanRekursif(n);

        // Menampilkan hasil penjumlahan
        System.out.println("Penjumlahan dari 1 + 2 + ... + " + n + " = " + hasil);

        scanner.close();
    }
}