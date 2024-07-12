public class lmh {
    public static void main(String[] args) {
        Runnable printHi = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
            }
        };

        Runnable printHello = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        };

        Runnable printClasses = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Class");
            }
        };

        Thread hi1Thread = new Thread(printHi);
        Thread hello2Thread = new Thread(printHello);
        Thread prinThread = new Thread(printClasses);

        hi1Thread.start();
        hello2Thread.start();
        prinThread.start();
    }
}
