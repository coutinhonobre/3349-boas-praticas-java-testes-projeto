package br.com.alura.adopet.api.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class FakeEmailService implements EmailService {
    @Override
    public void enviarEmail(String destino, String assunto, String corpo) {
        System.out.println("Email enviado com sucesso!");
        System.out.println("Para: " + destino);
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + corpo);
    }
}
