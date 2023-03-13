import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    static int width;
    static int height;
    public static void main(String[] args) {
        int[][] array = setArray();

        fillArrayByRandomNumbers(array, 1, 10);

        printArray(array, "-------------- До --------------");

        turnArray(array);

        printArray(array,"------------- Повернуть по часовой -------------");

   }

   public static int[][] setArray() {
       Scanner in = new Scanner(System.in);

       System.out.println("Установите размер массива:");
       width = in.nextInt();
       System.out.print("");
       height = in.nextInt();

       return new int[width][height];
   }

   public static void fillArrayByRandomNumbers(int[][] array, int start, int end) {
       Random rand = new Random(start);

       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               array[i][j] = rand.nextInt(end);
           }
       }
   }

   public static void printArray(int[][] array, String title) {
       System.out.println(title);

       for (int i = 0; i < array.length; i++) {
           System.out.println(Arrays.toString(array[i]));
       }
   }

   public static int[][] getReplaceablePathByCoords() {
       ArrayList<int[]> path = new ArrayList<>();

       for (int i = 0; i < height; i++) {
           path.add(new int[]{0, i});
       }

       for (int i = 0; i < width - 1; i++) {
           path.add(new int[]{i + 1, height - 1});
       }

       for (int i = 0; i < height - 1; i++) {
           path.add(new int[]{width - 1, height - 2 - i});
       }

       for (int i = 0; i < width - 2; i++) {
           path.add(new int[]{width - 2 - i, 0});
       }

       return path.toArray(new int[0][0]);
   }

   public static void turnArray(int[][]array) {
       int[][] replaceablePathByCoords = getReplaceablePathByCoords();

       int[] lastReplaceableCoords = replaceablePathByCoords[replaceablePathByCoords.length - 1];
       int lastReplaceableX = lastReplaceableCoords[0];
       int lastReplaceableY = lastReplaceableCoords[1];

       int replaceItem = array[lastReplaceableX][lastReplaceableY];

       for (int i = 0; i < replaceablePathByCoords.length; i++) {
           int x = replaceablePathByCoords[i][0];
           int y = replaceablePathByCoords[i][1];

           int temp = array[x][y];

           array[x][y] = replaceItem;

           replaceItem = temp;
       }
   }
}
