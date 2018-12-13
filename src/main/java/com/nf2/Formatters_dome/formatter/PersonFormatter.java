package com.nf2.Formatters_dome.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PersonFormatter implements Formatter<Person> {
    @Override
    public Person parse(String text, Locale locale) throws ParseException {
        // "370784191111111111"
        return new Person(parseProvinceFromId(text) , parseBirthFromId(text), parseGenderFromId(text));
    }

    @Override
    public String print(Person object, Locale locale) {
        return null;
    }

    private String parseProvinceFromId(String id) {
        return provinceMapping.get(id.substring(0, 2));
    }

    private String parseBirthFromId(String id) throws ParseException {
        return String.valueOf(new SimpleDateFormat("yyyyMMdd").parse(id.substring(6, 14)));
    }

    private String parseGenderFromId(String id) {
        // 17: 偶数 女，奇数 男
        return id.charAt(16) % 2 == 0 ? "女" : "男";
    }

    private static Map<String, String> provinceMapping;

    static {
        provinceMapping = new HashMap<>();
        provinceMapping.put("44", "广东");
        provinceMapping.put("45", "广西");
        provinceMapping.put("36", "江西");
        provinceMapping.put("37", "山东");
    }
}
