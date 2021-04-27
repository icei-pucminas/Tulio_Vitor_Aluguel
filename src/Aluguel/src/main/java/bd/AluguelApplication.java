package bd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import classes.Cliente;
import classes.Contrato;
import classes.Pedido;
import classes.Usuario;

@SpringBootApplication
public class AluguelApplication {

	@Autowired
	public static JdbcTemplate jdbc;
	public Pedido ped;
	public Contrato con;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		
		List<Pedido> listpedido = ped.list();
		model.addAttribute("listpedido", listpedido);
 		
		return "index";
		
	}
	
	
	@RequestMapping("/new")
	public String showNewForm(Model model) {
		Pedido pedido = new Pedido();
		model.addAttribute("pedido", pedido);
		
		return "new_form";
	}

	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("pedido") Pedido pedido) {
		Pedido.addPedido(pedido.getNome(), pedido.getDescricao(), pedido.getIdUsuario(), pedido.getMatriculaAutomovel());
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditForm(@PathVariable(name = "ïd") int id) {
		ModelAndView mav = new ModelAndView("edit_form");
		Pedido pedido = Pedido.readPedido(id);
		mav.addObject("pedido", pedido);
		
		return mav;
		
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("pedido") Pedido pedido) {
		Pedido.updatePedido(pedido.getId(), pedido.getNome(), pedido.getDescricao(), pedido.getIdUsuario(), pedido.getMatriculaAutomovel());
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(name = "ïd") int id) {
		Pedido.deletePedido(id);
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/C")
	public String showNewFormC(Model model) {
		
		List<Contrato> listcontrato = con.list();
		model.addAttribute("listcontrato", listcontrato);
	
		return "indexC";
	}
	
	@RequestMapping("/newC")
	public String showNewCForm(Model model) {
		Contrato contrato = new Contrato();
		model.addAttribute("contrato", contrato);
		
		return "newC_form";
	}

	@RequestMapping(value = "/saveC", method = RequestMethod.POST)
	public String save(@ModelAttribute("contrato") Contrato contrato) {
		Contrato.addContrato(contrato);
		return "redirect:/C";
	}
	
	
	
}
