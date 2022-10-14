package glue;

import display.IDisplay;
import output.AbstractOutput;

public class Prittstik extends AbstractGlue {

    public Prittstik(IDisplay display, AbstractOutput output) {
        super(output,display,"Prittstik", "Metal", 10, true, true, false, false, true, 14, 4.00);
    }
}
