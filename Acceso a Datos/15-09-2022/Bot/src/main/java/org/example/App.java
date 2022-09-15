package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        registrarBot();
    }

    public static void registrarBot(){
        try{
            TelegramBotsApi botsapi = new TelegramBotsApi(DefaultBotSession.class);
            botsapi.registerBot(new Bot());
        }catch(TelegramApiException e){
            e.printStackTrace();
        }
    }
}
