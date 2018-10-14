package training.core.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class RunArguments {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Arguments not defined");
            System.exit(-1);

        }

        System.out.println("Arguments from CLI");
        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("System properties");
        Properties properties = System.getProperties();
        properties.setProperty("coffe.for.developer","Black strong and hot");
        Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement(); // rzutowanie
            String val = properties.getProperty(key);
            System.out.println(key + " : " + val);
        }


        FileOutputStream storeFile = new FileOutputStream("props.xml");
        FileOutputStream flatFile = new FileOutputStream("props.properties");
        properties.store(flatFile, "System properties-txt");
        properties.storeToXML(storeFile, "System properties");
       // properties.loadFromXML(storeFile);


        System.out.println("System environments");
        Map<String, String> envs = System.getenv();
        Set<String> keySet = envs.keySet();
        for (String k : keySet) {
            System.out.println(k + " : " + envs.get(k));
        }

        System.out.println("Laoad own properties - menu");
        FileInputStream inFile = new FileInputStream("./src/training/configFiles/disches.properties");
        Properties myMenu = new Properties();
        myMenu.load(inFile);
        for (Object k : myMenu.keySet()) {
            System.out.println(k + " : " + myMenu.get(k));
        }

        System.out.println("Laoad own properties - menu XML");

        System.out.println("Export XML Menu");
        storeFile = new FileOutputStream("./src/training/configFiles/disches.xml");
        myMenu.storeToXML(storeFile, "System properties");
    }

}
