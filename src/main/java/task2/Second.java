package task2;

import java.lang.reflect.Field;

public class Second {
    public static void main(String[] args) {
        String str = "task2.Second try";
        Class<?> clazz = str.getClass();

        System.out.println(str);
        try {
            Field field = clazz.getDeclaredField("value");
            field.setAccessible(true);
            char[] source = new char[]{'C','h','a','n','g','e','d'};
            field.set(str, source);

            System.out.println(str);
            System.out.println("task2.Second try");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
