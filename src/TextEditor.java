public class TextEditor {
    private  StringBuilder text;

    // Constructor initializes an empty text buffer
    public TextEditor() {
        this.text = new StringBuilder();
    }

    // Method to append new text to the current text buffer
    public void appendText(String newText) {
        text.append(newText);
    }

    // Method to get the current text content as a string
    public String getText() {
        return text.toString();
    }

    // Method to save the current state as a Memento object
    public TextEditorMemento save() {
        return new TextEditorMemento(text.toString());
    }

    // Method to restore the state from a given Memento object
    public void restore(TextEditorMemento memento) {
        text = new StringBuilder(memento.getText());
    }
}