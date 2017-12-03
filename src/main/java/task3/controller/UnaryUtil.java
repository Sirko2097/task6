package task3.controller;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UnaryUtil {
    UnaryOperation unaryOperation;
    Class<?> clazz = UnaryOperation.class;

    public UnaryOperation getUnaryOperation() {
        return unaryOperation;
    }

    public void createUnaryOperation() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> constructor = clazz.getConstructor(double.class);
        unaryOperation = (UnaryOperation) constructor.newInstance(123.45);
    }

    public void setNumber(double value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method setValueTest = clazz.getMethod("setNumber", double.class);
        setValueTest.invoke(unaryOperation, value);
    }

    public void Increment() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method incrementTest = clazz.getMethod("Increment");
        incrementTest.invoke(unaryOperation);
    }

    public void Decrement() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method decrementTest = clazz.getMethod("Decrement");
        decrementTest.invoke(unaryOperation);
    }


}
