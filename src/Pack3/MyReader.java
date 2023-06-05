package Pack3;

import java.io.*;
import java.util.ArrayList;

public class MyReader {
    public void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        System.out.println("Reading file: " + filePath);
        while ((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
        reader.close();
    }

    public ArrayList<String> proccessContent(String inputFilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        String line;
        ArrayList<String> lines = new ArrayList<>();
        while ((line = reader.readLine()) != null)
        {
            lines.add(line.toUpperCase());
        }
        reader.close();
        return lines;
    }

    public void writeFile(ArrayList<String> lines, String outputFilePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        for (String line : lines)
        {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}
