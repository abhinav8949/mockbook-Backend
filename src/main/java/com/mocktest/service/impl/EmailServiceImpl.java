package com.mocktest.service.impl;

import com.mocktest.model.contact.Contact;
import com.mocktest.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String sender;

    @Override
    public boolean recivedUserEmail(Contact contact) {
        boolean isSent=false;
        try {
            SimpleMailMessage mailMessage=new SimpleMailMessage();

            mailMessage.setTo(sender);
            mailMessage.setReplyTo(contact.getEmail());
            mailMessage.setSubject("New message from: "+contact.getName());
            mailMessage.setText("Hey! MockBook-Team, You got a new message from."+
                    "\nName: "+contact.getName()+
                    "\nEmail: " + contact.getEmail()+
                    "\nMobile: "+ contact.getMobile()+
                    "\nSubject: "+contact.getSubject()+
                    "\n\nMessage: "+contact.getMessage()+
                    "\n\nThanks."
            );
            javaMailSender.send(mailMessage);
            isSent=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return isSent;
    }

}
