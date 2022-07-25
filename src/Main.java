import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        //������� 1

        int monthTotal = 0;
        for (int element : arr) {
            monthTotal += element;
        }
        System.out.println("����� ���� �� ����� ��������� " + monthTotal + " ������");


        //������� 2

        int minSpending = 200000;
        int maxSpending = 100000;

        for (int element : arr) {
            if (element < minSpending) {
                minSpending = element;
            }
            if (element > maxSpending) {
                maxSpending = element;
            }
        }
        System.out.println("����������� ����� ���� �� ���� ��������� " + minSpending + " ������. ������������ ����� ���� �� ���� ��������� " + maxSpending + " ������");


        //������� 3

        double monthAverage = monthTotal / 30.0;
        System.out.println("������� ����� ���� �� ����� ��������� " + monthAverage + " ������");


        //������� 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(reverseFullName[0]);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}