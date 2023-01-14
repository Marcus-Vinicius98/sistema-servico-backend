package com.api.backend.configs;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ModelMapperConfig {

	public ModelMapper mapper() {
		return new ModelMapper();
	}

}
