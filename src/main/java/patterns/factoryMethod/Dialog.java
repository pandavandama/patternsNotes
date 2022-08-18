package patterns.factoryMethod;

public abstract class Dialog {

    public void render(){
        System.out.println("Dialog is rendered");
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
    public abstract Button createButton();
}
