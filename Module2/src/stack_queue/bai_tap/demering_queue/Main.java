package stack_queue.bai_tap.demering_queue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream file =  null;
		Officer officer_1 = new Officer("NguyenDucVu","Nam","06/09/1997");
		Officer officer_2 = new Officer("NguyenThiThu","Nu","04/07/2000");
		Officer officer_3 = new Officer("TrinhQuocKhanh","Nam","06/09/1997");
		Officer officer_4 = new Officer("NguyenThiThi","Nu","06/09/1997");

		Demerging demerging = new Demerging();

		demerging.inputQueue(officer_1);
		demerging.inputQueue(officer_2);
		demerging.inputQueue(officer_3);
		demerging.inputQueue(officer_4);
		System.out.println(demerging.nu.size());
		System.out.println(demerging.nam.size());
		file =  new FileOutputStream("fileList.txt");
		ObjectOutputStream objectfile = new ObjectOutputStream(file);
		objectfile.writeObject("list\n");
		while(demerging.nu.size()>0) {
			objectfile.writeObject((demerging.nu.poll().toString()));
			
		}
		while(demerging.nam.size()>0) {
			objectfile.writeObject((demerging.nam.poll().toString()));
		}	
		objectfile.close();
	
	}

}
