package InterpreterPattern;

public class ExpressionTerminal implements Expression {
    Interpreter interpreter;
    ExpressionTerminal(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public int doInterprete(String expression) {
        return interpreter.doInterprete(expression);
    }
}
