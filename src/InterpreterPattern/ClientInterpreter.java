package InterpreterPattern;

/*

Expression ->> A+B-M+K+29-7+Z-R  should be interpreted  as below -
All the alphabet would be changed to it's ancii value
Mathematical expression would be evaluated and produce a final result

*/

public class ClientInterpreter {
    public static void main(String[] a) {
        Expression expression = new ExpressionNonTerminal(new Interpreter());
        System.out.print(expression.doInterprete("A+B-M+K+29-7+Z-R"));
    }
}
