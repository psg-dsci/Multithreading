class PrintHi implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
        }
    }
}
class PrintHello implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}
public class fwmr  {
    public static void main(String[] args) throws InterruptedException {
        PrintHi printHi = new PrintHi();
        PrintHello printHello = new PrintHello();
        Thread hi1Thread = new Thread(printHi);
        Thread hello2Thread = new Thread(printHello);
        hi1Thread.start();
        hello2Thread.start();
        hi1Thread.join();
        hello2Thread.join();
        hi1Thread.setPriority(Thread.MIN_PRIORITY);
        hello2Thread.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println(hi1Thread.getPriority());
        System.out.println(hello2Thread.getPriority());
      
    }
}
