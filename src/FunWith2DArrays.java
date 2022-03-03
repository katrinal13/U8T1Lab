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
}
