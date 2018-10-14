/*
package training.core.Homeworks;

*/
/*LICZBY PIERWSZE

        Użytkownik podaje liczbę większą od zera, np NNN. Program ma za zadanie
        przygotować tablicę liczb pierwszych mniejszą równą NNN.

        Otrzymana tablica jest prezentowana na konsoli.*//*



public class Task7 {


    public class Project {

        public static void main(String[] args)
        {
            Project p = new Project();

            for (int i=0; i<20; i++) //  i to nasza liczba
            {
                boolean result = true;
                if(i<2)
                {
                    result = false;
                }
                else for(int j=2; j<=i/2; j++)
                {
                    if(i%j==0)
                    {
                        result = false;
                        break; // bo po co sprawdzać dalej - lepiej przerwac petle
                    }
                }

                System.out.println("Liczba " + i + " " + (result == true ? "jest" : "nie jest") + " liczbą pierwszą");
            }
        }
    }


    public static void main(String[] args) {



    }



}
*/
