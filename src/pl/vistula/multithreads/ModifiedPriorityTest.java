package pl.vistula.multithreads;

public class ModifiedPriorityTest {
    public static void main(String[] args) {
        int highPriorityWins = 0;
        int lowPriorityWins = 0;
        int normal1Wins = 0;
        int normal2Wins = 0;
        int normal3Wins = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- TEST RUN " + (i+1) + " ---");

            Priority.stop = false;

            Priority mt1 = new Priority("High priority thread");
            Priority mt2 = new Priority("Thread with low priority");
            Priority mt3 = new Priority("Thread #1 with normal priority");
            Priority mt4 = new Priority("Thread #2 with normal priority");
            Priority mt5 = new Priority("Thread #3 with normal priority");

            mt1.thread.setPriority(Thread.MAX_PRIORITY);
            mt2.thread.setPriority(Thread.MIN_PRIORITY);
            mt3.thread.setPriority(Thread.NORM_PRIORITY);
            mt4.thread.setPriority(Thread.NORM_PRIORITY);
            mt5.thread.setPriority(Thread.NORM_PRIORITY);

            mt1.thread.start();
            mt2.thread.start();
            mt3.thread.start();
            mt4.thread.start();
            mt5.thread.start();

            try {
                mt1.thread.join();
                mt2.thread.join();
                mt3.thread.join();
                mt4.thread.join();
                mt5.thread.join();
            } catch (InterruptedException e) {
                System.out.println("The main thread was interrupted");
            }

            System.out.println("High priority thread counted to " + mt1.count);
            System.out.println("The low priority thread added to " + mt2.count);
            System.out.println("#1 Normal priority thread added to " + mt3.count);
            System.out.println("#2 Normal priority thread added to " + mt4.count);
            System.out.println("#3 Normal priority thread added to " + mt5.count);

            if (mt1.count >= 10_000_000) {
                highPriorityWins++;
                System.out.println("The high priority thread won in this run!");
            } else if (mt2.count >= 10_000_000) {
                lowPriorityWins++;
                System.out.println("The low priority thread won in this run!");
            } else if (mt3.count >= 10_000_000) {
                normal1Wins++;
                System.out.println("The normal priority thread #1 won in this run!");
            } else if (mt4.count >= 10_000_000) {
                normal2Wins++;
                System.out.println("The normal priority thread #2 won in this run!");
            } else if (mt5.count >= 10_000_000) {
                normal3Wins++;
                System.out.println("The normal priority thread #3 won in this run!");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("High priority thread won: " + highPriorityWins + " times");
        System.out.println("Low priority thread won: " + lowPriorityWins + " times");
        System.out.println("Normal priority thread #1 won: " + normal1Wins + " times");
        System.out.println("Normal priority thread #2 won: " + normal2Wins + " times");
        System.out.println("Normal priority thread #3 won: " + normal3Wins + " times");
    }
}

class Priority implements Runnable {
    int count;
    Thread thread;
    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(thread.getName() + " starts to operate");
        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println(currentName + " is executed");
            }
        } while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thread.getName() + " finishes running");
    }
}