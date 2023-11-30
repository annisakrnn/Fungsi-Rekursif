import java.util.Scanner;

public class Fibonacci4 {

    // Fungsi rekursif Fibonacci untuk menghitung jumlah pasangan marmut
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bulan ke-12
        System.out.print("Masukkan bulan ke-12: ");
        int bulan = scanner.nextInt();

        // Menghitung jumlah pasangan marmut pada bulan ke-12
        int jumlahPasanganMarmut = fibonacci(bulan);

        // Menampilkan hasil
        System.out.println("Pada bulan ke-" + bulan + " akan ada " + jumlahPasanganMarmut + " pasangan marmut.");

        scanner.close();
    }
}