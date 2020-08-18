package stack_queue.bai_tap.demering_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {


	Queue<Object> nam = new LinkedList<>();
	 Queue<Object> nu = new LinkedList<>();
	
	public void inputQueue(Officer officer) {
		if(officer.getGender()=="Nam"){
			nam.add(officer);
			
		}else {
			nu.add(officer);
		}

	}

}
