package Logger;

public class InfoLogger implements ILogger {

    @Override
    public void Log(String message) {
       System.out.println(message);
    }
    
}
