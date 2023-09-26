public class App {
    public static void main(String[] args) throws Exception {
        
        IGUIFactory guiFactory = GUIFactory.createObject("mac");

        if(guiFactory != null)
        {
            IButton button = guiFactory.createButton();
            button.press("k");

            ITextBox textBox = guiFactory.createTextBox();
            textBox.TextArea("Hameed");
        }

    }
}
