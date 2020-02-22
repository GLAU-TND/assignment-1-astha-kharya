package def;

public class MyLinked {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
