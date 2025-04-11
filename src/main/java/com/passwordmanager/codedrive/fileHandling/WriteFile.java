package com.passwordmanager.codedrive.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    /**
     *
     * @param fileName name of the file you want to write to
     * @param content the content you want to write
     * @param type do you want to append or write a new file 'w' or 'a' for write or append
     */
    public WriteFile(String fileName, String content, char type){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName, type == 'a'));
            System.out.println("Just before writing the content");
            System.out.println("The content is: \n" + content);
            writer.write(content); // Write the content to the file
        } catch (IOException e) {
            e.printStackTrace(); // Better error handling
        } finally {
            try{
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
