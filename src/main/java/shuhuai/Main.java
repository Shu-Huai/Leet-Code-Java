package shuhuai;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
                if (!input.startsWith("t")) {
                    System.out.println("输入有误");
                    System.out.println("请输入题号：");
                    input = scanner.nextLine();
                    continue;
                }
                int subGroupFactor = 2;
                int t = Integer.parseInt(input.substring(1));
                int groupSize = (int) Math.pow(10, subGroupFactor);
                int subGroup = t / groupSize * groupSize;
                String group = "t" + subGroup;
                Class<?> clazz = Class.forName("shuhuai.leetcode.problems." + group + "." + input + ".Test");
                String[] pathes = new String[]{System.getProperty("user.dir"), "src", "main", "java", "shuhuai",
                        "leetcode", "problems", group, input, "Problem.md"};
                String fileName = String.join(File.separator, pathes);
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
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
                     InvocationTargetException | NoSuchMethodException | IOException e) {
                System.out.println("输入有误");
                System.out.println("请输入题号：");
                input = scanner.nextLine();
            }
        }
    }
}