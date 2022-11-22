package com.codegym.repository;

import com.codegym.model.MailBox;

import java.util.List;

public interface IMailBoxRepository {
    public List<String> collectLanguage();

    public List<String>collectPage();

    public List<MailBox>collectMailBox(MailBox mailBox);
}
