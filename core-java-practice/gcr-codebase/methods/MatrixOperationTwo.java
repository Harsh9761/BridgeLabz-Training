public class MatrixOperationTwo {

	public static void main(String[] args) {
		double[][] matrix2x2 = generateRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix2x2));

        System.out.println("\nDeterminant: " + determinant2x2(matrix2x2));

        System.out.println("\nInverse:");
        double[][] inverseMatrix2x2 = inverse2x2(matrix2x2);
        if(inverseMatrix2x2 != null) displayMatrix(inverseMatrix2x2);

        double[][] matrix3x3 = generateRandomMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix3x3));

        System.out.println("\nDeterminant: " + determinant3x3(matrix3x3));

        System.out.println("\nInverse:");
        double[][] inverseMatrix3x3 = inverse3x3(matrix3x3);
        if(inverseMatrix3x3 != null) displayMatrix(inverseMatrix3x3);
	}
	
	public static double[][] generateRandomMatrix(int rows, int cols) {
        double[][] randomMatrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                randomMatrix[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        return randomMatrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposedMatrix = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposedMatrix[j][i] = matrix[i][j];
        return transposedMatrix;
    }

    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])
             - matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])
             + matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
    }

    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, cannot find inverse.");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1]/det;
        inverse[0][1] = -matrix[0][1]/det;
        inverse[1][0] = -matrix[1][0]/det;
        inverse[1][1] = matrix[0][0]/det;
        return inverse;
    }

    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, cannot find inverse.");
            return null;
        }
        double[][] inverse = new double[3][3];
        inverse[0][0] =  (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])/det;
        inverse[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1])/det;
        inverse[0][2] =  (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1])/det;

        inverse[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])/det;
        inverse[1][1] =  (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0])/det;
        inverse[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0])/det;

        inverse[2][0] =  (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0])/det;
        inverse[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0])/det;
        inverse[2][2] =  (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0])/det;

        return inverse;
    }
}
