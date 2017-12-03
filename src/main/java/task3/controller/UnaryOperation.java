package task3.controller;

public class UnaryOperation {
    private double number;

    public UnaryOperation() {
    }

    public UnaryOperation(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String toString() {
        return "UnaryOperation = " + number;
    }
    public void Increment() {
        this.number++;
    }
    public void Decrement() {
        this.number--;
    }
    public void Changer() {
        this.number *= -1;
    }
}
