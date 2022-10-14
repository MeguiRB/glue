package display;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DisplayTXT implements IDisplay {

    @Override
    public void display(String output){
        try {
            String fileName = "/Output" + ".txt";
            String filePath = System.getProperty("user.dir") + fileName;
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));
            writer.write(output);
            writer.close();
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
