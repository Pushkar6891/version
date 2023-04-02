
package com.basant.json.parse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Description", "Region", "Countries" })
@Getter
@Setter
@ToString
@AllArgsConstructor
public class CountryResponse {

	@JsonProperty("Description")
	private String description;
	@JsonProperty("Region")
	private String region;
	@JsonProperty("Countries")
	private List<Country> countries = null;

	public CountryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
