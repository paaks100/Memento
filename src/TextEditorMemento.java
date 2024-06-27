public class TextEditorMemento {
    private final String text;

    // Constructor to initialize with the current text state
    public TextEditorMemento(String text) {
        this.text = text;
    }

    // Getter to retrieve the saved text state
    public String getText() {
        return text;
    }
}