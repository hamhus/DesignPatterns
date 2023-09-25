package Logger;

public class LoggerFactory {
    static ILogger log;
    public static ILogger createObject(String type)
    {
        switch(type.toString())
        {
            case "INFO":
                log = new InfoLogger();
                break;
            case "DEBUG":
                log = new DebugLogger();
                break;
            case "ERROR":
                log = new ErrorLogger();
                break;
            default:
                log = new InfoLogger();
                break;
        }
        return log;
    }
}
