package arquivos;

import java.io.File;
import java.io.IOException;

public class Aula5 {
	public static void main(String[] args) {

		try {
			listOnlyDirs("D:\\");
			listOnlyFiles("D:\\");
			makeDir("D:\\temp");
			makeFile("D:\\temp\\novo_arquivo.txt");
			makeDir("D:\\temp\\temp2");
			makeFile("D:\\temp\\temp2\\novo_arquivo2.txt");
			list("D:\\temp");
			list("D:\\temp\\temp2");
			
		} catch(CreateFileOrDirException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static void makeDir(String path) throws CreateFileOrDirException {

		File dir = new File(path);
		boolean status = dir.mkdir();
		if (status == false) {
			throw new CreateFileOrDirException("Error while try create folder or file.");
		}
	}

	private static void makeFile(String path) throws IOException, CreateFileOrDirException {

		File file = new File(path);
		boolean status = file.createNewFile();
		if (status == false) {
			throw new CreateFileOrDirException("Error while try create folder or file.");
		}
	}

	private static void listOnlyFiles(String path) {

		File dir = new File(path);
		File[] files = dir.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}

	}

	private static void listOnlyDirs(String path) {

		File dir = new File(path);
		File[] files = dir.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File file : files) {
			System.out.println(file);
		}

	}

	private static void list(String path) {

		File dir = new File(path);
		File[] directories = dir.listFiles();
		System.out.println("ALL CONTENT:");
		for (File directory : directories) {
			System.out.println(directory);
		}

	}

}
