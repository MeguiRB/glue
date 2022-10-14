package glue;

import display.IDisplay;
import output.AbstractOutput;

public class WoodGlue extends AbstractGlue {
    public WoodGlue(IDisplay display, AbstractOutput output) {
        super(output,display,"WoodGlue", "Tube", 13, false, true, false, true, false, 17, 7.00);
    }

}
