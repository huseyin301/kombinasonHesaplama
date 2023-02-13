package kombinasyonH;
import java.util.Scanner;
public class cod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, r, nF = 1, rF = 1, nrF = 1, y, toplam;

        System.out.print("N değerini giriniz : ");
        n = sc.nextInt();

        System.out.print("R değerini giriniz : ");
        r = sc.nextInt();

        //n! / (r! * (n-r)!)

        for (int i = 1; i <= n; i++){

            nF = nF * i;

        }

        for (int x = 1; x <= r; x++){

            rF = rF * x;

        }

        for (int z = 1; z <= n - r; z++){

            nrF = nrF * z;

        }

        y = rF * nrF;

        toplam = nF / y;

        System.out.println("Kombinasyon (7,1) : " + toplam);

    }
}
