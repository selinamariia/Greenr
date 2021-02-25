//package com.group41.Greenr.model;
//
//	import java.io.File;
//	import java.io.IOException;
//import java.security.Principal;
//
//import javax.mail.MessagingException;
//	import javax.mail.internet.AddressException;
//	import javax.mail.internet.MimeMessage;
//
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.boot.SpringApplication;
//	import org.springframework.boot.autoconfigure.SpringBootApplication;
//	import org.springframework.core.io.ClassPathResource;
//	import org.springframework.core.io.FileSystemResource;
//	import org.springframework.mail.SimpleMailMessage;
//	import org.springframework.mail.javamail.JavaMailSender;
//	import org.springframework.mail.javamail.MimeMessageHelper;
//	import org.springframework.web.bind.annotation.RequestMapping;
//	import org.springframework.web.bind.annotation.RestController;
//
//	public class EmailApplication  
//	{
//		
//		@Autowired
//	    private JavaMailSender javaMailSender;
//
//		public void sendEmail(String email, String sub, String text) 
//		{
//
//	        SimpleMailMessage mail = new SimpleMailMessage();
//	        mail.setTo(email);
//	        mail.setSubject(sub);
//	        mail.setText(text);
//
//	        javaMailSender.send(mail);
//	    }
//		
//		public static String getUserEmail(Principal principal)
//		{
//			String email = principal.getName();
//			return email;
//		}
//	}
