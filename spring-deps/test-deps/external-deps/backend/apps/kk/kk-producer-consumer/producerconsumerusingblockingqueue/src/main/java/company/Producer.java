package company;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Integer> sharedQueue;
    private final int MAX_SIZE = 5;

    public Producer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            int data = random.nextInt(10);
            try {
                sharedQueue.put(data);
                System.out.println("Thread : " + Thread.currentThread().getName() + " Produced : " + data);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
