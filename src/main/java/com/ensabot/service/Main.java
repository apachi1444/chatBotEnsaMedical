package com.ensabot.service;

/**
 * EnsaBot
 *
 * @author equiê Ensa Gi4
 */
public class Main {

    public Bot bot;

    // default constructor
    public Main(String file) {

        // construct a data parser
        DataParser dp = new DataParser(file);

        // construct new bot with level 0 as default and given data parser
        this.bot = new Bot("0", dp);

    }



    public static String send(String send, Bot bot) {

        String response = bot.send(send);

        // if the response is not empty display it
        if (response.length() > 0) {
            return response;
        }

        // display new state message
        return bot.getMessage();

    }

    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
    }
}
