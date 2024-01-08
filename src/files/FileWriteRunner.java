package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
	public static void main(String[] args) throws IOException {
	
		Path pathFileToWrite = Paths.get("./resources/file-write.txt");
		
		List<String> list = List.of("Apple", "Banana", "Carrot", "Drum Stick", "Egg", "Fish", "Guava", "Honey", "Ice", "Jack Fruit");
	
		Files.write(pathFileToWrite, list);
	}
}
