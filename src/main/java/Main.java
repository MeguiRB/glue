import display.DisplayType;
import glue.AbstractGlue;
import glue.GlueType;
import output.OutputType;

public class Main {

    public static void main(String[] args) {
        Factory myFactory = new Factory();
        AbstractGlue superglue = myFactory.createGlue(GlueType.SUPERGLUE, DisplayType.CONSOLE, OutputType.FRIENDLY);
        AbstractGlue prittstik = myFactory.createGlue(GlueType.PRITTSTIK, DisplayType.TXT, OutputType.RAW);
        superglue.display();
        prittstik.display();
    }

}
