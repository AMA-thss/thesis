package readnwrite;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class readnwriter {
		public static void main(String[] args) throws IOException {

			File file = new File("/Users/fsque/OneDrive/Desktop/test.txt");
			Scanner scan = new Scanner(file);
			
			String fileContent = "";
			while (scan.hasNextLine()) {
				fileContent = fileContent.concat(scan.nextLine() + "\n");
				
			}
			FileWriter writer = new FileWriter("/Users/fsque/OneDrive/Desktop/newtest.txt");
			writer.write(fileContent);
			writer.close();
	}
	} 

