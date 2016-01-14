package ru.tenvlg.utils.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

@Converter(autoApply = true)
@SuppressWarnings("unused")
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate,Date> {

  @Override
  public Date convertToDatabaseColumn(LocalDate entityValue) {
    return entityValue==null ? null : Date.valueOf(entityValue);
  }

  @Override
  public LocalDate convertToEntityAttribute(Date databaseValue) {
    return databaseValue==null ? null : databaseValue.toLocalDate();
  }

}
