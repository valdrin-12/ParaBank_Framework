package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {


    public static Properties properties=new Properties();//objekti i klases properties me lexu nje fajll
    static{ //static bllok,arsyeja qe mu ekzekutu ky bllok para gjithqkaje
        try {

            FileInputStream file=new FileInputStream("configuration.properties");//me marr emrin e klases te atij fajlli

            properties.load(file);//
            file.close();


        }
        catch(Exception e){

            e.printStackTrace();
        }



    }
    public static String getProperty(String key){ //e krijojme statike qe mos me kriju objekt

        return properties.getProperty(key);// psh browser key=chrome,firefox
    }
}

