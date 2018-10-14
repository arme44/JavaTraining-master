package training.core.controlStatements;

class foreach_Statement {

    static String sentance = "Ala ma kota a to jest łaciaty i pstry.";
    static String sentance2 = "D:\\tools\\MegaSync\\SDAcademy";

    public static void main(String[] args) {
        exampleWichCharArray();
        exampleWichStringArray();

    }

    private static void exampleWichStringArray() {
        String[] strings = sentance2.split("\\\\");
        for (String word : strings) {
            System.out.println(word);
        }
    }

    private static void exampleWichCharArray() {
        char[] chars = sentance.toCharArray();

        System.out.println("default with for");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("foreach example");
        for (char sign : chars) {
            System.out.println(sign);
        }
    }

}
