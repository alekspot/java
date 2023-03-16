import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 1, 2, 3};
        int[] test2 = {1, 2, 1, 3, 4};

        subarraysWithKDistinct(test1, 2);
        subarraysWithKDistinct(test2, 3);
    }

    public static void subarraysWithKDistinct(int[] array, int k) {
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Количество уникальных чисел в подмассивах: " + k);
        int countSubArrays = 0;

        for (int i = 0; i < array.length; i++) {
            countSubArrays = countSubArrays + toSubArrayCount(array, i, k);
        }

        System.out.println("Количество подмассивов: " + countSubArrays);
        System.out.println("-----------------------------------------");
    }

    public static int toSubArrayCount(int[] array, int startIndex, int uniqCount) {
        int countSubArrays = 0;

        for (int i = array.length - 1; i >= startIndex; i--) {
            int[] subArray = Arrays.copyOfRange(array, startIndex, i + 1);

            if (getUniqCount(subArray) == uniqCount) {
                System.out.println(Arrays.toString(subArray));
                countSubArrays++;
            }

        }

        return countSubArrays;
    }

    public static int getUniqCount(int[] array) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashmap.put(array[i], i);
        }

        return hashmap.keySet().size();
    }
}
