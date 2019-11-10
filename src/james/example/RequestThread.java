package james.example;

public class RequestThread implements Runnable {

    private String requestId;

    RequestThread(String requestId) {
        this.requestId = requestId;
    }


    @Override
    public void run() {
        printCount();
    }

    private void printCount() {
        Counter counter = Counter.getInstance();

        //counter.addCount();
        System.out.println(requestId + " connected, visited " + counter.addCount() + ", object:" + counter.hashCode());

    }
}
