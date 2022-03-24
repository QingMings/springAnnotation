package cn.qingmings.case2;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {



    private CountDownLatch countDownLatch = new CountDownLatch(1);


    /**
     * 两中用法：1.一种是主线程 await,子线程 countDown,用来等待子线程完成任务，主线程搜集结果的场景
     * 另一种是  2. 子线程 await ,设置主线程 CountDownLatch的值为1，当主线程 countDown,子线程同时开始运行，
     * 本用例测试的是第二种
     * @throws InterruptedException
     */
    @Test
    void testCountDownLatch() throws InterruptedException {

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    System.out.println("t1已就绪");
                    countDownLatch.await();
                    System.out.println("t1 开始运行:"+System.currentTimeMillis());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    System.out.println("t2已就绪");
                    countDownLatch.await();
                    System.out.println("t2 开始运行:"+System.currentTimeMillis());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(2000);

        countDownLatch.countDown();

        Thread.sleep(2000);
        System.out.println("主线程退出");
    }



    @Test
    void  testMainThreadAwait(){
        CountDownLatch countDownLatch2 = new CountDownLatch(2);

        Thread thread1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                try {
                    System.out.println("Thread1 execute 2000 ms ");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch2.countDown();
                System.out.println("Thread1 finished");
            }
        });



        Thread thread2 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                try {
                    System.out.println("Thread2 execute 7000 ms ");
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch2.countDown();
                System.out.println("Thread2 finished");
            }
        });

        thread1.start();
        thread2.start();

        try {
            System.out.println("主线程执行 await 之前");
            countDownLatch2.await();
            System.out.println("子线程已全部结束，主线程结束");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
