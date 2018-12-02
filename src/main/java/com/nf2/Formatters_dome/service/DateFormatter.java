package com.nf2.Formatters_dome.service;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {
    private String datePattern;
    private SimpleDateFormat dateFormat;
    public DateFormatter(String datePattern){
        this.datePattern= datePattern;
        dateFormat = new SimpleDateFormat(datePattern);
    }
    @Override
    public Date parse(String source , Locale locale) throws ParseException {
        System.out.println("字符串转Date类型执行中。。。。");
        return dateFormat.parse(source);
    }

    @Override
    public String print(Date date, Locale locale) {
        System.out.println("字符串转Date类型中");
        return dateFormat.format(date);
    }
}
