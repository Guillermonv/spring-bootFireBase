package com.du.demo.rest;

import java.io.IOException;

import com.du.demo.model.Fight;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.web.bind.annotation.*;

import com.du.demo.error.FirebaseException;
import com.du.demo.error.JacksonUtilityException;
import com.du.demo.service.Demo;



@RestController
@RequestMapping("/api/v1")
public class FireBaseEndpoint {



	@RequestMapping(value = "/sample", method = RequestMethod.POST)
	public @ResponseBody
	void myAction(@RequestBody Fight fight)throws JsonParseException, JsonMappingException, IOException, FirebaseException, JacksonUtilityException {
	    Demo main = new Demo();
	    String [] arg = new String[2];
	    main.main(fight);
	  }


}
