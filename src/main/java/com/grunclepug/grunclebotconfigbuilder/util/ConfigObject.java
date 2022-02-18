package com.grunclepug.grunclebotconfigbuilder.util;

/**
 * Models the configuration information for the json object
 * @author GrunclePug
 */
public class ConfigObject {
    private String token;
    private String prefix;
    private String suggestionChannel;
    private String bugReportChannel;
    private String botLogChannel;
    private String guildLogChannel;

    /**
     * Constructor to build ConfigObject
     * @param token bot token
     * @param prefix bot prefix
     * @param suggestionChannel bot suggestion channel id
     * @param bugReportChannel bot bug report channel id
     * @param botLogChannel bot log channel id
     * @param guildLogChannel bot guild log channel id
     */
    public ConfigObject(String token, String prefix, String suggestionChannel, String bugReportChannel, String botLogChannel, String guildLogChannel) {
        this.setToken(token);
        this.setPrefix(prefix);
        this.setSuggestionChannel(suggestionChannel);
        this.setBugReportChannel(bugReportChannel);
        this.setBotLogChannel(botLogChannel);
        this.setGuildLogChannel(guildLogChannel);
    }

    /**
     * Sets token
     * @param token bot token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Sets prefix
     * @param prefix bot prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets Suggestion Channel
     * @param suggestionChannel bot suggestion channel id
     */
    public void setSuggestionChannel(String suggestionChannel) {
        this.suggestionChannel = suggestionChannel;
    }

    /**
     * Sets Bug Report Channel
     * @param bugReportChannel bot bug report channel id
     */
    public void setBugReportChannel(String bugReportChannel) {
        this.bugReportChannel = bugReportChannel;
    }

    /**
     * Sets Bot Log Channel
     * @param botLogChannel bot log channel id
     */
    public void setBotLogChannel(String botLogChannel) {
        this.botLogChannel = botLogChannel;
    }

    /**
     * Sets Guild Log Channel
     * @param guildLogChannel bot guild log channel id
     */
    public void setGuildLogChannel(String guildLogChannel) {
        this.guildLogChannel = guildLogChannel;
    }
}
