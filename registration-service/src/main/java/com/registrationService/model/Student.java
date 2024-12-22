package com.registrationService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString //@AllArgsConstructor @NoArgsConstructor
@Document("students")
@Data
@Getter
@Setter
public class Student {
	
	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("current_address")
	private String currentAddress;

	@JsonProperty("current_address_pin")
	private Integer currentAddressPin;

	@JsonProperty("permanent_address")
	private String permanentAddress;

	@JsonProperty("permanent_address_pin")
	private Integer permanentAddressPin;

	@JsonProperty("date_of_birth")
	private String dateOfBirth;

	@JsonProperty("father_name")
	private String fatherName;

	@JsonProperty("mother_name")
	private String motherName;

	@JsonProperty("phone_number")
	private Long phoneNumber;
	
	@JsonProperty("standard")
	private Integer standard;

}
