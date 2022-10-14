package glue;

import display.IDisplay;
import output.AbstractOutput;

public class GlueFactory {


    public AbstractGlue makeGlue(GlueType glueType, IDisplay display, AbstractOutput output) {

        if (glueType==GlueType.PRITTSTIK) {
            return new Prittstik(display,output);
        }
        if (glueType==GlueType.SUPERGLUE) {
            return new SuperGlue(display,output);

        }
        if (glueType==GlueType.WOODGLUE) {
            return new WoodGlue(display,output);

        }
        if (glueType==GlueType.SHITTYGLUE) {
            return new ShittyGlue(display,output);

        }
        throw new RuntimeException("The specified glue type does not exist.");

    }

}