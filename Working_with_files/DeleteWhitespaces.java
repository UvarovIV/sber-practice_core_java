package Working_with_files;

import java.io.*;

public class DeleteWhitespaces {
    public static void deleteWhitespaces(String pathToInputFile, String pathToOutputFile) {
        try (BufferedReader fileInputStream = new BufferedReader(new FileReader(pathToInputFile)); 
            BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(pathToOutputFile))){
                String line;
                while((line = fileInputStream.readLine()) != null){
                    fileOutputStream.write(line.replaceAll("\s{2,}", " ") + "\n");
                }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
