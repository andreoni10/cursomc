package com.example.mc.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.mc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
