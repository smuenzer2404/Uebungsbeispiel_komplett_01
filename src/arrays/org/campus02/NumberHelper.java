package arrays.org.campus02;

public class NumberHelper {
    public static boolean isSortedArray (int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            boolean result;
            if (numbers[i] < numbers[i + 1]) {
                result = true;
            } else {
                result = false;
            }
        }
        return true;
    }

    public static int [] removeDuplicates (int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] == numbers [i]){
                numbers[i] = -1;
            }
            int [] withoutDuplicates = new int[]
        }
        return int [] withoutDuplicates;
    }
}
