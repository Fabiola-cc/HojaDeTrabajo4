package src;

/**
 * Infix_Postfix
 * Implementación generada con ChatGPT, adaptada a la estructura necesitada en el actual programa.
 * Permite convertir una expresión de formato infix a postfix, emplenado un tipo designado de pila.
 *
 * @date 20/02/2023
 * @author Fabiola Contreras
 */
public class Infix_Postfix {
    public static String infixToPostfix(Stack<Character> Tstack, String infixExpression) {
            Stack<Character> stack = Tstack;
            StringBuilder postfixExpression = new StringBuilder();
            for (int i = 0; i < infixExpression.length(); i++) {
                char c = infixExpression.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    postfixExpression.append(c);
                } else if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfixExpression.append(stack.pull());
                    }
                    if (!stack.isEmpty() && stack.peek() != '(') {
                        return "Expresión inválida";
                    } else {
                        stack.pull();
                    }
                } else {
                    while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                        postfixExpression.append(stack.pull());
                    }
                    stack.push(c);
                }
            }
            while (!stack.isEmpty()) {
                postfixExpression.append(stack.pull());
            }
            return postfixExpression.toString();
        }

    /**
     * Este método permite conocer la precedencia o magnitud de un operando para saber en que orden será empleado al hacer cálculos.
     *
     * @param operator caracter que será utilizado como operando en el proceso
     * @return indicador de la magnitud del operando
     */
        public static int precedence(char operator) {
            switch (operator) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
            }
            return -1;
        }

}