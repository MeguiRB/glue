package output;

public class RawOutput extends AbstractOutput {

    public void createOutput(String name, String type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int curing, double price) {
        output = "";
        this.writeOutput("Glue Name: " + name);
        this.writeOutput("Glue Type: " + type);
        this.writeOutput("Glue Size (mm): " + size);
        this.writeOutput("Glue Adheres to Plastic: " + plastic);
        this.writeOutput("Glue Adheres to Wood: " + wood);
        this.writeOutput("Glue Adheres to Metal: " + metal);
        this.writeOutput("Glue Adheres to Glass: " + glass);
        this.writeOutput("Glue Adheres to Pottery: " + pottery);
        this.writeOutput("Glue Curing Time (min): " + curing);
        this.writeOutput("Glue Price (£): " + price);
    }

}
