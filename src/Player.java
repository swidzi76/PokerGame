import javafx.util.StringConverter;

public class Player {
    private String name;
    private boolean button;

    public Player(String name) {
        this.name = name;
        this.button = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return getName()+(isButton()?" B ":"");
    }
}
