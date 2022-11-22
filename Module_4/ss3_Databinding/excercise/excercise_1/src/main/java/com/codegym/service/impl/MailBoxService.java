package com.codegym.service.impl;

import com.codegym.model.MailBox;
import com.codegym.repository.IMailBoxRepository;
import com.codegym.service.IMailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailBoxService implements IMailBoxService {
    @Autowired
    private IMailBoxRepository iMailBoxRepository;

    @Override
    public List<String> collectLanguage() {
        return iMailBoxRepository.collectLanguage();
    }

    @Override
    public List<String> collectPage() {
        return iMailBoxRepository.collectPage();
    }

    @Override
    public List<MailBox> save(MailBox mailBox) {
        return iMailBoxRepository.collectMailBox(mailBox);
    }
}
