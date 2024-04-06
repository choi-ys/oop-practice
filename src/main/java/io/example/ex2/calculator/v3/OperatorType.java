package io.example.ex2.calculator.v3;

public enum OperatorType {
    ADDITION("+"){
        @Override
        public int operate(int firstOperand, int secondOperand){
            return firstOperand + secondOperand;
        }
    },
    SUBTRACTION("-") {
        @Override
        public int operate(int firstOperand, int secondOperand) {
            return firstOperand - secondOperand;
        }
    },
    DIVISION("/") {
        @Override
        public int operate(int firstOperand, int secondOperand) {
            validateDividend(secondOperand);
            return firstOperand / secondOperand;
        }

        private void validateDividend(int secondOperand) {
            if(isZeroDivisor(secondOperand)) {
                throw new IllegalArgumentException(DIVIDED_ZERO_EXCEPTION_MESSAGE);
            }
        }

        private boolean isZeroDivisor(int divisor) {
            return divisor == 0;
        }
    },
    MULTIPLICATION("*") {
        @Override
        public int operate(int firstOperand, int secondOperand) {
            return firstOperand * secondOperand;
        }
    };

    public static final String DIVIDED_ZERO_EXCEPTION_MESSAGE = "0으로 나눌 수 없습니다.";
    final String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    public abstract int operate(int firstOperand, int secondOperand);
}
