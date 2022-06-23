package Working_with_files;

public class TestNameSorting {
    public static void main(String[] args) {
        String pathToInputFile = "Working_with_files\\listNames.txt";
        String pathToOutputFile = "Working_with_files\\listNames(Sorted).txt";

        NameSorting.sortNames(pathToInputFile, pathToOutputFile);
    }
}
