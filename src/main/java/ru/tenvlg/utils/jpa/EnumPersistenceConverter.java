package ru.tenvlg.utils.jpa;

import javax.persistence.AttributeConverter;

@SuppressWarnings("unused")
public abstract class EnumPersistenceConverter<T extends IEnumEntity> implements AttributeConverter<T, Integer> {
    @Override
    public Integer convertToDatabaseColumn(T attribute) {
        return attribute.getId();
    }

    @Override
    public abstract T convertToEntityAttribute(Integer dbData);
}
