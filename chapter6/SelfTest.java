package chapter6;

public class SelfTest {
    public static void main(String[] args) {
        // Implementing a Stack Heap
        class Stack {
            private char stack[];
            private int tos;

            Stack(int size) {
                stack = new char[size];
                tos = 0;
            }

            void push(char ch) {
                if (tos == stack.length) {
                    System.out.println("Stack is full!");
                } else {
                    stack[tos] = ch;
                    tos++;
                }
            }

            char pop() {
                if (tos == 0) {
                    System.out.println(("Stack is empty!"));
                }
                tos--;
                return (char) stack[tos];
            }
        }
        // conclusion - complete copy and paste failure, didn't even try - demotivated

        // write a method swap
        class Test {
            int a;
            Test (int i) {
                a = i;
            }

            void swap(Test ob1, Test ob2) {
                int copy = ob1.a;
                ob1.a = ob2.a;
                ob2.a = copy;
            }
        }
        // conclusion - success, easy problem

        // write a recursive method that displays the contents of a string backwards
        class Backwards {
            Backwards (String msg) {
                printBackwards(msg, 0);
            }
            void printBackwards(String msg, int index) {
                if (index != msg.length()) {
                    System.out.println(msg.charAt(msg.length() - index - 1));
                    printBackwards(msg, index + 1);
                }
            }
        }

        Backwards ob = new Backwards("Hello there!");

        // sum from varags
        int result = vaShow(1, 2, 5);
        System.out.println(result);

        // ambiguous overloading example
        class NestedExample {
            NestedExample(int ... v) {
                System.out.println("test");
            }

            NestedExample(int a, int b, int ... v) {
                System.out.println("This will fail to compile!");
            }
        }

        // see we have an ambiguous error below
        NestedExample demo = new NestedExample(5, 5, 3);
    }

    static int vaShow(int ... v) {
        int total = 0;

        for (int i = 0; i < v.length; i++) {
            total += v[i];
        }

        return total;
    }
}