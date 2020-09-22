package br.com.g2stecnologia.utils.array;

public class ArrayUtils {

    public static int[] sum(int[] matrixA, int[] matrixB) {
        if(matrixA.length != matrixB.length) {
            throw new IllegalArgumentException("Arrays A and B must have the same size");
        }

        int [] resultArray = new int[matrixA.length];
        for(int i =0; i< matrixA.length; i++) {
            resultArray[i] = matrixA[i] + matrixB[i];
        }
        return  resultArray;
    }
}
