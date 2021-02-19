import java.util.Arrays;

public class Task2 {

    public boolean arrayWork(int[] arr){
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();

        boolean hasOne = false;
        boolean hasFour = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) hasOne = true;
            else if (arr[i] == 4) hasFour = true;
            else return false;
        }

        return (hasOne && hasFour);
    }
}
