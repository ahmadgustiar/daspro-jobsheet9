import java.util.Arrays;

public class ArrayBilangan02 {
    public static void main(String[] args) {
        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // for loop
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // foreach loop
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        // Arrays.toString()
        System.out.println(Arrays.toString(bil));
    }
}