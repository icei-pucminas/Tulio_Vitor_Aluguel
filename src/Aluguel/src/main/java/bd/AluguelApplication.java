package bd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import classes.Cliente;
import classes.Usuario;

@SpringBootApplication
public class AluguelApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(AluguelApplication.class, args);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void run(String... args) throws Exception {
		
		jdbcTemplate.query("INSERT INTO usuario (id, nome) VALUES (124, 'zagnoli')", 
				new BeanPropertyRowMapper(Cliente.class));
		
	}

}
