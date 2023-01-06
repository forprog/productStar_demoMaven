package ru.eugene.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.eugene.app.dao.IDao;

@Component
public class ServiceImpl implements IService {

    private IDao dao;

    @Autowired
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    //    public ServiceImpl(IDao dao) {
//        this.dao = dao;
//    }

    @Override
    public String interactWithDaoString() {
        String s = dao.findString();
        return s+" Hello from ServiceImpl";
    }
}
