package Meth1.Lab7;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] ags) {
        // Шаблон двусвязного списка
        LinkedList<Integer> templatetList = new LinkedList<>();

        // Добавление элементов в конец списка
        for (int i = 0; i < 10; i++) {
            templatetList.add(10 - i);
            System.out.println("Добавление элементов в шаблонный список: " + templatetList);
        }
        System.out.println("Шаблонный список: " + templatetList);

        // Двусвязный список с копированием всех элементов
        // templateList в исходном порядке
        LinkedList<Integer> testList = new LinkedList<>(templatetList);
        System.out.println("Новый список с копией всех элементов templatetList: " + testList);

        // Добавление элемента в список по индексу
        testList.add(10, -1);
        System.out.println("Добавление элемента по индексу 10: " + testList);

        // Добавление всех элементов исходного списка в конец нового
        testList.addAll(templatetList);
        System.out.println("Добавление всех элементов исходного списка в конец нового: \n" + testList);

        // Добавление всех элементов списка в новый начиная с индекса
        testList.addAll(21, templatetList);
        System.out.println("Добавление всех элементов списка в новый начиная с индекса 21: \n" + testList);

        // Добавление элемента в начало списка
        testList.addFirst(-7);
        System.out.println("Добавление элемента '-7' в начало списка: \n" + testList);

        // Добавление элемента в конец списка
        testList.addLast(-7);
        System.out.println("Добавление элемента '-7' в конец списка: \n" + testList);

        // Очищение списка
        testList.clear();
        System.out.println("Очищеный список :" + testList);

        // Присвоение свойств исходного списка templateList
        testList = (LinkedList) templatetList.clone();
        System.out.println(testList);

        // Проверка на содержание элемента в списке
        System.out.println("Список содержит элемент '5': " + testList.contains(5));

        // Вывод информации об итераторе
        System.out.println("Адрес итератора данного списка: " + testList.descendingIterator());

        // Получение первого элемента без удаления его из списка
        System.out.println("Получение первого элемента без удаления его из списка: " +testList.element());

        // Получение значения элемента по индексу
        System.out.println("Получение значения элемента по индексу '7': " + testList.get(7));

        // Получение значения первого элемента
        System.out.println("Получение значения первого элемента: " + testList.getFirst());

        // Получение значения последнего элемента
        System.out.println("Получение значения последнего элемента: " + testList.getLast());

        // Получения индекса элемента по значению
        System.out.println("Получения индекса элемента по значению 7: " + testList.indexOf(7));

        // Получение последнего элемента со значением 7
        testList.add(8, 7);
        System.out.println("Получение последнего элемента со значением 7: " + testList.lastIndexOf(7));

        // Получение адреса итератора начиная с иднекса 7
        System.out.println("Получение адреса итератора начиная с иднекса 7: " + testList.listIterator(7));

        // Добавление элемента в хвост списка
        testList.offer(13);
        System.out.println("Добавление элемента в хвост списка: " + testList);

        // Добавление элемента в начало списка
        testList.offerFirst(13);
        System.out.println("Добавление элемента в начало списка: " + testList);

        // Добавление элемента в конец списка
        testList.offerLast(-3);
        System.out.println("Добавление элемента в конец списка: " + testList);

        // Извлечение головного элемента списка
        System.out.println("Извлечение головного элемента списка: " + testList.peek());

        // Извлечение первого элемента списка
        System.out.println("Извлечение головного элемента списка: " + testList.peek());

        // Извлечение последнего элемента списка
        System.out.println("Извлечение головного элемента списка: " + testList.peek());

        // Извлечение и удаление первого элемента из списка
        System.out.println("Извлечение и удаление первого элемента из списка: " + testList.poll());

        // Извлечение и удаление первого элемента из списка
        System.out.println("Извлечение и удаление первого элемента из списка: " + testList.pollFirst());

        // Извлечение и удаление последнего элемента из списка
        System.out.println("Извлечение и удаление первого элемента из списка: " + testList.pollLast());

        // Удаление последнего элемента из списка представляемого в виде стэка
        testList.pop();
        System.out.println("Извлечение и удаление последнего элемента из списка: " + testList);

        // Добавление элемента '-5' в конец списка представляемого в виде стэка
        testList.push(-5);
        System.out.println("Добавление элемента '-5' в конец списка представляемого в виде стэка: " + testList);

        // Удаление элемента из списка по индексу
        testList.remove(5);
        System.out.println("Удаление элемента из списка по индексу: " + testList);

        // Удаление первого элемента с заданным значением
        testList.remove((Integer) 3);
        System.out.println("Удаление элемента с заданным значением: " + testList);

        // Удаление первого элемента из списка
        testList.removeFirst();
        System.out.println("Удаление первого элемента из списка: " + testList);

        // Удаление первого совпадающего элемента списка
        testList.removeFirstOccurrence(13);
        System.out.println("Удаление первого совпадающего элемента списка: " + testList);

        // Удаление последнего элемента из списка
        testList.removeLast();
        System.out.println("Удаление последнего элемента из списка: " + testList);

        // Удаление последнего совпадающего элемента списка
        testList.removeLastOccurrence(13);
        System.out.println("Удаление последнего совпадающего элемента списка: " + testList);

        // Установление нового значения для элемента по индексу
        testList.set(1, 25);
        System.out.println("Установление нового значения для элемента по индексу: " + testList);

        // Получение кол-ва элементов списка
        System.out.println("Получение кол-ва элементов списка: " + testList.size());

        // Запись элементо в массив arr содержащий жлементы того же типа данных

        Integer[] arr = new Integer[10];
        testList.toArray(arr);
        System.out.println("Запись элементо в массив arr содержащий жлементы того же типа данных: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        }
}
