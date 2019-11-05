package br.com.sgeiesp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sgeiesp.models.Evento;
import br.com.sgeiesp.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired /*Essa a notacao fará uma injeção de dependencia. Ou seja, toda vez. Toda vez que chamar a interface ela criará uma nova instancia.*/
	private EventoRepository er;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form() {
		return "formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento evento) {
		
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}

}
