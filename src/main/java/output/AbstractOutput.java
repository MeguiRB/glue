package output;

public abstract class AbstractOutput {
    public String output;
    abstract public void createOutput(String name, String type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int curing, double price);
    public void writeOutput(String text) {
        output += text + "\r\n";
    }


}

