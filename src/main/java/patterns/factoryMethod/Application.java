package patterns.factoryMethod;

import patterns.factoryMethod.Dialogs.WebDialog;
import patterns.factoryMethod.Dialogs.WindowsDialog;

public class Application {
    Dialog dialog;

    Application(){
        int config = 1;
        if (config == 1){
            dialog = new WindowsDialog();
        }else {
            dialog = new WebDialog();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.dialog.render();
    }
}
