package com.sap.langer.edu.todoeduapplication.restcontrolers.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NewToDoListDTO
{
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
}
