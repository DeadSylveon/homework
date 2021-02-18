import java.util.Arrays;

public class Main {


    public int[] arrayWork(int[] arr){
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();

        int posOfFour = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) posOfFour = i;
        }
        if (posOfFour == -1) throw new RuntimeException();
        return Arrays.copyOfRange(arr, posOfFour+1, arr.length);
    }
}
