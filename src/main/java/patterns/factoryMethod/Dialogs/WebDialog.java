package patterns.factoryMethod.Dialogs;

import patterns.factoryMethod.Button;
import patterns.factoryMethod.Buttons.HTMLButton;
import patterns.factoryMethod.Dialog;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
