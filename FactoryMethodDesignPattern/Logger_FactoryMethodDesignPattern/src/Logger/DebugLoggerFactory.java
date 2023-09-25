package Logger;

public class DebugLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
    
}
