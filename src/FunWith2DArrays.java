public class FunWith2DArrays
{
    public static int totalElements(int[][] arr)
    {
        int rows = arr.length;
        int columns = arr[0].length;
        return rows * columns;
    }

    public static void fourCorners(String[][] arr)
    {
        System.out.println(arr[0][0]);
        System.out.println(arr[0][arr[0].length - 1]);
        System.out.println(arr[arr.length - 1][0]);
        System.out.println(arr[arr.length - 1][arr[0].length - 1]);
    }

    public static double average(int[][] arr)
    {
        double sum = 0;
        int numElements = arr.length * arr[0].length;
        for (int[] intArr : arr)
        {
            for (int element : intArr)
            {
                sum += element;
            }
        }
        return sum / numElements;
    }

    public static int[] indexFound(String[][] arr, String target)
    {
        int[] targetFound = new int[2];
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                if(arr[row][col].indexOf(target) != -1)
                {
                    targetFound[0] = row;
                    targetFound[1] = col;
                    return targetFound;
                }
            }
        }
        targetFound[0] = -1;
        targetFound[1] = -1;
        return targetFound;
    }
}
