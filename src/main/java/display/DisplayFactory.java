package display;

public class DisplayFactory {

    public IDisplay makeDisplay(DisplayType displayType) {
        if (displayType == DisplayType.CONSOLE)
            return new ConsoleDisplay();

        if (displayType == DisplayType.TXT)
            return new DisplayTXT();

        if (displayType == DisplayType.PDF)
            return new DisplayPDF();

        throw new RuntimeException("The specified display type does not exist.");

    }
}
