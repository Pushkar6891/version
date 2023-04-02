package com.bharath.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countryAndLangs=" + countryAndLangs + "]";
	}

}
