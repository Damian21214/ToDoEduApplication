package com.sap.langer.edu.todoeduapplication.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration
{
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
}
