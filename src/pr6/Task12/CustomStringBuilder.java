package pr6.Task12;

import java.util.ArrayList;
import java.util.List;

public class CustomStringBuilder {
    private StringBuilder stringBuilder;
    private List<Operation> operations;
    private int currentOperationIndex;

    public CustomStringBuilder() {
        stringBuilder = new StringBuilder();
        operations = new ArrayList<>();
        currentOperationIndex = -1;
    }

    public void append(String str) {
        stringBuilder.append(str);
        operations.add(new Operation(OperationType.APPEND, str));
        currentOperationIndex++;
    }

    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        operations.add(new Operation(OperationType.DELETE, deleted, start));
        currentOperationIndex++;
    }

    public void undo() {
        if (currentOperationIndex >= 0) {
            Operation operation = operations.get(currentOperationIndex);
            switch (operation.getType()) {
                case APPEND:
                    stringBuilder.delete(stringBuilder.length() - operation.getText().length(), stringBuilder.length());
                    break;
                case DELETE:
                    stringBuilder.insert(operation.getStartIndex(), operation.getText());
                    break;
            }
            currentOperationIndex--;
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }

    private enum OperationType {
        APPEND, DELETE
    }

    private class Operation {
        private OperationType type;
        private String text;
        private int startIndex;

        Operation(OperationType type, String text) {
            this.type = type;
            this.text = text;
        }

        Operation(OperationType type, String text, int startIndex) {
            this.type = type;
            this.text = text;
            this.startIndex = startIndex;
        }

        OperationType getType() {
            return type;
        }

        String getText() {
            return text;
        }

        int getStartIndex() {
            return startIndex;
        }
    }
}
