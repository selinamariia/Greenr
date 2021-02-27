package com.group41.Greenr.configuration;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

	public MvcConfig() {
		super();
	}

	@Override
	public void addViewControllers(final ViewControllerRegistry registry) {
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**", "/css/**", "/resources/**", "/js/**", "/images/**").addResourceLocations(
				"classpath:/static/css/", "classpath:/static/images/", "classpath:/static/js/",
				"classpath:/resources/");
		exposeDirectory("user-photos", registry);

	}

	private void exposeDirectory(String dirName, ResourceHandlerRegistry registry) {
		Path uploadDir = Paths.get(dirName);
		String uploadPath = uploadDir.toFile().getAbsolutePath();
		if (dirName.startsWith("../"))
			dirName = dirName.replace("../", "");
		registry.addResourceHandler("/" + dirName + "/**").addResourceLocations("file:/" + uploadPath + "/");
	}
}
