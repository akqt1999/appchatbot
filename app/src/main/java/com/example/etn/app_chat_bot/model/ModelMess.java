package com.example.etn.app_chat_bot.model;

public class ModelMess {
    String content;
    boolean isBot;


    public String getContent() {
        return content;

    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }

    public ModelMess(String content, boolean isBot) {
        this.content = content;
        this.isBot = isBot;
    }
}
