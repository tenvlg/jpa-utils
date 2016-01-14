package ru.tenvlg.utils.jpa.domain;

import java.io.Serializable;

@SuppressWarnings("unused")
public abstract class Domain<T extends Serializable> implements Serializable {

    public abstract T getId();
    public abstract void setId(T id);

    public Domain(){}

    public Domain(T id){
        setId(id);
    }
}
