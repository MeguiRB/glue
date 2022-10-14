package display;

public class ConsoleDisplay implements IDisplay {
    @Override
    public void display(String output) {
        System.out.println(output);
    }
}
