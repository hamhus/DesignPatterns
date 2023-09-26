

public class GUIFactory {
    static IGUIFactory factory;
    public static IGUIFactory createObject(String type)
    {
        
        switch(type.toString())
        {
            case "mac":
                factory = new MacFactory();
                break;
            case "windows":
                factory = new WinFactory();
                break;
            default:
                factory = new WinFactory();
                break;
        }
        return factory;
    }
}
