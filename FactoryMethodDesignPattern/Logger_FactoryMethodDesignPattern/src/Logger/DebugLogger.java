package Logger;

public class DebugLogger implements ILogger {

    @Override
    public void Log(String message) {
        System.out.println(message);
    }
    
}
