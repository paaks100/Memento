public class Main {
    public static void main(String[] args) {
        // Create a new TextEditor instance and a CareTaker instance
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker careTaker = new TextEditorCaretaker();

        // Initial text operations
        textEditor.appendText("Hello, "); // Appending Hello, to textEditor
        careTaker.save(textEditor);
        System.out.println("Text after append: " + textEditor.getText()); // Output: Hello,

        textEditor.appendText("World!"); // Appending World! to textEditor
        careTaker.save(textEditor);
        System.out.println("Text after append: " + textEditor.getText()); // Output: Hello, World!

        textEditor.appendText(" This is a text editor."); // Appending This is a text editor. to textEditor
        System.out.println("Text after append: " + textEditor.getText()); // Output: Hello, World! This is a text editor.

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText()); // Output: Hello, World!

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText()); // Output: Hello,

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText()); // Output: Hello, World!

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText()); // Output: Hello, World! This is a text editor.

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText()); // Output: Hello, World!
        careTaker.save(textEditor);

        textEditor.appendText(" This has overwritten the previous text."); // Appending This has overwritten the previous text. to textEditor
        careTaker.save(textEditor);
        System.out.println("Text after append: " + textEditor.getText()); // Output: Hello, World! This has overwritten the previous text.

        textEditor.appendText(" Let's undo.");
        System.out.println("Text after append: " + textEditor.getText()); // Output: Hello, World! This has overwritten the previous text. Let's undo.

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText()); // Output: Hello, World! This has overwritten the previous text.

        careTaker.undo(textEditor);
        System.out.println("Text after undo: " + textEditor.getText()); // Output: Hello, World!

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText()); // Output: Hello, World! This has overwritten the previous text.

        careTaker.redo(textEditor);
        System.out.println("Text after redo: " + textEditor.getText()); // Output: Hello, World! This has overwritten the previous text. Let's undo.
    }
}