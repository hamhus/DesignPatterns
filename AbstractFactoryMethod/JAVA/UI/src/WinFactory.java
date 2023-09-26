public class WinFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WinTextBox();
    }
    
}
