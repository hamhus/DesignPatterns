package Logger;

public class ErrorLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("Error Logger : "+message);
    }
    
}
