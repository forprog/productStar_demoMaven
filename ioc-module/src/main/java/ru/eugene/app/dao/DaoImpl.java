package ru.eugene.app.dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {

    @Override
    public String findString() {
        return "String from DaoImpl";
    }
}
