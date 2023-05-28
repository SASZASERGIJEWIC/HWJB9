import java.util.Scanner;

public class JBHW2 {
        public static void counter(int n) {
            int countA = 0;
            int countB = 0;
            int countC = 0;
            int countD = 0;

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < n; i++) {
                System.out.print("Введите оценку " + (i + 1) + ": ");
                String grade = scanner.nextLine();

                switch (grade.toUpperCase()) { //The toUpperCase() method converts a string to upper case letters.
                    case "A" -> countA++;
                    case "B" -> countB++;
                    case "C" -> countC++;
                    case "D" -> countD++;
                    default -> {
                        System.out.println("Неверная оценка: " + grade);
                        i--;
                    }
                }
            }
            System.out.println("Число оценок:");
            System.out.println("A: " + countA);
            System.out.println("B: " + countB);
            System.out.println("C: " + countC);
            System.out.println("D: " + countD);
        }
        public static void main(String[] args) {
            System.out.print("Введите число учеников: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            counter(n);
        }
}

