import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProps {
   // creating an object of properties
    static Properties props;
    // creating an object of fileinputstream
    static FileInputStream inputStream;

    public String getProperty(String key){
        props = new Properties();
        try {
            inputStream = new FileInputStream("src\\test\\Resources\\TestData\\TestDataConfig.properties");
            props.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(key);
}

@Test
    public void testurl(){
    System.out.println(getProperty("url"));
}





}
