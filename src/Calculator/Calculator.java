package Calculator;

public class Calculator {
    private float firstNum;
    private float secondNum;
    private char operator;
    private float result;

    Calculator() {
        firstNum = 0;
        secondNum = 0;
        operator = 'n';
        result = 0;
    }

    public float getFirstNum() {
        return firstNum;
    }

    public float getSecondNum() {
        return secondNum;
    }

    public int getOperator() {
        return operator;
    }

    public float getResult() {
        return result;
    }

    public void setFirstNum(float firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(float secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public void countResult(float firstNum, char operator, float secondNum) {
        switch (operator) {
            case '+':
                this.setResult(this.getFirstNum() + this.getSecondNum());
                System.out.println(this.getFirstNum() + " + " + this.getSecondNum() + " = " + this.getResult());
                break;
            case '-':
                this.setResult(this.getFirstNum() - this.getSecondNum());
                System.out.println(this.getFirstNum() + " - " + this.getSecondNum() + " = " + this.getResult());
                break;
            case '*':
                this.setResult(this.getFirstNum() * this.getSecondNum());
                System.out.println(this.getFirstNum() + " * " + this.getSecondNum() + " = " + this.getResult());
                break;
            case '/':
                this.setResult(this.getFirstNum() / this.getSecondNum());
                System.out.println(this.getFirstNum() + " / " + this.getSecondNum() + " = " + this.getResult());
                break;
        }
    }
}
