package cache;

import java.util.concurrent.ArrayBlockingQueue;

public class CacheFifo {
    public static void main(String[] args) {
        Integer[] pages = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
        calculateCacheHit(pages, 3);
        System.out.println();
        calculateCacheHit(pages, 4);
    }

    private static void calculateCacheHit(Integer[] pages, int cacheSize) {
        System.out.print("缓存页: ");
        dumpArray(pages);
        System.out.println("缓存大小: " + cacheSize);
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue(cacheSize);
        int miss = 0;
        for (int page : pages) {
            if (!queue.contains(page)) {
                miss = miss + 1;
                if (!queue.isEmpty() && queue.size() == cacheSize) {
                    dumpArray(queue.toArray());
                    queue.poll();
                    dumpArray(queue.toArray());
                }
                queue.offer(page);
                dumpArray(queue.toArray());
            }
        }
        System.out.println("cache miss:" + miss);
        System.out.println("total :" + pages.length);
        System.out.println("cache hit:" + (1 - miss * 1.0 / pages.length));
    }

    private static void dumpArray(Object[] array) {
        for (Object o : array) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
