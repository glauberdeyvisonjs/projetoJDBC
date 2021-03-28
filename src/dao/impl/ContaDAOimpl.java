package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.ContaDAO;
import model.Conta;
import model.util.Conexao;

public class ContaDAOimpl implements ContaDAO {
	
	Conexao conexao = new Conexao();

	@Override
	public void salvar(Conta conta) {
		Connection conn = conexao.getConnection();
		
		String sql = "INSERT INTO CONTA(NUMERO, SALDO, LIMITE) " + "VALUES(?, ?, ?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getNumero());
			ps.setDouble(3, conta.getLimite());
			ps.setDouble(2, conta.getSaldo());
			ps.execute();
			System.out.println("Conta inserida com sucesso!");
			
		} catch (SQLException e) {
			System.out.println("Erro ao inserir conta no banco: " + e.getMessage());
			
		} finally {}
		conexao.fecharConexao(conn);		
	}

	@Override
	public void alterar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conta pesquisar(int numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conta> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
