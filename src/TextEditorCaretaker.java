import java.util.Stack;

public class TextEditorCaretaker {
    private final Stack<TextEditorMemento> undoStack = new Stack<>();
    private final Stack<TextEditorMemento> redoStack = new Stack<>();

    // Method to save a Memento onto the stack
    public void save(TextEditor textEditor) {
        undoStack.push(textEditor.save());
        redoStack.clear();
    }

    // Method to perform undo operation by popping the last Memento from the stack
    public void undo(TextEditor textEditor) {
        if (!undoStack.isEmpty()) {
            TextEditorMemento currentState = textEditor.save(); // Save current state to redo stack
            redoStack.push(currentState); // Push to redo stack

            TextEditorMemento previousState = undoStack.pop(); // Get the previous state
            textEditor.restore(previousState);
        }
    }

    // Method to perform redo operation by popping the last Memento from the stack again
    public void redo(TextEditor textEditor) {
        if (!redoStack.isEmpty()) {
            TextEditorMemento currentState = textEditor.save(); // Save current state to undo stack
            undoStack.push(currentState); // Push to undo stack

            TextEditorMemento nextState = redoStack.pop(); // Get the next state
            textEditor.restore(nextState);
        }
    }
}
