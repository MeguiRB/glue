import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockingOutput {
    String mockOutput = "";
    public void writeMock(String str){
        mockOutput += str + "\r\n";
    }

    private String readFile() {
        String path = System.getProperty("user.dir") + "/src/test/java/" + "output.gr";
        Path filePath = Paths.get(path);

        try {
            return Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void test() {
        String expected = readFile();
        String actual = mockOutput;
        assertEquals(expected,actual);
    }
}
