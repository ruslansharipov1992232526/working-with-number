import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(5);
        array.add(16);
        array.add(-1);
        array.add(-2);
        array.add(0);
        array.add(32);
        array.add(3);
        array.add(5);
        array.add(8);
        array.add(23);
        array.add(4);

        Collections.sort(array);

        for (int arrays : array) {
            if (arrays > 0 && arrays % 2 == 0) {
                System.out.print("[" + arrays  + "]");
            }
        }

        System.out.println();

        StreamMain.main();
    }
}
