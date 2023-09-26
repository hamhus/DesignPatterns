public class MacButton implements IButton {

    @Override
    public void press(String key) {
        System.out.println("Pressed Key : "+key);
    }
    
}
