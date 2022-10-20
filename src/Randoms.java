import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;


public class Randoms implements Iterable<Integer> {
    private ThreadLocalRandom random;

    private final int min;
    private final int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = ThreadLocalRandom.current();

    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }


    private class RandomsIterator implements Iterator<Integer> {
        public RandomsIterator() {
        }

        @Override
        public boolean hasNext() { // генерация бесконечна
            return true;
        }


        @Override
        public Integer next() {
//            int next;
//            for (int i = min; i <= max; i++) {
//                int a = random.nextInt(max+1);
//                if (a > min) {
//                    next = a;
//                    return next;
//                }
//            }
//            return next();
            return random.nextInt(min, max + 1);
        }
    }
}
