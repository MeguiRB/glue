package output;

public class FriendlyOutput extends AbstractOutput {

    public void createOutput(String name, String type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int curing, double price) {
        output = "";
        this.writeOutput("Glue Name: " + name);
        this.writeOutput("Glue Type: " + type);
        this.writeOutput("Glue Size: " + size + " mm");

        String ad = Adherants(plastic, wood, metal, glass, pottery);
        if (!ad.isEmpty()) this.writeOutput("Glue Adheres to: " + ad);
        String notAd = NotAdherants(plastic, wood, metal, glass, pottery);
        if (!notAd.isEmpty()) this.writeOutput("Glue Not to be used on: " + notAd);
        this.writeOutput("Glue Curing Time: " + curing + " min");
        this.writeOutput("Glue Price: " + price + "£");
    }

    public String Adherants(boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery) {
        String adherents = (plastic ? "Plastic ":"") + (wood ? "Wood ":"") + (metal ? "Metal ":"") + (glass ? "Glass ":"") + (pottery ? "Pottery ":"");
        return adherents.trim().replace(" ",", ");
    }

    public String NotAdherants(boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery) {
        String adherents = (!plastic ? "Plastic ":"") + (!wood ? "Wood ":"") + (!metal ? "Metal ":"") + (!glass ? "Glass ":"") + (!pottery ? "Pottery ":"");
        return adherents.trim().replace(" ",", ");
    }

}

/*        Dictionary<String, Boolean> Adhere = new Hashtable<>();
        Adhere.put("Plastic",plastic);
        Adhere.put("Wood",wood);
        Adhere.put("Metal",metal);
        Adhere.put("Glass",glass);
        Adhere.put("Pottery",pottery);*/