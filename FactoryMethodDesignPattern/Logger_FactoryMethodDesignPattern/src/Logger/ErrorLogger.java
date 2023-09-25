package Logger;

public class ErrorLogger implements ILogger {

    @Override
    public void Log(String message) {
        System.out.println(message);
    }
    
}
