package com.bai_tap.service;

import com.bai_tap.entity.MailBox;

import java.util.List;

public interface MailService {
    List<MailBox> findAll();
    MailBox findById(Integer id);
    void update(Integer id,MailBox mailBox);
    void save(MailBox mailBox);
}
