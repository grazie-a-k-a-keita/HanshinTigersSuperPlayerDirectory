package com.consallink.HanshinTigersSuperPlayerDirectory;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/").setViewName("index");
		registry.addViewController("/allplayer").setViewName("reference");
		registry.addViewController("/commentList").setViewName("commentList");
		registry.addViewController("/comment/edit").setViewName("edit");
	}
}