package br.com.unyleya.avaliacao.rest;

import java.util.List;

import br.com.unyleya.avaliacao.rest.dao.EmpresaDAO;
import br.com.unyleya.avaliacao.rest.entidade.Empresa;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/empresas")
@Produces(MediaType.APPLICATION_JSON + ";charset-utf-8")
public class EmpresaService {
	
	
	private EmpresaDAO empresaDAO;
	
	@PostConstruct
	private void init() {
		empresaDAO = new EmpresaDAO();
	}
	
	@GET
	@Path("/list")
	public List<Empresa> listarEmpresas(){
		List<Empresa> lista = null;
		try {
			lista = empresaDAO.listarEmpresas();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
