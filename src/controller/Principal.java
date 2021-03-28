package controller;

import dao.ContaDAO;
import dao.impl.ContaDAOimpl;
import model.Conta;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(6);
		conta.setSaldo(45000.0);
		conta.setLimite(30000.0);
		
		ContaDAO contaDao = new ContaDAOimpl();
		contaDao.salvar(conta);

	}

}
