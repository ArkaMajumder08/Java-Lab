class MatrixProduct {
    public static void main(String[] args) {

        int[][] A = {
            {3, 5, 9, 3},
            {7, 2, 8, 5},
            {1, 4, 6, 7}
        };

        int[][] B = {
            {9, 7},
            {5, 1},
            {2, 6},
	    {3, 4}
        };

        int[][] C = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        
        System.out.println("Product of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
