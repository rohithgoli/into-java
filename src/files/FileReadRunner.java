package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
	public static void main(String[] args) throws IOException {
	
		Path pathFileTORead = Paths.get("./resources/data.txt");
			
//		List<String> lines = Files.readAllLines(pathFileTORead);
//		System.out.println(lines);
		
		Files.lines(pathFileTORead)
			.map(String::toLowerCase)
			.filter(str -> str.contains("a"))
			.forEach(System.out::println);
	}
}
