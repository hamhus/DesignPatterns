public class MacFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
    
}
