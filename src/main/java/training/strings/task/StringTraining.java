package training.strings.task;

class StringTraining {


    public static void main(String[] args) {
        String napis = "Ala ma kota a kot jest łaciaty i mruczy na widok Ali.";

        System.out.println("Operacje na obiekcie typu String");
        System.out.println("Baza: " + napis);
        System.out.println("Długość: " + napis.length());
        System.out.println("znak na pozycji 4: " + napis.charAt(4));
        System.out.println("Zawiera słowo \"mruczek\": " + napis.contains("mruczek"));
        System.out.println("Zawiera słowo \"jest\": " + napis.contains("jest"));
        System.out.println("Zmiana właściciela" + napis.replaceAll("Al", "Ol"));
        System.out.println("Słowo \"kot\" jest na pozycji: " + napis.indexOf("kot"));

        StringBuilder sb = new StringBuilder();
        sb.append("Ala")
                .append("ma")
                .append(77)
                .append("kotów.");
        String drugiNapis = sb.toString();
        System.out.println(drugiNapis);

        /*ten typ komentarza mogę wstawiać waszędzie*/
        StringBuffer sBuff = new StringBuffer();
        sBuff.append("Ola")
                .append("ma")
                /*ten typ komentarza mogę wstawiać waszędzie*/
                .append(66) //tutaj mogę wpisać komentarz jednolinijkowy
                .append("kanarków.").reverse();
        System.out.println(sBuff/*ten typ komentarza mogę wstawiać waszędzie*/);

        System.out.println("Porównania zmiennych tekstowych");
        String tekst_1 = "Ala";
        String tekst_2 = "aLa";
        String tekst_3 = "Ala";//new String("Ala");

        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_2,
                tekst_1.equals(tekst_2));

        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_2,
                tekst_1.equalsIgnoreCase(tekst_2));

        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_3,
                tekst_1 == tekst_3 );


    }
}
