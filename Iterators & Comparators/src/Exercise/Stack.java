package Exercise;

import java.util.Iterator;

public class Stack<Integer> implements Iterable<Integer> {
    private class Node<Integer> {
        private final int element;
        private Node<Integer> previous;

        private Node(int element) {
            this.element = element;
            this.previous = null;
        }
    }

    private Node<Integer> top;

    public Stack() {
        this.top = null;
    }

    public void push(int newElement) {
        Node<Integer> newNode = new Node<>(newElement);
        newNode.previous = this.top;
        this.top = newNode;
    }

    public int pop() throws Exception {
        if (this.top == null) {
            /*System.out.println("No elements");
            return 0;*/
            throw new Exception("No elements");
        } else {
            Node<Integer> currentTop = this.top;
            this.top = this.top.previous;
            return currentTop.element;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node<Integer> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @SuppressWarnings("unchecked")
            @Override
            public Integer next() {
                int currentValue = current.element;
                this.current = this.current.previous;
                return (Integer) java.lang.Integer.valueOf(currentValue);
            }
        };
    }
}
