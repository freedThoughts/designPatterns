package InterpreterPattern;

public class ExpressionNonTerminal implements Expression {
        Interpreter interpreter;
        ExpressionNonTerminal(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public int doInterprete(String expression) {
        if(expression == null || expression.length() == 0)
            return 0;
        if(expression.length() == 1)
            return interpreter.doInterprete(expression);

        Character character = expression.charAt(expression.length()/2);
        if(character.equals('+') || character.equals('-')){
            if(character.equals('+')){
                String subString1 = expression.substring(0, expression.length()/2);
                String subString2 = expression.substring(expression.length()/2 +1, expression.length());
                return doInterprete(subString1) + doInterprete(subString2);
            }

            if(character.equals('-')){
                String subString1 = expression.substring(0, expression.length()/2);
                String subString2 = expression.substring(expression.length()/2 +1, expression.length());
                return doInterprete(subString1) - doInterprete(subString2);
            }
        }
        else {
            character = expression.charAt(expression.length()/2 +1);
            if(character.equals('+') || character.equals('-')) {
                if (character.equals('+')) {
                    String subString1 = expression.substring(0, expression.length() / 2 + 1);
                    String subString2 = expression.substring(expression.length() / 2 + 2, expression.length());
                    return doInterprete(subString1) + doInterprete(subString2);
                }

                if (character.equals('-')) {
                    String subString1 = expression.substring(0, expression.length() / 2 +1);
                    String subString2 = expression.substring(expression.length() / 2 + 2, expression.length());
                    return doInterprete(subString1) - doInterprete(subString2);
                }
            }
        }

        return 0;
    }
}
