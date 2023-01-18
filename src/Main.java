import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        float[] array1 = {1.57f, 7.654f, 9.986f};

        double[] arbitrary = new double[5];
        arbitrary[0] = 1.25;
        arbitrary[1] = 3.75;
        arbitrary[2] = 5;

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        float[] array1 = {1.57f, 7.654f, 9.986f};

        double[] arbitrary = new double[5];
        arbitrary[0] = 1.25;
        arbitrary[1] = 3.75;
        arbitrary[2] = 5;

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else if (i < array.length) {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        for (int j = 0; j < array1.length; j++) {
            if (j < array1.length - 1) {
                System.out.print(array1[j] + ", ");
            } else if (j < array1.length) {
                System.out.print(array1[j]);
            }
        }
        System.out.println();
        for (int k = 0; k < arbitrary.length; k++) {
            if (k < arbitrary.length - 1) {
                System.out.print(arbitrary[k] + ", ");
            } else if (k < arbitrary.length) {
                System.out.println(arbitrary[k]);
            }
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        float[] array1 = {1.57f, 7.654f, 9.986f};

        double[] arbitrary = new double[5];
        arbitrary[0] = 1.25;
        arbitrary[1] = 3.75;
        arbitrary[2] = 5;

        for (int i = array.length - 1; i >= 0; i--) {
            if (i >= 1) {
                System.out.print(array[i] + ", ");
                } else if(i <= array[0]) {
                    System.out.print(array[i]);
                }
            }
        System.out.println();
        for (int j = array1.length - 1; j >= 0; j--) {
            if (j >= 1) {
                System.out.print(array1[j] + ", ");
            } else if (j <= array1[0]) {
                System.out.print(array1[j]);
            }
        }
        System.out.println();
        for (int k = arbitrary.length - 1; k >= 0; k--) {
            if (k >= 1) {
                System.out.print(arbitrary[k] + ", ");
            } else if (k <= arbitrary[0]) {
                System.out.print(arbitrary[k]);
            }
        }
        System.out.println();

        }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                array[i] = array[i] + 1;
            }
            System.out.println(array[i]);
        }
    }

    }



