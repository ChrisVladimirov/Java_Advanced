package Lab.JarJarBings;

import java.util.ArrayDeque;

public class Jar<Pickle> {
    private final ArrayDeque<Pickle> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public void add(Pickle element) {
        this.stack.push(element);
    }

    public Pickle remove() {
        return this.stack.pop();
    }

    public int size() {
        return this.stack.size();
    }
}
