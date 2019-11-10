package james.example;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    //private int visited;
    private AtomicInteger count;

    private Counter(final AtomicInteger count) {
        this.count = count;
    }

    static Counter getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Counter INSTANCE =
                new Counter(new AtomicInteger(0));
    }

    public int addCount() {
        return count.incrementAndGet();
    }

/*    public int getVisited() {
        return visited;
    }*/
}
