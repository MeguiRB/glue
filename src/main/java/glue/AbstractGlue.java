package glue;

import display.IDisplay;
import output.AbstractOutput;

public abstract class AbstractGlue {

    private String Name;
    private String Type;
    private int SizeInMillis;
    private boolean AdheresToPlastic;
    private boolean AdheresToWood;
    private boolean AdheresToMetal;
    private boolean AdheresToGlass;
    private boolean AdheresToPottery;
    private int CuringTimeInMinutes;
    private double Price;
    private IDisplay ThisDisplay;
    private AbstractOutput ThisOutput;

    public AbstractGlue(AbstractOutput output, IDisplay display, String name, String type, int size, boolean plastic, boolean wood, boolean metal, boolean glass, boolean pottery, int curing, double price) {
        Name = name;
        Type = type;
        SizeInMillis = size;
        AdheresToWood = wood;
        AdheresToMetal = metal;
        AdheresToGlass = glass;
        AdheresToPlastic = plastic;
        AdheresToPottery = pottery;
        CuringTimeInMinutes = curing;
        Price = price;
        ThisDisplay = display;
        ThisOutput = output;
    }

    public void display(){
        ThisOutput.createOutput(Name, Type, SizeInMillis,AdheresToWood,AdheresToMetal,AdheresToGlass,AdheresToPlastic,AdheresToPottery,CuringTimeInMinutes,Price);
        ThisDisplay.display(ThisOutput.output);
    }

}
