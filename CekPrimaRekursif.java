import java.util.Scanner;

public class CekPrimaRekursif {

    // Fungsi rekursif untuk mengecek apakah suatu bilangan prima atau bukan
    static boolean cekPrimaRekursif(int n, int i) {
        // Basis: Jika i mencapai 2, maka n adalah bilangan prima
        if (i == 2) {
            return true;
        }
        // Basis: Jika n habis dibagi i, maka n bukan bilangan prima
        if (n % i == 0) {
            return false;
        }
        // Rekurens: Memanggil dirinya sendiri dengan i yang berkurang
        return cekPrimaRekursif(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Memanggil fungsi rekursif untuk mengecek apakah n adalah bilangan prima
        boolean hasil = cekPrimaRekursif(n, n - 1);

        // Menampilkan hasil pengecekan
        if (hasil) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }

        scanner.close();
    }
}