package com.bai_tap.service;

import com.bai_tap.entity.MailBox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
@Service
public class MailServiceImpl implements MailService {
    private static Map<Integer,MailBox> mailMap;
    static {
        mailMap = new TreeMap<>();
        mailMap.put(1,new MailBox(1,"English",5,true,"kingOfSolo"));
        mailMap.put(2,new MailBox(2,"Vietnamese",10,false,"kingOfGo"));
        mailMap.put(3,new MailBox(3,"Japanese",1,true,"kingOfFly"));
    }
    @Override
    public List<MailBox> findAll() {

        return new ArrayList<>(mailMap.values());
    }

    @Override
    public MailBox findById(Integer id) {
        return mailMap.get(id);
    }

    @Override
    public void update(Integer id, MailBox mailBox) {
        mailMap.replace(id,mailBox);
    }

    @Override
    public void save(MailBox mailBox) {

    }
}
