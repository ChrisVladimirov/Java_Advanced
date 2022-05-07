package Exercise.Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> numbers;

    public Lake(int[] stones) {
        this.numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < numbers.size() - 1;
        }

        @Override
        public Integer next() {
            return numbers.get(this.index++);
        }
    }
}
