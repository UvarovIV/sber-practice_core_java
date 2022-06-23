package Working_with_files.Whitespaces;

public class TestDeleteWhitespaces {
    public static void main(String[] args) {

        String pathToInputFile = "Working_with_files\\Whitespaces\\Borodino.txt";
        String pathToOutputFile = "Working_with_files\\Whitespaces\\Borodino(Edited).txt";

        DeleteWhitespaces.deleteWhitespaces(pathToInputFile, pathToOutputFile);
    }
}
