import Logger.DebugLoggerFactory;
import Logger.ILogger;
import Logger.ILoggerFactory;
import Logger.InfoLoggerFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        //Create an InfoLoggerFactory object
        ILoggerFactory infoLogFactory = new InfoLoggerFactory();
        //Create an object of InfoLog class - The factory is responsible to create an object of 
        //InfoLog class (which contains Log() function (implemented from ILogger))
        ILogger infoLog = infoLogFactory.createLogger();
        //Call the Log function
        infoLog.Log("This is an info log");

        ILoggerFactory debugLogFactory = new DebugLoggerFactory();
        ILogger debugLog = debugLogFactory.createLogger();
        debugLog.Log("This is a debug log");

        ILoggerFactory errorLogFactory = new DebugLoggerFactory();
        ILogger errorLog = errorLogFactory.createLogger();
        errorLog.Log("This is an error log");
    }
}
