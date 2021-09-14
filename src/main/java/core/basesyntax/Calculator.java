package core.basesyntax;

public class Calculator {
    public double calculate(double firstOperand, double secondOperand, char operation) {
        switch (operation) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand == 0) {
                    throw new ArithmeticException();
                }
                return firstOperand / secondOperand;
            case '^':
                if (firstOperand == 0 && secondOperand <= 0) {
                    throw new ArithmeticException();
                }
                return Math.pow(firstOperand, secondOperand);
            default:
                throw new IllegalArgumentException("Input operation is not valid");
        }
    }
}
