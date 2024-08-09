package com.sk.i2i.smsapp.formatter;

import com.sk.i2i.smsapp.model.UserInfo;

public class MessageFormatter implements IMessageFormatter {
    @Override
    public String format(UserInfo userInfo) {
        return "Değerli kullanıcımız " + userInfo.getAd() + " " + userInfo.getSoyad() + ", şu kadar dakikanız: " + userInfo.getDk() + ", şu kadar SMS'iniz: " + userInfo.getSms() + ", şu kadar internetiniz: " + userInfo.getInt() + " kalmış ayol";
    }
}
