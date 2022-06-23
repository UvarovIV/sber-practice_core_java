package Working_with_files.Sorting;

public class TestNameSorting {
    public static void main(String[] args) {
        String pathToInputFile = "Working_with_files\\Sorting\\listNames.txt";
        String pathToOutputFile = "Working_with_files\\Sorting\\listNames(Sorted).txt";

        NameSorting.sortNames(pathToInputFile, pathToOutputFile);
    }
}
