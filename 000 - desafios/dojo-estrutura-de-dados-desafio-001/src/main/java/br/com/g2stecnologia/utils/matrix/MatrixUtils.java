package br.com.g2stecnologia.utils.matrix;

public class MatrixUtils {

    public static int[][] sum(int[][] matrixA, int[][] matrixB) {
        if(matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalArgumentException("Matrix A and B must have the same size");
        }

        int [][] resultMatrix = new int[matrixA.length][matrixA[0].length];
        for(int y =0; y< matrixA.length; y++) {
            for(int x =0; x< matrixA[0].length; x++) {
                resultMatrix[y][x] = matrixA[y][x] + matrixB[y][x];
            }
        }
        return  resultMatrix;
    }

}
