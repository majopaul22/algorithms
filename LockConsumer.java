import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Scratch {
    private static Lock lock = new ReentrantLock();
    private Condition added = lock.newCondition();
    private Condition removed = lock.newCondition();
    private int count = 0;
    private int MAX_COUNT = 10;

    public void produce() throws InterruptedException {
        lock.lock();
        try {
                while ( count == MAX_COUNT)
                    removed.await();
                addData();
                added.signal();

        } finally {
                lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while(count == 0)
                added.await();
            removeData();
            removed.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        
    }
}