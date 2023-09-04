import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int ii = 0;
        int ll = 0;
        int kol = 1000;
        int R = -1;
        int min = 1;

        int max = 9999;


        List<Integer> list = new ArrayList<>(kol);
        for (int i = 0; i < kol; i++)
            list.add(min + Math.abs(rnd.nextInt()) % (max - min + 1));


        System.out.println("\nпоследовательность:");

        Collections.sort(list);
        System.out.println(list);

        for (int i = kol-1; i > 0; i--)
            for (int l = kol-1; l > 0; l--)
                if ((list.get(i) * list.get(l)) % 14 == 0) {
                    ii = list.get(i);
                    ll = list.get(l);
                    R = ii * ll;
                    break;

                }


        System.out.println(R);
        System.out.println(ii);
        System.out.println(ll);
    }

}


