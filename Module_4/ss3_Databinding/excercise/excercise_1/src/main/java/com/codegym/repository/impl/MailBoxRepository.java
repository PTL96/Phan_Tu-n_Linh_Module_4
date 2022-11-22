package com.codegym.repository.impl;

import com.codegym.model.MailBox;
import com.codegym.repository.IMailBoxRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailBoxRepository implements IMailBoxRepository {
    private static final List<MailBox> mailList = new ArrayList<>();
    private static final List<String> languageList = new ArrayList<>();
    private static final List<String> pageList = new ArrayList<>();

    static {
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
    }

    static {
        pageList.add("5");
        pageList.add("10");
        pageList.add("15");
        pageList.add("25");
        pageList.add("50");
        pageList.add("100");
    }

    @Override
    public List<String> collectLanguage() {
        return languageList;
    }

    @Override
    public List<String> collectPage() {
        return pageList;
    }

    @Override
    public List<MailBox> collectMailBox(MailBox mailBox) {
        mailList.add(mailBox);
        return mailList;
    }
}
