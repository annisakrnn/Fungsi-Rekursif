import java.util.Scanner;
public class Percobaan2_1 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            if (y == 0) {
                System.out.print("1=");
                return x;
            }   else {
                    System.out.print(x + "x");
                return (x * hitungPangkat(x, y - 1));
            }
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int bilangan, pangkat; 

            System.out.print("Bilangan yang dihitung: ");
            bilangan = sc.nextInt();
            System.out.print("Pangkat: ");
            pangkat = sc.nextInt();

            System.out.print("HitungPangkat(" + bilangan + "," + pangkat + ") " + "dicetak" );
            System.out.println(hitungPangkat(bilangan, pangkat));
            sc.close();

        }
    }