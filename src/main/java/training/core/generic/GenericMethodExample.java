package training.core.generic;

public class GenericMethodExample {

    static <T> void displayArray(T[] intArray){
        for (T i : intArray) {
            System.out.printf("%s, ",i);
        }
        System.out.println();

/*        static void displayArray(Integer[] intArray){
            for (Integer i : intArray) {
                System.out.println(i);
            }*/
    }

    //*********************************liczenie liter ****************************************//




    static <E> Integer[] converter(E[] inputArray) {

        Integer[] outputArray = new Integer[inputArray.length];
        int idx = 0;
        for (E el : inputArray) {
            int lenght = new String((String) el.toString()).length(); // rzutowanie
            outputArray[idx++] = lenght;
        }
        return outputArray;
    }


    public static void main(String[] args) {

        Integer[] integers = {3,4,5,6,7,8,1,2};
        Double[] doubles = {0.6, 22.5, 43.3, 12.8, 3.0};
        Character[] characters = {'a','f','t','u','x','q'};
        String[] strings = {"Hello", "Wirld", "Welcome"};

        displayArray(integers);
        displayArray(doubles);
        displayArray(characters);
        displayArray(strings);

        displayArray(converter(integers));
        displayArray(converter(doubles));
        displayArray(converter(characters));
        displayArray(converter(strings));

    }



}
