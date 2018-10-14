package training.core.array;

import java.util.Arrays;
import java.util.Random;

class Multiplication {

    /*
    Initialization of one dimension array
     */
    private static Integer[] intTab = {1, 5, 3, 5, 77, 8, 1};

    /*
    Initialization of two dimension array
     */
    private static int[][] intRan2D = {
            {1, 5, 3, 5, 77, 8, 1},
            {1, 5, 3, 5, 8, 1},
            {1, 5, 3, 5, 77, 8, 1, 88}
    };

    private void printMultiplication(int dimension) {
        for (int i = 1; i <= dimension; i++) {
            for (int k = 1; k <= dimension; k++) {
                System.out.printf("%-4d", i * k);
            }
            System.out.println();
        }
    }

    private Integer[] array1dWithRandoms(int dimension) {
        Integer[] intArray = new Integer[dimension];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(1_000);
        }
        return intArray;
    }

    private Integer[][] array2dWithRandoms(int dimension) {
        Integer[][] array2d = new Integer[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            array2d[i] = array1dWithRandoms(dimension);
        }
        return array2d;
    }

    private void print1dArray(Integer[] array) {
        for (Integer i : array) {
            if (i != null) {
                System.out.printf("%4d", i);
            } else {
                System.out.printf("%4s", " ");
            }
        }
        System.out.println();
    }

    private void print2dArray(Integer[][] array) {
        for (Integer[] _1dArray : array) {
            print1dArray(_1dArray);
        }
    }

    private Integer[][] upperRightHalfArray(Integer[][] baseArray) {
        int dimension = baseArray.length;
        Integer[][] resultArray = new Integer[dimension][dimension];
        for (int w = 0; w < dimension; w++) {
            for (int k = 0; k < dimension; k++) {
                if (k >= w) {
                    resultArray[w][k] = baseArray[w][k];
                }
            }
        }
        return resultArray;
    }

    private Integer[][] lowerLeftHalfArray(Integer[][] baseArray) {
        int dimension = baseArray.length;
        Integer[][] resultArray = new Integer[dimension][dimension];
        for (int w = 0; w < dimension; w++) {
            Integer[] oneRowBase = baseArray[w];
            Integer[] oneRowResult = resultArray[w];
            System.arraycopy(oneRowBase, 0, oneRowResult, 0, w);
        }
        return resultArray;
    }


    public static void main(String[] args) {
        //new Multiplication().printMultiplication(10);
        Multiplication multi = new Multiplication();
        multi.print1dArray(multi.array1dWithRandoms(12));
        System.out.println("----------------------------------------");
        multi.print2dArray(multi.array2dWithRandoms(7));
        System.out.println("----------------------------------------");
        multi.print1dArray(intTab);
        Arrays.sort(intRan2D);
        multi.print1dArray(intTab);
        System.out.println("----------------------------------------");
        Integer[][] inputArray = multi.array2dWithRandoms(10);
        multi.print2dArray(inputArray);
        System.out.println(" *** ");
        Integer[][] outputArray = multi.upperRightHalfArray(inputArray);
        multi.print2dArray(outputArray);
        System.out.println(" *** ");
        outputArray = multi.lowerLeftHalfArray(inputArray);
        multi.print2dArray(outputArray);
    }

}
