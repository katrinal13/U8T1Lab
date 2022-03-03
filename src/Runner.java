import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"},
                                  {"Brian", "Elenor", "Harry", "Lenny"},
                                  {"Cathy", "Fred", "Jill", "Matt"}};
        for (String[] innerArr: seatingChart)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        seatingChart[1][2] = "Paul";

        for (String[] innerArr: seatingChart)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        for (String[] innerArr: seatingChart)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        String[] tempArr = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempArr;

        for (String[] innerArr: seatingChart)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        // Problem 1
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        for (int[] innerArr: arr1)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        for (int[] innerArr: arr2)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int[] innerArr: arr1)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for (int[] innerArr: arr2)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        // 2D Array Methods
        int[][] array1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(array1));
        int[][] array2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(array2));
        int[][] array3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(array3));
        int[][] array4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(array4));
        int[][] array5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(array5));
        int[][] array6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(array6));
        int[][] array7 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(array7));
        int[][] array8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(array8));
        int[][] array9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(array9));

        String[][] strArr1 = {{"hi", "bye", "stuff", "go"},
                             {"time", "up", "you", "good"},
                             {"map", "low", "bow", "mom"}};
        FunWith2DArrays.fourCorners(strArr1);
        String[][] strArr2 = {{"time", "up", "bye"},
                             {"hi", "hit", "up"},
                             {"map", "bam", "low"},
                             {"bow", "mom", "joy"}};
        FunWith2DArrays.fourCorners(strArr2);
        String[][] strArr3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(strArr3);
        String[][] strArr4 = {{"cat"},
                             {"dog"},
                             {"hamster"},
                             {"bird"}};
        FunWith2DArrays.fourCorners(strArr4);
        String[][] strArr5 = {{"time"}};
        FunWith2DArrays.fourCorners(strArr5);
    }
}
