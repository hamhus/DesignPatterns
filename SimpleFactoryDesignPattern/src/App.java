
import Logger.DebugLogger;
import Logger.ErrorLogger;
import Logger.InfoLogger;
import Logger.LogLevel;
import Logger.LoggerFactory;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //ILogger - Debug, Info, Error

        //ILoggerFactory not a static class
        //LoggerFactory log = new LoggerFactory();
        InfoLogger infoLog = (InfoLogger) LoggerFactory.createObject(LogLevel.INFO.toString());
        DebugLogger debugLog = (DebugLogger) LoggerFactory.createObject(LogLevel.DEBUG.toString());
        ErrorLogger errorLog = (ErrorLogger)LoggerFactory.createObject(LogLevel.ERROR.toString());
        
        //InfoLogger infoLog1 = (InfoLogger) log.createObject(LogLevel.INFO);

        //You may make ILogger factory a static class
        

        infoLog.log("This is info log message");
        debugLog.log("This is a debug log message");
        errorLog.log("This is an error log message");
    }
}
