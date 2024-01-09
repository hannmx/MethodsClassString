package org.hannmx;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> stringClass = String.class; // Получаем класс String

        Method[] methods = stringClass.getDeclaredMethods(); // Получаем все методы класса String

        System.out.println("Методы класса String:");
        for (Method method : methods) {
            System.out.println(method.getName()); // Выводим на экран имена методов
        }
    }
}
