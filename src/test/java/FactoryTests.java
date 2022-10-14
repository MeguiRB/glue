import display.*;
import glue.*;
import org.junit.jupiter.api.Test;
import output.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

class FactoryTests {
    
    @Test
    public void returnRawOutput() {
        OutputFactory myFactory = new OutputFactory();
        AbstractOutput myRawOutput = myFactory.makeOutput(OutputType.RAW);
        assertThat(myRawOutput).isExactlyInstanceOf(RawOutput.class);
    }

    @Test
    public void returnFriendlyOutput() {
        OutputFactory myFactory = new OutputFactory();

        AbstractOutput myFriendlyOutput = myFactory.makeOutput(OutputType.FRIENDLY);
        assertThat(myFriendlyOutput).isExactlyInstanceOf(FriendlyOutput.class);
    }

    @Test
    public void errorOutputTypeNonexistent() {
        OutputFactory myFactory = new OutputFactory();
        Throwable thrown = catchThrowable(() -> myFactory.makeOutput(null));
        assertThat(thrown).isInstanceOf(Exception.class)
                .hasMessageContaining("The specified output type does not exist.");
    }

    @Test
    public void returnStringToOutput() {
        MockingOutput mock= new MockingOutput();

        mock.writeMock("---Raw Output---");
        OutputFactory myFactory = new OutputFactory();
        AbstractOutput myRawOutput = myFactory.makeOutput(OutputType.RAW);

        myRawOutput.createOutput("SomeName","SomeType",12,true,false, true, false,false,1,3.00);
        mock.writeMock(myRawOutput.output);


        mock.writeMock("---Friendly Output---");
        AbstractOutput myFriendlyOutput = myFactory.makeOutput(OutputType.FRIENDLY);

        mock.writeMock("Case 1");
        myFriendlyOutput.createOutput("SomeOtherName","SomeOtherType",15,false,true, false, true,false,1,6.00);
        mock.writeMock(myFriendlyOutput.output);

        mock.writeMock("Case 2");
        myFriendlyOutput.createOutput("SomeOtherName","SomeOtherType",10,false,false, false, false,false,6,4.00);
        mock.writeMock(myFriendlyOutput.output);

        mock.writeMock("Case 3");
        myFriendlyOutput.createOutput("SomeOtherName","SomeOtherType",12,true,true, true, true,true,8,2.00);
        mock.writeMock(myFriendlyOutput.output);

        mock.test();
    }

    @Test
    public void returnConsoleDisplay() {
        DisplayFactory myDisplayFactory = new DisplayFactory();

        IDisplay console = myDisplayFactory.makeDisplay(DisplayType.CONSOLE);
        assertThat(console).isExactlyInstanceOf(ConsoleDisplay.class);
    }

    @Test
    public void returnDisplayTXT() {
        DisplayFactory myDisplayFactory = new DisplayFactory();

        IDisplay txt = myDisplayFactory.makeDisplay(DisplayType.TXT);
        assertThat(txt).isExactlyInstanceOf(DisplayTXT.class);
    }
    @Test
    public void returnDisplayPDF() {
        DisplayFactory myDisplayFactory = new DisplayFactory();

        IDisplay pdf = myDisplayFactory.makeDisplay(DisplayType.PDF);
        assertThat(pdf).isExactlyInstanceOf(DisplayPDF.class);
    }

    @Test
    public void errorDisplayTypeNonexistent() {
        DisplayFactory myFactory = new DisplayFactory();
        Throwable thrown = catchThrowable(() -> myFactory.makeDisplay(null));
        assertThat(thrown).isInstanceOf(Exception.class)
                .hasMessageContaining("The specified display type does not exist.");
    }


    @Test
    public void errorGlueTypeNonexistent() {
        GlueFactory myFactory = new GlueFactory();
        // display, output do not affect test
        Throwable thrown = catchThrowable(() -> myFactory.makeGlue(null,null,null));
        assertThat(thrown).isInstanceOf(Exception.class)
                .hasMessageContaining("The specified glue type does not exist.");
    }

    @Test
    public void returnSuperGlue() {
        Factory myFactory = new Factory();
        AbstractGlue superglue = myFactory.createGlue(GlueType.SUPERGLUE, DisplayType.TXT,OutputType.RAW);
        assertThat(superglue).isExactlyInstanceOf(SuperGlue.class);
    }
    @Test
    public void returnWoodGlue() {
        Factory myFactory = new Factory();
        AbstractGlue woodglue = myFactory.createGlue(GlueType.WOODGLUE, DisplayType.TXT,OutputType.RAW);
        assertThat(woodglue).isExactlyInstanceOf(WoodGlue.class);
    }

    @Test
    public void returnPrittstik() {
        Factory myFactory = new Factory();
        AbstractGlue prittstik = myFactory.createGlue(GlueType.PRITTSTIK, DisplayType.TXT,OutputType.RAW);
        assertThat(prittstik).isExactlyInstanceOf(Prittstik.class);
    }
    @Test
    public void returnShittyGlue() {
        Factory myFactory = new Factory();
        AbstractGlue shittyglue = myFactory.createGlue(GlueType.SHITTYGLUE, DisplayType.TXT,OutputType.RAW);
        assertThat(shittyglue).isExactlyInstanceOf(ShittyGlue.class);
    }
}
