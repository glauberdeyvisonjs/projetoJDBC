package dao;

import java.util.List;

import model.Endereco;

public interface EnderecoDAO {
	
	public void salvar(Endereco endereco);
	public void alterar(Endereco endereco);
	public void remover(Integer id);
	public Endereco pesquisar(Integer id);
	public List<Endereco> listarTodos();

}