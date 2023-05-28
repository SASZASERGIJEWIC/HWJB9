public class JBHW1 {
        public static int numberOfLifts(int floor, int stepUp, int stepDown) {
            int lifts = 0;
            while (floor > 0) {
                floor -= stepUp;
                lifts++;
                if (floor <= 0)
                    break;
                floor += stepDown;
            }
            return lifts;
        }
        public static void main(String[] args) {
            int H = 200;
            int N = 50;
            int M = 1;
            int lifts = numberOfLifts(H, N, M);
            System.out.println("Количество подъемов: " + lifts);
        }
    }

