package controller;

import java.util.List;

import dao.ContaDAO;
import dao.impl.ContaDAOimpl;
import model.Conta;

public class Principal {

	public static void main(String[] args) {
	
////      SALVAR CONTA TESTE;
//		Conta conta = new Conta();
//		conta.setNumero(6);
//		conta.setSaldo(45000.0);
//		conta.setLimite(30000.0);
//		
//		ContaDAO contaDao = new ContaDAOimpl();
//		contaDao.salvar(conta);
//		
////		ALTERAR CONTA TESTE;
//		ContaDAO contaDao1 = new ContaDAOimpl();
//		Conta contaAlterar = new Conta();
//		contaAlterar.setNumero(2);
//		contaAlterar.setSaldo(100000.0);
//		contaAlterar.setLimite(6000.0);
//		contaDao1.alterar(contaAlterar);
//		
		ContaDAO contaDAO = new ContaDAOimpl();
		
//		Conta conta1 = contaDAO.pesquisar(2);
//		System.out.println(conta1.toString());
		
		List<Conta> listaConta = contaDAO.listarTodos();
		for (Conta p : listaConta) {
			System.out.println(p.toString());
		}

	}

}
