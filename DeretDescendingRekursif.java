import java.util.Scanner;

public class DeretDescendingRekursif {

    // Fungsi Rekursif
    static void deretDescRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescRekursif(n - 1);
        }
    }

    // Fungsi Iteratif
    static void deretDescIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan n dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Menampilkan deret bilangan descending menggunakan rekursif
        System.out.print("Deret Descending Rekursif: ");
        deretDescRekursif(n);

        System.out.println(); // Pindah ke baris baru

        // Menampilkan deret bilangan descending menggunakan iteratif
        System.out.print("Deret Descending Iteratif: ");
        deretDescIteratif(n);

        scanner.close();
    }
}