public class Application {

    public static void main(String[] args) {
        System.out.println("Hello world - application is running");

        for (int i = 0; i < 1000; i++) {
            if (i < 999) {
                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The value of is " + i);
            }
        }
    }
}
