package testes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import source.FilaNode;
import source.Queue;
/* Teste codigo para questão 8  
 * 
 * 
 */
public class TabFilaTest {
	
	static final Queue<Integer> a = new FilaNode<Integer>();

	@Test
	public void test() {
		
		assertEquals("[]", a.toString(), "Fila vazia");
			
		// enqueue(5) - (5)
		a.enqueue(5);
		// enqueue(3) - (5, 3)
		a.enqueue(3);
		
		// dequeue() 5 (3)
		assertEquals(5, a.dequeue()," verfica se 5 sai primeiro ");
		
		// enqueue(2) - (3, 2)
		a.enqueue(2);
		// enqueue(8) - (3, 2, 8)
		a.enqueue(8);
		
		// dequeue() 3 (2, 8)
		assertEquals(3, a.dequeue()," verifica se 3 sai primeiro");
		
		// dequeue() 2 (8)
		assertEquals(2, a.dequeue()," verifica se 2 sai primeiro");
		
		// enqueue(9) - (8, 9)
		a.enqueue(9);
		// enqueue(1) - (8, 9, 1)
		a.enqueue(1);
		
		// dequeue() 8 (9, 1)
		assertEquals(8, a.dequeue()," verifica se 8 sai primeiro");
		
		// enqueue(7) - (9, 1, 7)
		a.enqueue(7);
		// enqueue(6) - (9, 1, 7, 6)
		a.enqueue(6);
		
		// dequeue() 9 (1, 7, 6)
		assertEquals(9, a.dequeue()," verifica se 9 sai primeiro");
		
		// dequeue() 1 (7, 6)
		assertEquals(1, a.dequeue()," verifica se 1 sai primeiro");
		
		// enqueue(4) - (7, 6, 4)
		a.enqueue(4);
		
		// dequeue() 7 (6, 4)
		assertEquals(7, a.dequeue()," verifica se 7 sai primeiro");
		
		// dequeue() 6  (4)
		assertEquals(6, a.dequeue()," verifica se 6 sai primeiro");

		// Teste final:
		assertEquals("[4]", a.toString(), " vericia se o sobrou somento o ultimo elemento da lista");
		
	}

}
