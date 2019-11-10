package james.example;

public class Tester {

    private static final int MAX_REQUEST = 10;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("==========Start of Main Method =======");
        for (int i = 0; i < MAX_REQUEST; i++) {
            Thread t = new Thread(new RequestThread("id-" + i));
            t.start();
        }
        //Thread.sleep(1000);
        //System.out.println("total:" + Counter.getInstance().getVisited());
        System.out.println("==========End of Main Method =======");
    }
}
