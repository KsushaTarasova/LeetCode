package problems.transpose_matrix_867;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] result = solution.transpose(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
