package training.core;

class Main {


    public static void main(String[] args) {
        System.out.println("Witaj w świecie JAVA");
        System.out.println("Witaj w świecie JAVA".toUpperCase().charAt(8));

        System.out.println("Typy proste w JAVA:");
        System.out.println("int " + 4); //"int 4"
        System.out.println("byte " + 0x11);
        System.out.println("long " + 12L);
        System.out.println("double " + 2.01);
        System.out.println("char " + 'z');
        System.out.println("boolean " + true);

        System.out.println("Typy obiektowe w JAVA:");
        System.out.println("Integer " + new Integer(9)); //"int 4"
        System.out.println("Byte " + new Byte("11"));
        System.out.println("Long " + new Long(18));
        System.out.println("Double " + new Double(2.01));
        System.out.println("Char " + new Character('z'));
        System.out.println("Boolean " + new Boolean("true"));
        System.out.println("String " + new String("Mój napis.").toUpperCase());



    }

}


