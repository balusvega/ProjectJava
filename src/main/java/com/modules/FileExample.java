package com.modules;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileExample {

    File myFile = new File("D:\\QATraining\\fileExample.txt");


    public void readFile() {

        try {
            List<String> lines = FileUtils.readLines(myFile, StandardCharsets.UTF_8);

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File is not good");
        }
    }

    public void writeFile() {

            try {
                List<String> lines = new ArrayList<String>();
                lines.add("This si the third line");
                lines.add("This si the fourth line \n");
                 FileUtils.writeLines(myFile,lines,true);

            } catch (IOException e) {
                System.out.println("File is not good");
            }

    }
}
