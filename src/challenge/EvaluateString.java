package challenge;

import java.util.EmptyStackException;
import java.util.Stack;

public class EvaluateString {

    public static String evaluate(String expression) {

        char[] characters = expression.toCharArray();

        // Stack for numbers
        Stack<Double> numbers = new Stack<Double>();

        //Stack for operators
        Stack<Character> operators = new Stack<Character>();

        for (int i = 0; i < characters.length; i++) {

            // Current character is a whitespace, skip it
            if (characters[i] == ' ') { continue; }

            // Current caracter is a number, push it to the stack for numbers
            if (characters[i] >= '0' && characters[i] <= '9') {

                StringBuffer stringBuffer = new StringBuffer();

                // There may be more than one digit in number
                while (i < characters.length && characters[i] >= '0' && characters[i] <= '9') {
                    stringBuffer.append(characters[i++]); // First append. Then, incremets
                }
                numbers.push(Double.parseDouble(stringBuffer.toString()));

                // right now the i points to
                // the character next to the digit,
                // since the for loop also increases
                // the i, we would skip one
                //  token position; we need to
                // decrease the value of i by 1 to
                // correct the offset.
                i--;


                // Current token is an opening brace,
                // push it to 'ops'
            } else if (characters[i] == '(') {
                operators.push(characters[i]);

                // Closing brace encountered,
                // solve entire brace
            } else if (characters[i] == ')') {

                while (operators.peek() != '(') {
                    numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop();


                // Current token is an operator.
            } else if (characters[i] == '+' || characters[i] == '-' || characters[i] == '*' || characters[i] == '/' || characters[i] == '^') {

                // While top of 'ops' has same
                // or greater precedence to current
                // token, which is an operator.
                // Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!operators.empty() && hasPrecedence(characters[i], operators.peek())) {
                    try {
                        numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
                    } catch(EmptyStackException e) {
                        return "ERR SYNTAX";
                    }
                }

                // Push current token to 'ops'.
                operators.push(characters[i]);
            }
        }

        // Entire expression has been
        // parsed at this point, apply remaining
        // ops to remaining values
        while (!operators.empty()) {
            try {
                numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
            } catch (EmptyStackException e) {
                return "ERR SYNTAX";
            } catch (UnsupportedOperationException e) {
                return "ERR DIVBYZERO";
            }
        }
        // Top of 'numbers' contains
        // result, return it
        return numbers.pop().toString();
    }

    // Returns true if 'op2' has higher
    // or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        if ((op1 == '^') && (op2 == '*' || op2 == '/')) {
            return false;
        }
        if ((op1 == '^') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    // A utility method to apply an
    // operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static double applyOp(char op, double b, double a) throws UnsupportedOperationException {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
            case '^':
                return Math.pow(a, b);
        }
        return 0;
    }

}

