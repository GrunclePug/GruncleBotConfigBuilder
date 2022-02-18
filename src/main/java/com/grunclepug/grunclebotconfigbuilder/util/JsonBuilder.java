package com.grunclepug.grunclebotconfigbuilder.util;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Builds json object and writes to file
 * @author GrunclePug
 */
public class JsonBuilder {
    public static final String CONFIG_FILE_PATH = "src/main/resources/config.json";
    private static String token;
    private static String prefix;
    private static String suggestionChannel;
    private static String bugReportChannel;
    private static String botLogChannel;
    private static String guildLogChannel;

    /**
     * Read data from console and load into memory
     * @throws IOException issue reading console input
     */
    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Token: ");
        token = reader.readLine();
        System.out.println("Prefix: ");
        prefix = reader.readLine();
        System.out.println("Suggestion Channel ID: ");
        suggestionChannel = reader.readLine();
        System.out.println("Bug Report Channel ID: ");
        bugReportChannel = reader.readLine();
        System.out.println("Bot Log Channel ID: ");
        botLogChannel = reader.readLine();
        System.out.println("Guild Log Channel ID: ");
        guildLogChannel = reader.readLine();
    }

    /**
     * Create a ConfigObject and write its data to file
     * @throws IOException issue writing data to file
     */
    public static void writeData() throws IOException {
        ConfigObject configObject = new ConfigObject(token, prefix, suggestionChannel, bugReportChannel, botLogChannel, guildLogChannel);
        FileWriter writer = new FileWriter(CONFIG_FILE_PATH);
        Gson gson = new Gson();

        gson.toJson(configObject, writer);
        writer.flush();
    }
}
