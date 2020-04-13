package lastForCertificate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
            while (true) {
                int number = scanner.nextInt();
                if (number == -1) {
                    break;
                }
                executorService.execute(new CustomRunnable(number));
            }
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class CustomRunnable implements Runnable {
        private int second;

        public CustomRunnable(int second) {
            this.second = second;
        }

        public void run() {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(second * 1000);
                System.out.println("Я спал " + second + " секунд");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
