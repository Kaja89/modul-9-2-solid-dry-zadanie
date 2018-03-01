package com.kodilla.modul92zadanie.good.patterns.challenges;

public class MailService implements InformationService {
    public void sendMessage(User user) {
        System.out.println("Sending message to " + user);
    }
}
