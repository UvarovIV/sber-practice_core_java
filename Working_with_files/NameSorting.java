package Working_with_files;

import java.io.*;

public class NameSorting {

    private static String[] sort(String[] names) {
        for (int i = 0; i < names.length - 1; i++)
            for (int j = i + 1; j < names.length; j++) 
                if (names[i].compareToIgnoreCase(names[j]) > 0){
                    String buff = names[i];
                    names[i] = names[j];
                    names[j] = buff;
                }
        return names;
    }

    public static void sortNames(String pathToInputFile, String pathToOutputFile) {
        try(BufferedReader fileInputStream = new BufferedReader(new FileReader(pathToInputFile)); 
            BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(pathToOutputFile))){
                
                String line = fileInputStream.readLine(); 
                line = line.replace(",", "");
                String[] names = line.split(" ");
                names = sort(names);

                for (String name : names)
                    fileOutputStream.write(name + "\n");

            } catch (IOException e){
                System.out.println(e.getMessage());
            }
    }
}
