package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "RikiPlatasBot";
    }
    @Override
    public String getBotToken() {
        return "5677758081:AAGiYbLHdNbdsKGvsV_IZ-nNStZ9NB2vd3Y";
    }
    @Override
    public void onUpdateReceived(final Update update) {
        final String messagetextReceived = update.getMessage().getText();

        final long chatId = update.getMessage().getChatId();

        SendMessage message = procesarMensaje(String.valueOf(chatId), messagetextReceived);

        try{
            execute(message);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
    private SendMessage procesarMensaje(String chatId, String texto){
        SendMessage message = new SendMessage();
        message.setText("Me has dicho : " + texto);
        message.setChatId(String.valueOf(chatId));

        return message;
    }
}
