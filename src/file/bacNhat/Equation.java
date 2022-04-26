package file.bacNhat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) throws IOException {
        /*File file = new File("test.txt");
        boolean result;
        try {
            result = file.createNewFile();
            if (result) {
                System.out.println("file created " + file.getCanonicalPath()); //returns the path string
            } else {
                System.out.println("File already exist at location: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();    //prints exception if any
        }
        Scanner sc = new Scanner(new File("test.txt"));

        String s = sc.nextLine();
        System.out.println(s);
        String[] arr = s.split(" ");
        double a = Integer.parseInt(arr[0]);
        double b = Integer.parseInt(arr[1]);
        FileWriter myWriter = new FileWriter("filename.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
        try {
            myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if ( a == 0) {
            if (b == 0) {
                bufferedWriter.write("pt Có vô số Nghiêm");
            }else {
                bufferedWriter.write("pt vo nghiem");
            }
        }else {
            bufferedWriter.write("pt co nghiem: " + ( -a / b) + "\n");
        }
        bufferedWriter.close();
        myWriter.close();*/
        File file = new File("test.txt");
        Scanner sc;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } finally {
             sc = new Scanner(file);
        }
        File outputFile = new File("display.txt");
        try {
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }
        }finally {
            new Scanner(outputFile);
        }
        PrintWriter printWriter = new PrintWriter(outputFile);
        List<Integer> integers = new ArrayList<>();
        while (sc.hasNext()) {
            integers.add(sc.nextInt());
        }
        int sum = 0;
        int max = integers.get(0);
        for (int i : integers) {
            sum += i;
            if (max < i) {
                max = i;
            }
        }
        printWriter.println("Tổng: " + sum);
        printWriter.println("Max: " + max);
        printWriter.close();

    }
}
