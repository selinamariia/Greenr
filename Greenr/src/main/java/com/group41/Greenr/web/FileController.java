package com.group41.Greenr.web;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.group41.Greenr.model.User;
import com.group41.Greenr.repository.UserRepo;

@Controller
public class FileController {

	@Autowired
	private UserRepo userRepo;

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file, HttpSession session) throws Exception {

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		if (fileName.contains("..")) {
			throw new Exception("Sorry! Filename contains invalid path sequence " + fileName);
		}

		User user = (User) session.getAttribute("user");
		String extension = fileName.substring(fileName.indexOf('.'));
		fileName = user.getId() + extension;
		try {
			user.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		userRepo.save(user);
		return "redirect:/profile";
	}

}
