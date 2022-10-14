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

    public AbstractGlue createGlue(GlueType glueType, DisplayType displayType, OutputType outputType) {
        return new GlueFactory().makeGlue(glueType, createDisplay(displayType), createOutput(outputType));
    }

    private IDisplay createDisplay(DisplayType displayType) {
        return displayFactory.makeDisplay(displayType);
    }

    private AbstractOutput createOutput(OutputType outputType) {
        return outputFactory.makeOutput(outputType);

    }

}
