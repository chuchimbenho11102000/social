package com.chien.social.social.controller;

import com.chien.social.social.dto.SendMail;
import com.chien.social.social.service.MailSenderTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testMailSendController {

    @Autowired
    private MailSenderTest mailSenderTest;

    @GetMapping("/test")
    public void sendMail(@ModelAttribute SendMail sendMail){
        mailSenderTest.sendMail(sendMail.getToMail(), sendMail.getSubject(),sendMail.getBody());
    }
}
