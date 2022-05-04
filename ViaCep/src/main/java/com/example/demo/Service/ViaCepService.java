package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EnderecoTO;

@Service
public class ViaCepService {
	@Autowired
    private JavaMailSender javaMailSender;
	
	public void SendEmail(EnderecoTO en) {
		String To = "contato@integralys.com.br";
		System.out.println("Sending Email...");
		try {
	    SimpleMailMessage msg = new SimpleMailMessage();
	    msg.setFrom("brayanteste1299@gmail.com");
        msg.setTo(To);
        msg.setSubject("Enviando dados Da API Do ViaCEP");
        msg.setText(" CEP: "+en.getCep()+ " Logradouro: "+en.getLogradouro()+" Complemento: "+en.getComplemento()
        +"Bairro: "+en.getBairro()+" Localidade: "+en.getLocalidade()+" UF: "+en.getUf()+" Ibge: "+en.getIbge()+
        " Gia: "+en.getGia()+" DDD: "+en.getDdd()+" Siafi: "+en.getSiafi());
        
        javaMailSender.send(msg);
        System.out.println("Enviado!!!");
		 } catch (Exception e) {
			 e.printStackTrace();
		 
		 }
		
	}
}

