package ru.tenvlg.utils.jpa.domain;

@SuppressWarnings("unused")
public abstract class SimpleDomain extends Domain<Integer> {

    public SimpleDomain(){
        super();
    }

    public SimpleDomain(Integer id){
        super(id);
    }

    @Override
    public abstract Integer getId();

    @Override
    public abstract void setId(Integer id);
}
