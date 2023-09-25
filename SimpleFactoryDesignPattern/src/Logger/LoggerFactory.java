package Logger;

public class LoggerFactory {
    ILogger log;
    public ILogger createObject(String type)
    {
        
        if(type == "info")
            log = new InfoLogger();
        else if(type == "debug")
            log = new DebugLogger();
        else if(type == "error")
            log = new ErrorLogger();

        return log;
    }
}
