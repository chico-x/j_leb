import java.util.Scanner;

class EvenAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter no of elements");
            int n = sc.nextInt();
            int[] num = new int[n];
            System.out.println("Enter "+n+" numbers");
            for(int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }

            int sum = 0;
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(num[i] % 2 == 0) {
                    sum += num[i];
                    count++;
                }
            }

            int avg = sum / count;
            System.out.println("Average of Even numbers: " + avg);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: No Even Number Found.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        finally {
            System.out.println("Program Execution completed.");
        }
    }
}
