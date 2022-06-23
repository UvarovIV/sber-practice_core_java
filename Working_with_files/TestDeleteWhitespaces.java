package Working_with_files;

public class TestDeleteWhitespaces {
    public static void main(String[] args) {

        String pathToInputFile = "Working_with_files\\Borodino.txt";
        String pathToOutputFile = "Working_with_files\\Borodino(Edited).txt";

        DeleteWhitespaces.deleteWhitespaces(pathToInputFile, pathToOutputFile);
    }
}
