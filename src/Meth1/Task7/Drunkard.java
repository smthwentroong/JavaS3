package Meth1.Task7;

import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;

class Game {

    public static void resizeDeckStack(int cardOne, int cardTwo, Stack<Integer> deck) {
        Stack<Integer> temp = new Stack<>();

        while (!deck.empty())
            temp.push(deck.pop());

        temp.push(cardOne);
        temp.push(cardTwo);

        while (!temp.empty())
            deck.push(temp.pop());
    }

    public static void withStack() {
        Scanner scn = new Scanner(System.in);

        Stack<Integer> playerFirst = new Stack<>();
        Stack<Integer> playerSecond = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < 5; i++) {
            int number = scn.nextInt();
            temp.push(number);
        }

        for (int i = 0; i < 5; i++)
            playerFirst.push(temp.pop());

        for (int i = 0; i < 5; i++) {
            int number = scn.nextInt();
            temp.push(number);
        }

        for (int i = 0; i < 5; i++)
            playerSecond.push(temp.pop());


        for (int i = 0; i < 106; i++) {


            int cardFirst = playerFirst.pop();
            int cardSecond = playerSecond.pop();

            if (cardFirst > cardSecond) {
                if (cardFirst == 9 && cardSecond == 0)
                    resizeDeckStack(cardFirst, cardSecond, playerSecond);
                else
                    resizeDeckStack(cardFirst, cardSecond, playerFirst);
            } else {
                if (cardSecond == 9 && cardFirst == 0)
                    resizeDeckStack(cardFirst, cardSecond, playerFirst);
                else
                    resizeDeckStack(cardFirst, cardSecond, playerSecond);
            }


            if (i == 105 && !playerFirst.empty() && !playerFirst.empty())
                System.out.println("botva");

            if (playerFirst.empty()) {
                System.out.println("second " + (i + 1));
                break;
            }

            if (playerSecond.empty()) {
                System.out.println("first " + (i + 1));

                break;
            }
        }
    }

    public static void resizeDeckQueue(int cardOne, int cardTwo, Queue<Integer> deck){
        deck.add(cardOne);
        deck.add(cardTwo);
    }

    public static void withQueue(){
        Scanner scn = new Scanner(System.in);

        Queue<Integer> playerFirst = new LinkedList<>();
        Queue<Integer> playerSecond = new LinkedList<>();

        for (int i = 0; i < 5; i++){
            int num = scn.nextInt();
            playerFirst.add(num);
        }

        for (int i = 0; i < 5; i++){
            int num = scn.nextInt();
            playerSecond.add(num);
        }

        for (int i = 0; i < 106; i++) {
            int cardFirst = playerFirst.remove();
            int cardSecond = playerSecond.remove();

            if (cardFirst > cardSecond) {
                if (cardFirst == 9 && cardSecond == 0)
                    resizeDeckQueue(cardFirst, cardSecond, playerSecond);
                else
                    resizeDeckQueue(cardFirst, cardSecond, playerFirst);
            } else {
                if (cardSecond == 9 && cardFirst == 0)
                    resizeDeckQueue(cardFirst, cardSecond, playerFirst);
                else
                    resizeDeckQueue(cardFirst, cardSecond, playerSecond);
            }

            if (i == 105 && !playerFirst.isEmpty() && !playerSecond.isEmpty())
                System.out.println("botva");

            if (playerFirst.isEmpty()) {
                System.out.println("second " + (i + 1));
                break;
            }

            if (playerSecond.isEmpty()) {
                System.out.println("first " + (i + 1));
                break;
            }
        }
    }

    public static void resizeDeckDequeue(int cardOne, int cardTwo, Deque<Integer> deck){
        deck.add(cardOne);
        deck.add(cardTwo);
    }

    public static void withDequeue(){
        Scanner scn = new Scanner(System.in);

        Deque<Integer> playerFirst = new ArrayDeque<>();
        Deque<Integer> playerSecond = new ArrayDeque<>();

        for (int i = 0; i < 5; i++){
            int num = scn.nextInt();
            playerFirst.add(num);
        }

        for (int i = 0; i < 5; i++){
            int num = scn.nextInt();
            playerSecond.add(num);
        }

        for (int i = 0; i < 106; i++) {
            int cardFirst = playerFirst.remove();
            int cardSecond = playerSecond.remove();

            if (cardFirst > cardSecond) {
                if (cardFirst == 9 && cardSecond == 0)
                    resizeDeckDequeue(cardFirst, cardSecond, playerSecond);
                else
                    resizeDeckDequeue(cardFirst, cardSecond, playerFirst);
            } else {
                if (cardSecond == 9 && cardFirst == 0)
                    resizeDeckDequeue(cardFirst, cardSecond, playerFirst);
                else
                    resizeDeckDequeue(cardFirst, cardSecond, playerSecond);
            }

            if (i == 105 && !playerFirst.isEmpty() && !playerSecond.isEmpty())
                System.out.println("botva");

            if (playerFirst.isEmpty()) {
                System.out.println("second " + (i + 1));
                break;
            }

            if (playerSecond.isEmpty()) {
                System.out.println("first " + (i + 1));
                break;
            }
        }
    }

    public static void resizeDeckLinkedList(int cardOne, int cardTwo, LinkedList<Integer> deck){
        deck.addLast(cardOne);
        deck.addLast(cardTwo);
    }

    public static void withLinkedList(){
        Scanner scn = new Scanner(System.in);

        LinkedList<Integer> playerFirst = new LinkedList<>();
        LinkedList<Integer> playerSecond = new LinkedList<>();

        for (int i = 0; i < 5; i++){
            int num = scn.nextInt();
            playerFirst.addLast(num);
        }

        for (int i = 0; i < 5; i++){
            int num = scn.nextInt();
            playerSecond.addLast(num);
        }

        for (int i = 0; i < 106; i++) {
            int cardFirst = playerFirst.removeFirst();
            int cardSecond = playerSecond.removeFirst();

            if (cardFirst > cardSecond) {
                if (cardFirst == 9 && cardSecond == 0)
                    resizeDeckLinkedList(cardFirst, cardSecond, playerSecond);
                else
                    resizeDeckLinkedList(cardFirst, cardSecond, playerFirst);
            } else {
                if (cardSecond == 9 && cardFirst == 0)
                    resizeDeckLinkedList(cardFirst, cardSecond, playerFirst);
                else
                    resizeDeckLinkedList(cardFirst, cardSecond, playerSecond);
            }

            if (i == 105 && !playerFirst.isEmpty() && !playerSecond.isEmpty())
                System.out.println("botva");

            if (playerFirst.isEmpty()) {
                System.out.println("second " + (i + 1));
                break;
            }

            if (playerSecond.isEmpty()) {
                System.out.println("first " + (i + 1));
                break;
            }
        }
    }
}


public class Drunkard {
    public static void main(String[] args) {

        Game.withStack();

        Game.withQueue();

        Game.withDequeue();

        Game.withLinkedList();
    }
}


