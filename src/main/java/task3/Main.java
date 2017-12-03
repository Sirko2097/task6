package task3;


import task3.controller.UnaryUtil;

public class Main {
    public static void main(String[] args) throws Exception {
        UnaryUtil unaryUtil = new UnaryUtil();

        unaryUtil.createUnaryOperation();
        System.out.println(unaryUtil.getUnaryOperation());

        unaryUtil.setNumber(1589562.98453);
        System.out.println(unaryUtil.getUnaryOperation());

        unaryUtil.Increment();
        System.out.println(unaryUtil.getUnaryOperation());

        unaryUtil.Decrement();
        System.out.println(unaryUtil.getUnaryOperation());

    }
}
