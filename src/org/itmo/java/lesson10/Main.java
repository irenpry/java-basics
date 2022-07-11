package org.itmo.java.lesson10;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** 1 */
        File file = new File("files/test.txt");
        List<String> list = getListFromFile(file);
        /** 2 */
        File outFile = new File("files/output.txt");
        writeToFile("test", outFile);
        /** 3 */
        File resFile = new File("files/result.txt");
        concatFiles(file, outFile, resFile);
        /** 4 */
        File replaceFile = new File("files/replace.txt");
        replaceSomeChars(outFile, replaceFile);
    }

    public static List<String> getListFromFile(File file) {
        List<String> list = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Произошла ошибка " + e.getMessage());
        }
        return list;
    }

    public static void writeToFile(String string, File file) {
        List<String> list = getListFromFile(file);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String s : list) {
                writer.write(s);
                writer.newLine();
            }
            writer.write(string);
        } catch (IOException e) {
            System.out.println("Произошла ошибка " + e.getMessage());
        }
    }

    public static void concatFiles(File file1, File file2, File resultFile) {
        try (BufferedInputStream input1 = new BufferedInputStream(new FileInputStream(file1));
             BufferedInputStream input2 = new BufferedInputStream(new FileInputStream(file2));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(resultFile))) {
            output.write(input1.readAllBytes());
            output.write(input2.readAllBytes());
        } catch (IOException e) {
            System.err.println("Произошла ошибка " + e.getMessage());
        }
    }

    public static void replaceSomeChars(File file1, File file2) {
        try (FileInputStream inputFile = new FileInputStream(file1);
             FileOutputStream outputFile = new FileOutputStream(file2)) {
            byte[] buffer = new byte[inputFile.available()];
            inputFile.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                if (!Character.isLetterOrDigit((char) buffer[i])) {
                    buffer[i] = (byte) '$';
                }
            }
            outputFile.write(buffer);
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
