package com.amlan.rentCar.comtroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping(path = "getGreet")
	public Map<String, Object> getGreet(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "Pampa from get method");
		map.put("hobby", "Stole my heart every day");
		map.put("relation", "get method");
		return map;
		
	}
	@PostMapping(path = "getGreet")
	public Map<String, Object> postGreet(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "Pampa from post method");
		map.put("hobby", "Stole my heart every day");
		map.put("relation", "post method");
		return map;
		
	}

}
