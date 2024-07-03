public class Main {
    public static void main(String[] args) {
        // Create a new TextEditor instance and a CareTaker instance
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker careTaker = new TextEditorCaretaker();

        // Initial text operations
        textEditor.appendText("Hello, "); // Appending Hello, to textEditor
        careTaker.save(textEditor);
        System.out.println("Text after append: " + textEditor.getText());

        textEditor.appendText("World!"); // Appending World! to textEditor
        careTaker.save(textEditor);
        System.out.println("Text after append: " + textEditor.getText());

        textEditor.appendText(" This is a text editor."); // Appending This is a text editor. to textEditor
        System.out.println("Text after append: " + textEditor.getText());

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText());

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText());

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText());

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText());

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText());
        careTaker.save(textEditor);

        textEditor.appendText(" This is new text."); // Appending This has overwritten the previous text. to textEditor
        careTaker.save(textEditor);
        System.out.println("Text after append: " + textEditor.getText());

        textEditor.appendText(" Let's undo."); // Appending Let's undo tp textEditor
        System.out.println("Text after append: " + textEditor.getText());

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText());

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText());

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText());

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText());
    }
}