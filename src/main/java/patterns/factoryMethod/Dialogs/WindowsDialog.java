package patterns.factoryMethod.Dialogs;

import patterns.factoryMethod.Button;
import patterns.factoryMethod.Buttons.WindowsButton;
import patterns.factoryMethod.Dialog;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        System.out.println("windows button is created");
        return new WindowsButton();
    }
}
