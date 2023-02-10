package day49_functional_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();
    /*
    private: only accessible in the same class
    static: access by the class name instead of need to create an object
    Properties: we are creating an object of this class to connect a properties(test.properties) to a java object
     */

    static {
        try {

            //create a file object, allows us to connect to a file

            FileInputStream file = new FileInputStream("test.properties");
            //loads the files into the properties object
            properties.load(file);

        } catch (IOException e) {  //IOException is parent of exception that's why it can handle the exception
            System.out.println("File not found");
            e.printStackTrace();
        }
    /*
    static block: want to run the cod at the beginning to make sure everything is set up
    FileInputStream: connect to a file which allows to access to the information in some way
     */
        /*
        summary:
        how do you set up the framework?
        1. creates a properties file called: test.properties
        has some information
        2. created the class called ConfigReader
        3. in ConfigReader we created a Properties object
        4. in the static block we connected to the file, using FileInputStream
        5. used the load method from the Properties object to load the information from the file to the Properties object

         */
    }

    public static String getProperty(String key){
       return properties.getProperty(key);
    }
}
