package dao;

import model.Pessoa;

import java.util.List;

public interface PessoaDAO {
	
	public void salvar(Pessoa pessoa);
	public void alterar(Pessoa pessoa);
	public void remover(String cpf);
	public Pessoa pesquisar (String cpf);
	public List<Pessoa> listarTodos();
	
}
