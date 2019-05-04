package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.*;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length ; i++) {
            list.add(i, array[i]);
        }

        Set<Integer> set = new HashSet<>(list);

        // Проверка
        System.out.print("\nTask 5:\nArray:\t");
        for (Integer integer : array) {
            System.out.print(integer + "\t");
        }
        System.out.print("\nList:\t");
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }
        System.out.print("\nSet:\t");
        for (Integer integer : set) {
            System.out.print(integer + "\t");
        }


        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}