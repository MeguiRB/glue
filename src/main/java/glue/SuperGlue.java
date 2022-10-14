package glue;

import display.IDisplay;
import output.AbstractOutput;


public class SuperGlue extends AbstractGlue {
    public SuperGlue(IDisplay display, AbstractOutput output) {
        super(output,display,"SuperGlue", "Bottle", 5, true, true, true, true, true, 9, 6.00);
    }
}
