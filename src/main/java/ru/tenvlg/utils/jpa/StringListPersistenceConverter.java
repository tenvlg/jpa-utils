package ru.tenvlg.utils.jpa;

import org.apache.commons.lang.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
@SuppressWarnings("unused")
public class StringListPersistenceConverter implements AttributeConverter<String[], String> {

    @Override
    public String convertToDatabaseColumn(String[] strings) {
        if (strings == null || strings.length==0) {
            return "";
        }
        return StringUtils.join(strings, ",");
    }

    @Override
    public String[] convertToEntityAttribute(String s) {
        if (s == null || s.trim().length() == 0) {
            return new String[0];
        }
        return s.split(",");
    }

}
