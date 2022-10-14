package glue;

import display.IDisplay;
import output.AbstractOutput;


public class ShittyGlue extends AbstractGlue{
    public ShittyGlue(IDisplay display, AbstractOutput output) {
        super(output,display,"ShittyGlue", "Tube", 5, false, false, false, false, false, 9, 3.00);
    }
}
