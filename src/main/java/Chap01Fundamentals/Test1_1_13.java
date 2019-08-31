package Chap01Fundamentals;

public class Test1_1_13 {
    private static int[][] transpose(int[][] x){
        int m = x.length;
        int n = x[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                res[j][i] = x[i][j];
        return res;
    }

    private static void print2dArray(int[][] elems2d){
        for (int[] elems: elems2d) {
            for(int elem: elems){
                System.out.printf("%d\t", elem);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};  // 2 * 3
        System.out.print("**** original ****\n");
        print2dArray(nums);
        System.out.print("**** transposed ****\n");
        int[][] y = transpose(nums);
        print2dArray(y);
    }
}
