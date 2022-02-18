package com.grunclepug.grunclebotconfigbuilder.core;

import com.grunclepug.grunclebotconfigbuilder.util.JsonBuilder;

import java.io.IOException;

/**
 * Driver for config builder
 * @author GrunclePug
 */
public class Driver {

    /**
     * Main Method
     * @param args console arguments
     */
    public static void main(String[] args) {
        try {
            new Driver().start();
            System.out.println("File has been written to: " + System.getProperty("user.dir") + "\\" + JsonBuilder.CONFIG_FILE_PATH.replace("/", "\\"));
        } catch(Exception e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Starts the application
     * @throws InterruptedException wait interupted
     */
    private void start() throws InterruptedException {
        System.out.println("GruncleBot Config Builder v0.1");
        Thread.sleep(1000);

        try {
            JsonBuilder.readData();
            JsonBuilder.writeData();
        } catch(IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
