import org.junit.Test;

import static org.junit.Assert.*;

public class TestLinkedList {

	@Test
	public void getPos() {
		LinkedList ll = new LinkedList();
		assertEquals("Leere Liste: pos==0", 0, ll.getPos(new Person("leer")));
		Person a = new Person("eins");
		ll.add(a);
		assertEquals("Unbekanntes Element, Test1", 0, ll.getPos(new Person("leer")));
		assertEquals("Element = first", 1, ll.getPos(a));
		ll.add(new Person("zwei"));
		ll.add(new Person("drei"));
		a = new Person("vier");
		ll.add(a);
		assertEquals("Element = last", 4, ll.getPos(a));
		assertEquals("Unbekanntes Element, Test2", 0, ll.getPos(new Person("leer")));
	}

	@Test
	public void removePerson() {
		LinkedList ll = new LinkedList();
		Person a = new Person("eins");
		assertFalse("Leere Liste", ll.removePerson(a));
		ll.add(a);
		assertTrue("Einziges Element", ll.removePerson(a));
		Person b = new Person("zwei");
		Person c = new Person("drei");
		Person d = new Person("vier");
		ll.add(a);
		ll.add(b);
		ll.add(c);
		ll.add(d);
		assertTrue("Letztes Element", ll.removePerson(d));
		assertTrue("Element in Mitte", ll.removePerson(b));
		assertTrue("Erstes Element", ll.removePerson(a));
		ll.reset();
		assertEquals("Liste ok?", c, ll.next());
		assertNull("Liste ok?", ll.next());
	}

	@Test(expected=CurrentNotSetException.class)
	public void insertAfterCurrentException() throws CurrentNotSetException {
		LinkedList ll = new LinkedList();
		ll.insertAfterCurrent(new Person("neu"));
	}

	@Test
	public void insertAfterCurrent() throws CurrentNotSetException {
		LinkedList ll = new LinkedList();
		ll.add(new Person("eins"));
		ll.reset();
		ll.insertAfterCurrent(new Person("zwei"));
		ll.insertAfterCurrent(new Person("drei"));
		ll.next();
		ll.insertAfterCurrent(new Person("vier"));
		ll.next();
		ll.next();
		ll.insertAfterCurrent(new Person("f�nf"));
		ll.reset();
		assertEquals("eins", ll.next().getName());
		assertEquals("drei", ll.next().getName());
		assertEquals("vier", ll.next().getName());
		assertEquals("zwei", ll.next().getName());
		assertEquals("f�nf", ll.next().getName());
	}
	


}