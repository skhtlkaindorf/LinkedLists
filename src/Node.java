public class Node
{
    private final Person person;

    private Node next;

    public Node(Person person) {

        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
