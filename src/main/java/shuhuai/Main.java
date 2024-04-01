package shuhuai;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入题号：");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            try {
                Class<?> clazz = Class.forName("shuhuai.leetcode.problems." + input + ".Test");
                Object object = clazz.getDeclaredConstructor().newInstance();
                Method[] methods = clazz.getDeclaredMethods();
                for (Method method : methods) {
                    String methodName = method.getName();
                    if (("test").equalsIgnoreCase(methodName)) {
                        method.invoke(object);
                    }
                }
                System.out.println("请输入题号：");
                input = scanner.nextLine();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                     InvocationTargetException |
                     NoSuchMethodException e) {
                System.out.println("输入有误");
            }
        }
    }
}