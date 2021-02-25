//package com.group41.Greenr.web;
//
//import java.io.IOException;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.AddressException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.group41.Greenr.model.EmailApplication;
//@RestController
//public class EmailController {
//	
//	@Autowired
//	EmailApplication sendingEmailApplication;
//
//	@RequestMapping(value = "/sendemail")
//	public static String send() throws AddressException, MessagingException, IOException {
//	   //sendEmail();
//		EmailApplication.sendEmail();
//	   return "Email sent successfully";   
//	}
//}