package br.com.unyleya.avaliacao.rest;

import java.util.HashMap;
import java.util.Map;

import jakarta.ws.rs.core.Application;

public class MyApplication extends Application{
	
	public Map<String, Object> getProperties(){
		Map<String, Object> properties = new HashMap<>();
		
		properties.put("jersey.config.server.provider.packages", "br.com.unyleya.avaliacao.rest");
		return properties;
	}

}
