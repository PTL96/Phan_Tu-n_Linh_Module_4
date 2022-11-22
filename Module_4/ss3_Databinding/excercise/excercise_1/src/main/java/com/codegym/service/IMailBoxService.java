package com.codegym.service;

import com.codegym.model.MailBox;

import java.util.List;

public interface IMailBoxService {
    public List<String> collectLanguage();

    public List<String>collectPage();
    public List<MailBox> save(MailBox mailBox);
}
