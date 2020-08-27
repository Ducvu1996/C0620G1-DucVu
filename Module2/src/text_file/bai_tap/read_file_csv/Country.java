package text_file.bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Country {

	public static void main(String[] args) throws IOException {
		File file = new File("country.csv");
		FileReader fileReader=  new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
		String line= null;
		while(( line= reader.readLine()) != null) {
			String[] country= line.split(",");
			System.out.println("code"+country[4]+"- country:"+country[5]);
			
		}
		fileReader.close();
	
	
	}

}
