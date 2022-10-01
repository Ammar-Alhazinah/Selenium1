package Help;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Help {

    public Help() {
    }

    public String readFile(String key) throws IOException {
        FileReader readFile=new FileReader("user.properties");
        Properties prop= new Properties();
        prop.load(readFile);
        String value = prop.getProperty(key);
        return value;
    }}
