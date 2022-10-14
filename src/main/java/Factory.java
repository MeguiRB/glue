import display.DisplayFactory;
import display.DisplayType;
import display.IDisplay;
import glue.AbstractGlue;
import glue.GlueFactory;
import glue.GlueType;
import output.AbstractOutput;
import output.OutputFactory;
import output.OutputType;

public class Factory {
    DisplayFactory displayFactory = new DisplayFactory();
    OutputFactory outputFactory = new OutputFactory();

    public AbstractGlue createGlue(GlueType g, DisplayType d, OutputType o) {
        return new GlueFactory().makeGlue(g, createDisplay(d), createOutput(o));
    }

    private IDisplay createDisplay(DisplayType dType) {
        return displayFactory.makeDisplay(dType);
    }

    private AbstractOutput createOutput(OutputType oType) {
        return outputFactory.makeOutput(oType);

    }

}
