import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];

        FillRand(arr);
        Print(arr);
        Sort(arr);
        Print(arr);

        System.out.println("Сумма элементов массива: " + Sum(arr));
        //System.out.println("Среднее арифметическое: " + Avg(arr));
        System.out.println("Максимум: " + MaxValueIn(arr) + "; " + "Минимум: " + MinValueIn(arr));
    }
    static void FillRand(int[] arr)
    {
        Random rand = new Random(0);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(100);
        }
    }
    static void Print ( int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    static void Sort ( int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
    }
    static int Sum (int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    static int MaxValueIn(int [] arr)
    {
        int maxArrayElement = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(maxArrayElement < arr[i])
                maxArrayElement = arr[i];
        }
        return maxArrayElement;
    }
    static int MinValueIn(int [] arr)
    {
        int minArrayElement = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(minArrayElement < arr[i])
                minArrayElement = arr[i];
        }
        return minArrayElement;
    }
}