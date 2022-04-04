package Ejercicio5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ordenacionDeListas {
	
	public void ordenacionMezcla() {
		Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1,4,10));
		Queue<Integer> q2 = new LinkedList<>(Arrays.asList(2,8,19));
		
		Queue<Integer> q3 = new LinkedList<>(Arrays.asList());
		do {
			if (q1.peek()<q2.peek()) {
				q3.add(q1.poll());
			}else {
				q3.add(q2.poll());
			}
		}while(!q1.isEmpty() && !q2.isEmpty());
	}
	
	public static void main(String[] args) {
		
	}
	
}