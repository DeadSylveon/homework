import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            String fileName1 = "Programming.txt";
            String content1 = "Programming is the process of creating a set of instructions that tell a computer how to perform a task. \n" +
                    "Programming can be done using a variety of computer programming languages, such as JavaScript, Python, and C++. \n" +
                    "Created by Pamela Fox.\n";
            System.out.println("Creating file " + fileName1);
            createFile(fileName1, content1);

            String fileName2 = "Java.txt";
            String content2 = "Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems,\n" +
                    "which was later acquired by the Oracle Corporation, that provides a system for developing application software and \n" +
                    "deploying it in a cross-platform computing environment.\n";
            System.out.println("Creating file " + fileName2);
            createFile(fileName2, content2);

            System.out.println("\"Combining\" files " +fileName1 + " и " + fileName2);
            combineFiles(fileName1, fileName2);

            String word = "later";
            wordInFile(word, fileName2);
            word = "heart";
            wordInFile(word, fileName2);
            word = "variety";
            wordInFile(word, fileName1);
            word = "house";
            wordInFile(word, fileName1);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void createFile(String outputFile, String content) throws IOException { // method for task 1
        FileOutputStream fos1 = new FileOutputStream(outputFile);
        fos1.write(content.getBytes());
    }

    private static void combineFiles(String outputFile, String inputFile) throws IOException { // method for task 2
        FileOutputStream fos1 = new FileOutputStream(outputFile, true);
        FileInputStream fis1 = new FileInputStream(inputFile);

        fos1.write(fis1.readAllBytes()); // read bytes from input file; write bytes to output file

    }

    private static boolean isWordInFile(String inputFile, String word) throws IOException { // method for tasks 3-4
        FileInputStream fis1 = new FileInputStream(inputFile);
        StringBuilder fileContent = new StringBuilder();

        while (fis1.available() != 0){ // read content from file
            fileContent.append((char)fis1.read());
        }

        for (int i = 0; i < fileContent.length(); i++) { // loop for checking if there is our word in the file
            if (fileContent.substring(i, i+word.length()).toLowerCase().equals(word.toLowerCase())) // check if this sequence of chars is our word
                // TODO: - check if a word is a separate one, but not a part of another one
                return true;
            if (i == fileContent.length() - word.length())
                return false; // check if it is the end of the file
        }
        return false;
    }

    private static void wordInFile(String word, String fileName) throws IOException { // method for tasks 3-4
        if (isWordInFile(fileName, word)) // call method isWordInFile
            System.out.println("There is word(s) \"" + word + "\" in the file " + fileName);
        else
            System.out.println("There is no word(s) \"" + word + "\" in the file " + fileName);
    }
}
