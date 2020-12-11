package br.com.pedrozanon.springbootadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email-send")
public class EmailSenderController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping
    public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("Hello from Spring Boot Application");
        message.setTo("p.hzanon123@gmail.com");
        message.setFrom("p.hzanon123@gmail.com");

        try {
            mailSender.send(message);
            return "Email Enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email";
        }
    }
}
