package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.EnderecoTO;
import com.example.demo.Repository.EnderecoTORepository;


@RestController 
public class EnderecoTOController {


	@Autowired
	private EnderecoTORepository enderecoTOR;

	  @GetMapping("/getCep/{cep}")
	  public ResponseEntity<EnderecoTO> doObterCep(@PathVariable(name = "cep") String cep) {
		  RestTemplate restTemplate = new RestTemplate();
		  String uri = "http://viacep.com.br/ws/{cep}/json/";
		  
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("cep", cep);

	    EnderecoTO enderecoTO = restTemplate.getForObject(uri, EnderecoTO.class, params);
	    enderecoTOR.save(enderecoTO);
	    return new ResponseEntity<EnderecoTO>(enderecoTO, HttpStatus.OK);
	  }
	  

}
