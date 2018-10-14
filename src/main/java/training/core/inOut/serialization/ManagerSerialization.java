package training.core.inOut.serialization;

import java.io.*;

public class ManagerSerialization {

    final static String FILE_BIN = "./src/training/core/inOut/serialization/User.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user0 = new User("admin", "admin1");

        System.out.println(user0.getLogin());
        System.out.println(user0.getPassword());


        //try -resource: java will close it for me
        try (FileOutputStream fos = new FileOutputStream(FILE_BIN)) {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(user0);
                oos.close();

            } catch(IOException e){
                e.printStackTrace();
            }

            User user1 = null;
            FileInputStream fis = new FileInputStream(FILE_BIN);
            ObjectInputStream ois = new ObjectInputStream(fis);
            user1 = (User) ois.readObject();
            System.out.println(user1.getLogin());
            System.out.println(user1.getPassword());

        }

    }


