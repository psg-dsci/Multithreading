class HiThread extends Thread {
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
        }
    }
}
class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i <=10;i++) {
            System.out.println(i);
        }
    }
}
public class fwm {
    public static void main(String[] args) {
        HiThread hiThread = new HiThread();
        HelloThread helloThread = new HelloThread();

        hiThread.start();
        helloThread.start();
    }
}
