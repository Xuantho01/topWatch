import java.util.Scanner;

public class testStopWatch {
    public static void main(String[] args) {
        stppWatch time = new stppWatch();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. start Time");
            System.out.println("2. stop time");
            System.out.println("3. show time");
            System.out.println("0. exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    time.setStartTime();
                    System.out.println("Start time is: "+time.getStartTime());
                    break;
                case 2:
                    time.setStopTime();
                    System.out.println("Stop time is: "+time.getStopTime());
                    break;
                case 3:
                    System.out.println("time is: "+time.getElapsedTime());
                    break;
                case 0:
                    System.out.println("exit!");
                    System.exit(0);
                    default:
                    break;
            }
        }
    }
}