
public class LinkedList
{
    private Node first;

    private Node last;

    private Node current;

    /**
     * Einfuegen einer neuen Person am Ende der Liste
     * @param a Person
     */
    public void add(Person a) {
        Node n = new Node(a);
        // TODO: Your code

    }

    /**
     * Internen Zeiger fuer next() zuruecksetzen
     */
    public void reset() {
        current = first;
    }

    /**
     * Gibt aktuelle Person zurueck und setzt internen Zeiger weiter
     * @return Person|null
     */
    public Person next() {
        // TODO: Your code



        return null;
    }

    /**
     * Gibt Person an bestimmter Position zurueck. Ausgehend von first muss die Liste von vorne nach hinten
     * durchgegangen werden, bis das Element an der Position pos erreicht wurde.
     * @param pos Position, Nummerierung startet mit 1
     * @return Person|null
     */
    public Person get(int pos) {
        Node n = first;
        // TODO: Your code




        return null;
    }

    /**
     * Entfernen des Elements an der angegebenen Position
     *
     * @param pos
     */
    public void remove(int pos) {
        // 1. Ausgehend von first, bis zum Element an der Position pos hin navigieren. (siehe get)
        // 2. Überprüfen ob pos überhaupt gefunden wurde
        // 3. Aufpassen, wenn pos das erste Element ist, dann muss first nämlich auch geändert werden
        // 4. Next richtig setzen
        // 5. Aufpassen, wenn pos das letzte Element ist, dann muss last nämlich auch geändert werden

        //TODO: Your code
    }

    /**
     * Retourniert die Position einer Person in der Liste
     * @param a Zu suchende Person
     * @return int Position oder 0, wenn Person nicht gefunden
     */
    public int getPos(Person a) {


        return 0;
    }

    /**
     * Loescht eine angegebene Person aus der Liste
     * @param a Zu loeschende Person
     * @return boolean true:  Person geloescht,
     *                 false: Person nicht gefunden
     */
    public boolean removePerson(Person a) {
        // Verwende getPos um die Position zu finden
        // Verwende remove(int pos) um an der Position zu löschen

        return true;
    }

    /**
     * Fuegt die uebergebene Person nach dem aktuellen
     * Eintrag (current) hinzu.
     * @param a Person
     * @throws CurrentNotSetException
     */
    public void insertAfterCurrent(Person a) throws CurrentNotSetException {


    }



}