package headfirst.designpatterns.producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生产者 生产者消费者模型
 *
 * @author 周何圳 2020年01月21日 新建
 */
public class Producer implements Runnable {

    private volatile boolean isRunning = true;
    /** 内存缓冲区 **/
    private BlockingQueue<PCData> queue;
    /** 总数 **/
    private static AtomicInteger count = new AtomicInteger();
    /** 线程睡眠时间 **/
    private static final int SLEEPTIME = 1000;

    public Producer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        PCData data = null;
        Random r = new Random();
        System.out.println("start producing id:" + Thread.currentThread().getId());
        try {
            while (isRunning) {
                Thread.sleep(r.nextInt(SLEEPTIME));
                data = new PCData(count.incrementAndGet());
                System.out.println(data + " 加入队列");
                // 设定的等待时间为2s，如果2秒超时则返回false
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
                    System.err.println(" 加入队列失败");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public void stop() {
        isRunning = false;
    }
}
