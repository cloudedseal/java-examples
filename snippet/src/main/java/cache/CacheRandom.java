package cache;

import java.util.ArrayList;
import java.util.Random;

public class CacheRandom {
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
        ArrayList<Integer> cache = new ArrayList<>(cacheSize);
        int miss = 0;
        for (int page : pages) {
            if (!cache.contains(page)) {
                miss = miss + 1;
                if (!cache.isEmpty() && cache.size() == cacheSize) {
                    dumpArray(cache.toArray());
                    // 随机移除一个
                    cache.remove(new Random().nextInt(cacheSize));
                }
                cache.add(page);
                dumpArray(cache.toArray());
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
