package Logger;

public class DebugLogger implements ILogger{

    @Override
    public void log(String message) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'log'");
        System.out.println("Error log : "+message);
    }
    
}
