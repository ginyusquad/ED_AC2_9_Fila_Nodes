package testes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import source.EmptyQueueException;
import source.FilaNode;
import source.Queue;

public class NodeQueueTest {

	static final Queue<Integer> a = new FilaNode<Integer>();

	@Test
	public void test() throws EmptyQueueException {
		
		assertEquals("[]", a.toString(), "Fila vazia");
		
		a.enqueue(1);
		assertEquals("[1]", a.toString(), "Deve resultar [1]");
		
		a.enqueue(2);
		assertEquals("[1, 2]", a.toString(), "Deve resultar [1, 2]");

		assertEquals(1, a.dequeue(), "Deve resultar 1");
		assertEquals("[2]", a.toString(), "Deve resultar [2]");

		assertEquals( 2 , a.dequeue(), "Deve resultar 2");
		assertEquals("[]", a.toString(), "Deve resultar []");

		assertThrows(EmptyQueueException.class, () -> { a.dequeue(); });
	}

}
