import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {1, 5, 9}, {4, 6, 0}};
        int[][] arr2 = {{1, 2, 3}, {0, 2, 4}, {1, 0, 3}};
        int[][] arr3 = {{0, 0, 0}, {1, 1, 1}, {2, 2, 2}};

        System.out.println("Input: ");
        for (int[] row : arr1)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: 1");
        System.out.println("Actual result: " + hasDuplicates(arr1));
        System.out.println("-------------------------------------");
        System.out.println("Input: ");
        for (int[] row : arr2)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: 3");
        System.out.println("Actual result: " + hasDuplicates(arr2));
        System.out.println("-------------------------------------");
        System.out.println("Input: ");
        for (int[] row : arr3)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: 0");
        System.out.println("Actual result: " + hasDuplicates(arr3));
    }
        public static int hasDuplicates(int[][] arr)
        {
            int num = 0;
            for (int c = 0; c < arr[0].length; c++)
            {
                for (int r = 0; r < arr.length; r++)
                {
                    int dupe = arr[r][c];
                    for (int i = r + 1; i < arr.length; i++)
                    {
                        if (dupe == arr[i][c])
                        {
                            num++;
                        }
                    }
                }
            }
            return num;
        }
}
