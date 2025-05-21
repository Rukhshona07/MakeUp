package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public SendMessage language(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Choose Language : ");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        replyKeyboardMarkup.setResizeKeyboard(true);

        button.setText("Uzbek \uD83C\uDDFA\uD83C\uDDFF ");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Russian \uD83C\uDDF7\uD83C\uDDFA");
        row.add(button1);
        rows.add(row);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("English \uD83C\uDDFA\uD83C\uDDF8/\uD83C\uDDEC\uD83C\uDDE7");
        row.add(button2);

        replyKeyboardMarkup.setKeyboard(rows);
        message.setReplyMarkup(replyKeyboardMarkup);

        return message;
    }

    public SendMessage Uzbek(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Assalomu aleykum \uD83D\uDC4B GlamPro ga xush kelibsiz - go'zallik olamidagi yordamchingiz!\n" +
                "\n" +
                "Bu yerda siz osongina qilishingiz mumkin:\n" +
                "\uD83D\uDCC5 Istalgan sana uchun vizajistni bron qiling,  \n" +
                "\uD83D\uDC84 Istalgan bo'yanish uslubini tanlang,  \n" +
                "\uD83D\uDCF8 va eng yaxshi mutaxassislar portfoliosini ko'ring.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("Bron qilmoq \uD83D\uDCAB");
        button.setCallbackData("bron");
        row.add(button);
        keyboard.add(row);
        inlineKeyboardMarkup.setKeyboard(keyboard);

        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage Date(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(
                "1\uFE0F⃣ Tashrif sanasi \uD83D\uDCC6 :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("1");
        button.setCallbackData("date_1");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("2");
        button.setCallbackData("date_2");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("3");
        button.setCallbackData("date_3");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("4");
        button.setCallbackData("date_4");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("5");
        button.setCallbackData("date_5");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("6");
        button.setCallbackData("date_6");
        row.add(button);

        row = new ArrayList<>();

        button = new InlineKeyboardButton();
        button.setText("7");
        button.setCallbackData("date_7");
        row.add(button);
        keyboard.add(row);

        button = new InlineKeyboardButton();
        button.setText("8");
        button.setCallbackData("date_8");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("9");
        button.setCallbackData("date_9");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("10");
        button.setCallbackData("date_10");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("11");
        button.setCallbackData("date_11");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("12");
        button.setCallbackData("date_12");
        row.add(button);

        row = new ArrayList<>();

        button = new InlineKeyboardButton();
        button.setText("13");
        button.setCallbackData("date_13");
        row.add(button);
        keyboard.add(row);

        button = new InlineKeyboardButton();
        button.setText("14");
        button.setCallbackData("date_14");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("15");
        button.setCallbackData("date_15");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("16");
        button.setCallbackData("date_16");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("17");
        button.setCallbackData("date_17");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("18");
        button.setCallbackData("date_18");
        row.add(button);

        row = new ArrayList<>();

        button = new InlineKeyboardButton();
        button.setText("19");
        button.setCallbackData("date_19");
        row.add(button);
        keyboard.add(row);

        button = new InlineKeyboardButton();
        button.setText("20");
        button.setCallbackData("date_20");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("21");
        button.setCallbackData("date_21");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("22");
        button.setCallbackData("date_22");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("23");
        button.setCallbackData("date_23");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("24");
        button.setCallbackData("date_24");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("25");
        button.setCallbackData("date_25");
        row.add(button);
        keyboard.add(row);

        button = new InlineKeyboardButton();
        button.setText("26");
        button.setCallbackData("date_26");
        row.add(button);


        button = new InlineKeyboardButton();
        button.setText("27");
        button.setCallbackData("date_27");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("28");
        button.setCallbackData("date_28");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("29");
        button.setCallbackData("date_29");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("30");
        button.setCallbackData("date_30");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);

        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage TipMakeup(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(" 3\uFE0F⃣ Makiyaj turi  \uD83D\uDC84 :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("To'y ba'zim \uD83D\uDC70\uD83C\uDFFC\u200D♀\uFE0F");
        button.setCallbackData("wedding");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Kechki ba'zim \uD83D\uDC83\uD83C\uDFFC");
        button.setCallbackData("party");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Fotosessiya \uD83D\uDCF8");
        button.setCallbackData("photo");
        row.add(button);


        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage Brontext(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("\uD83C\uDF1F Ajoyib! Keling, sizning ideal tasviringizni yarataylik ");
        return message;
    }

    public SendMessage Time(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(" 2\uFE0F⃣ Vaqt \uD83D\uDD53 :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("9:00 - 10:30");
        button.setCallbackData("t_1");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("11:00 - 12:30");
        button.setCallbackData("t_2");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("13:00 - 14:30");
        button.setCallbackData("t_3");
        row.add(button);

        row = new ArrayList<>();

        button = new InlineKeyboardButton();
        button.setText("15:00 - 16:30");
        button.setCallbackData("t_4");
        row.add(button);
        keyboard.add(row);

        button = new InlineKeyboardButton();
        button.setText("15:30 - 17:30");
        button.setCallbackData("t_5");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("18:00 - 19:30");
        button.setCallbackData("t_6");
        row.add(button);

        keyboard.add(row);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage HomeOrSalon(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("\uD83D\uDCCD Birinchi bo'lib, bo'yanishingizni qayerda qilish kerakligini tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("Salon \uD83C\uDF80");
        button.setCallbackData("salon");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Xonadonda \uD83C\uDFE1");
        button.setCallbackData("home");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Wedding(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/df/b0/f6/dfb0f6e170e15317221b658c42c5b4da.jpg"));
        message.setCaption("Kelinchak uchun obraz : Ko'zlarga urg'u berilgan glamur \uD83D\uDC70\uD83C\uDFFC\u200D♀\uFE0F :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("ok");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("kelin");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Wed2(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/b8/87/2b/b8872bb27f94f7ea2ae5a55f8dc23033.jpg"));
        message.setCaption("Kelinchak uchun obraz : Klassik ko'rinish \uD83D\uDC70\uD83C\uDFFC\u200D♀\uFE0F :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("ok1");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("kelin1");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Wed3(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/7f/3a/41/7f3a414bb579e806585f02a4dc207c2d.jpg"));
        message.setCaption("Kelinchak uchun obraz : Nyud \uD83D\uDC70\uD83C\uDFFC\u200D♀\uFE0F :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("ok2");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("kelin2");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Wed4(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/7c/1b/c5/7c1bc5fe10c566f4f967c42f9e422cec.jpg"));
        message.setCaption("Kelinchak uchun obraz : Nozik pushti \uD83D\uDC70\uD83C\uDFFC\u200D♀\uFE0F :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("ok3");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("kelin3");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage Ok(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Malumot sifatida ushbu uslubni tanlashni xohlaysizmi ✨? ");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("yes");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("❌");
        button.setCallbackData("no");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Party(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/1f/39/23/1f39234f7a6f15428fd2149103b9acdc.jpg"));
        message.setCaption("Kechki ba'zim uchun obraz : Glamur uslub \uD83D\uDC83\uD83C\uDFFC :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("party_ok");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("partyOne");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Party1(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/aa/93/96/aa9396072851d81caad71702232c89eb.jpg"));
        message.setCaption("Kechki ba'zim uchun obraz : Nozik pushti \uD83D\uDC83\uD83C\uDFFC :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("party_ok1");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("party1");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Party2(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/db/b1/90/dbb1903c1403cdd9f9b01e5311b48e31.jpg"));
        message.setCaption("Kechki ba'zim uchun obraz : Klassik uslub \uD83D\uDC83\uD83C\uDFFC :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("party_ok2");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("party2");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Party3(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/61/ff/73/61ff73108704fc411f4d08b005d98d1f.jpg"));

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        message.setCaption("Kechki ba'zim uchun obraz : Nyud \uD83D\uDC83\uD83C\uDFFC :");

        button.setText("✅");
        button.setCallbackData("party_ok3");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("party3");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Party4(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/62/a0/7c/62a07c06b4a56ebadf5a9d75d9079480.jpg"));


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        message.setCaption("Kechki ba'zim uchun obraz : Ko'zlarga urg'u \uD83D\uDC83\uD83C\uDFFC :");

        button.setText("✅");
        button.setCallbackData("party_ok4");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("party4");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage Ok1(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Malumot sifatida ushbu uslubni tanlashni xohlaysizmi ✨? ");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("yes1");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("❌");
        button.setCallbackData("no1");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Photo(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/cc/79/93/cc79931399352816d2baaa146562520e.jpg"));
        message.setCaption("Fotosessiya uchun obraz : Mo'viy ko'zlar uslubi \uD83D\uDCF8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("photo_ok");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("photo1");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Photo1(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/e4/24/28/e4242837833933dd8942699e8ae65739.jpg"));
        message.setCaption("Fotosessiya uchun obraz : Nozik pushti uslubi \uD83D\uDCF8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("photo_ok1");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("photo2");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Photo2(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/f0/90/3c/f0903c6aef9580ab67b74e6989f2a3bc.jpg"));
        message.setCaption("Fotosessiya uchun obraz : Glamur \uD83D\uDCF8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("photo_ok2");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("photo3");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendPhoto Photo3(Long chatId) {
        SendPhoto message = new SendPhoto();
        message.setChatId(chatId);
        message.setPhoto(new InputFile("https://i.pinimg.com/736x/b6/60/95/b66095d8db0cea5f313ec673a6850819.jpg"));
        message.setCaption("Fotosessiya uchun obraz : Slavik uslubi \uD83D\uDCF8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("photo_ok3");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi obraz \uD83C\uDF80 :");
        button.setCallbackData("photo4");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage Ok3(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Malumot sifatida ushbu uslubni tanlashni xohlaysizmi ✨? ");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("yes2");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("❌");
        button.setCallbackData("no2");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;

    }

    public SendMessage Visagist(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Keling sizga mo's bo'lgan Mutahasislarni ko'rib chiqamiz ✨:\n" +
                "\n" +
                "\uD83C\uDF80 Ism : Марина\n" +
                "✨Familiya : Хамидова \n" +
                "\uD83D\uDCC8 Ish tajribasi : 10 лет \n" +
                "\uD83D\uDCCDManzil: Ц1 \n" +
                "☎\uFE0F Telefon raqam : +998 7657345 \n" +
                "\n " +
                " 'Марина' ning shu sohadagi ijodlari \uD83D\uDC47\uD83C\uDFFB :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("Mening ijodlarim \uD83C\uDF80:");
        button.setCallbackData("works1");
        row.add(button);
        keyboard.add(row);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendVideo Works(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);

        video.setVideo(new InputFile(new File("C:\\Users\\IMPART\\Desktop\\video\\3.mp4")));
        video.setCaption("Work 1 \uD83D\uDC84:");
        return video;
    }

    public SendVideo Work1(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile(new File("C:\\Users\\IMPART\\Desktop\\video\\2.mp4")));
        video.setCaption("Work 2 \uD83D\uDC84:");

        return video;
    }

    public SendVideo Work2(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile("https://v1.pinimg.com/videos/mc/720p/f2/61/54/f26154b4669a81f04b4bd1d8204079a9.mp4"));
        video.setCaption("Work 3 \uD83D\uDC84:");

        return video;
    }

    public SendVideo Work3(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile("https://v1.pinimg.com/videos/mc/expMp4/06/02/b7/0602b7cece401a1d88f9818dbee4bfe0_t1.mp4"));
        video.setCaption("Work 4 \uD83D\uDC84:");

        return video;
    }

    public SendVideo Work4(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile("https://v1.pinimg.com/videos/mc/expMp4/b1/71/2a/b1712a9602ddda6d83d5af39bfd3208f_t1.mp4"));
        video.setCaption("Work 5 \uD83D\uDC84:");

        return video;
    }

    public SendMessage VisagistText(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Pardoz artistimizning ijodlari sizga ma'qul keldimi ✨?");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("✅");
        button.setCallbackData("ha");
        row.add(button);
        keyboard.add(row);


        button = new InlineKeyboardButton();
        button.setText("Keyingi Artist \uD83C\uDF80:");
        button.setCallbackData("portfolio");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage Save(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Ajoyib! Ma'lumotlaringiz muvaffaqiyatli saqlandi ✅ ");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("Visagist bilan bog'lanish \uD83D\uDCF2 ");
        button.setCallbackData("call");
        row.add(button);
        keyboard.add(row);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        message.setReplyMarkup(inlineKeyboardMarkup);
        return message;
    }

    public SendMessage Visagist1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83C\uDF80 Ism: Fazilat \n" +
                "✨ Familiya:Muminova \n " +
                "\uD83D\uDCC8 Ish faoliyati : 2 yil \n" +
                "\uD83D\uDCCD Manzil: Tashkent City \n" +
                "☎\uFE0F Telefon raqam : +998 78637526 \n " +
                "\n " +
                "'Fazilat' ning shu sohadagi ijodlari \uD83D\uDC47\uD83C\uDFFB");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();

        button.setText("Mening ijodlarim \uD83C\uDF80:");
        button.setCallbackData("visagist1");
        row.add(button);
        keyboard.add(row);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendVideo Work5(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile(""));
        video.setCaption("Work 1 \uD83D\uDC84:");

        return video;
    }

    public SendVideo Work6(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile(""));
        video.setCaption("Work 2 \uD83D\uDC84:");

        return video;
    }

    public SendVideo Work7(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile(""));
        video.setCaption("Work 3 \uD83D\uDC84:");

        return video;
    }

    public SendVideo Work8(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile(""));
        video.setCaption("Work 4 \uD83D\uDC84:");

        return video;
    }

    public SendVideo Work9(Long chatId) {
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile(""));
        video.setCaption("Work 5 \uD83D\uDC84:");

        return video;
    }


}
