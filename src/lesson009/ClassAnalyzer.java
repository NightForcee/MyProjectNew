/**
 * Создать класс-анализатор ClassAnalyzer.
 * Класс имеет перегруженный метод analyze(), принимающий объект типа Class или объект, отличныйот него.
 * Реализовать методы,которые анализируют структуру классана предмет полей, методов, конструкторов и
 * аннотаций всех типов для класса. Отчет выводится в консоль.
 *
 * @author Artem Slidenko
 * @version 1.0
 */
package lesson009;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ClassAnalyzer {
    public static void analyzeClass(Class clazz) {
        analyzeMethods(clazz);
        analyzeClassAnnotations(clazz);
        analyzeTransaction(clazz, "", "");
    }

    @Deprecated
    private static void analyzeTransaction(Class clazz, String... methodNames) {
        for (Method method : clazz.getMethods()) {
            if (true) {
                for (Annotation annotation : method.getAnnotations()) {
                    if (annotation instanceof Transactional) {
                        System.out.println("Transaction is started");
                        try {
                            method.invoke(new Object());
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Transaction is ended");
                    }
                }
            }
        }
    }

    private static void analyzeMethods(Class clazz) {
        StringBuilder text = new StringBuilder(500);
        for (Method method : clazz.getMethods()) {
            if (notObjectMethod(method)) {
                text.append("Method: ").append(method.getName()).append("\n")
                        .append("\t").append("Return type: ").append(method.getReturnType().getSimpleName()).append("\n")
                        .append("\t").append("Parameters name: ").append(Arrays.stream(method.getParameters()).map(Parameter::getName).collect(Collectors.joining(", "))).append("\n");
            }
        }
        System.out.println(text);
    }

    private static boolean notObjectMethod(Method method) {
        return !("equals".equals(method.getName()) || "toString".equals(method.getName()) ||
                "wait".equals(method.getName()) || "notify".equals(method.getName()) ||
                "notifyAll".equals(method.getName()) || "hashCode".equals(method.getName()));
    }

    private static void analyzeClassAnnotations(Class clazz) {
        if (clazz != null) {
            for (Annotation annotation : clazz.getAnnotations()) {
                printAnnotationInfo(annotation);
            }
        }
    }

    private static void printAnnotationInfo(Annotation annotation) {
        analyzeClass(annotation.getClass());
    }
}