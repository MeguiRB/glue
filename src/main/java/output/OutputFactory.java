package output;

public class OutputFactory {

    public AbstractOutput makeOutput(OutputType outputType) {
        if (outputType == OutputType.RAW)
            return new RawOutput();

        if (outputType == OutputType.FRIENDLY)
            return new FriendlyOutput();

        throw new RuntimeException("The specified output type does not exist.");
    }
}
