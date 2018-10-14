package training.core;

public class MyTools {
    final int poleDanych;

    public MyTools() {
        this("8");
    }

    private MyTools(int poleDanych) {
        this.poleDanych = poleDanych;
    }

    private MyTools(String wartosc) {
        this.poleDanych = Integer.parseInt(wartosc);
    }

    void countTo10(){

    }

    public static int blow(){
        return 99;
    }

    public int horn(String sound){
        return 0;
    };

    public int horn(int sound){
        return 0;
    };

    public Long horn(Integer sound){
        return 0L;
    };
    public Long horn(Integer... sound /*Integer[] sound*/){

        return 10L;
    };


}
