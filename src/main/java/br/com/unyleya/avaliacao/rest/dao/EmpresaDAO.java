package br.com.unyleya.avaliacao.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.unyleya.avaliacao.rest.config.DBConfig;
import br.com.unyleya.avaliacao.rest.entidade.Empresa;

public class EmpresaDAO {
	
	public List<Empresa> listarEmpresas() throws Exception {
		List<Empresa> lista = new ArrayList<>();
		Connection conexao = DBConfig.getConnection();
		
		String sql = "SELECT * FROM unyleya_avaliacao";
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			Empresa empresa = new Empresa();
			empresa.setId(0);
			empresa.setNome(rs.getString("NOME"));
			empresa.setEndereco(rs.getString("ENDERECO"));
			lista.add(empresa);
		}
		return lista;
	}
	
}
