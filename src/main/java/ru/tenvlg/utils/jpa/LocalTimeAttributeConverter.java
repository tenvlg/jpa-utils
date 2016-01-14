package ru.tenvlg.utils.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Time;
import java.time.LocalTime;

@Converter(autoApply = true)
@SuppressWarnings("unused")
public class LocalTimeAttributeConverter implements AttributeConverter<LocalTime, Time> {

  @Override
  public Time convertToDatabaseColumn(LocalTime entityValue) {
    return entityValue==null ? null : Time.valueOf(entityValue);
  }

  @Override
  public LocalTime convertToEntityAttribute(Time databaseValue) {
    return databaseValue==null ? null : databaseValue.toLocalTime();
  }

}
