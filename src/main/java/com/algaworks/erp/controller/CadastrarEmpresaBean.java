package com.algaworks.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.algaworks.erp.model.Empresa;

@ViewScoped
@Named
public class CadastrarEmpresaBean implements Serializable {

	
	private static final long serialVersionUID = -4499061200590030018L;
	
	private String nomeEmpresa;
	
	private Integer totalDeFuncionarios;
	
	private Empresa empresa;

	
	public void pesquisar() {
		// se a o nome da empresa for Fiat - 15000
		// se a o nome da empresa for Cast - 2000
		// se a o nome da empresa for Dell - 4000
		//se nao for nenhuma exibe 0
		if(nomeEmpresa.equals("Fiat")) {
			totalDeFuncionarios = 15000;
		}else
		
		if(nomeEmpresa.equals("Cast")) {
			totalDeFuncionarios = 2000;
		}else
		
		if(nomeEmpresa.equals("Dell")) {
			totalDeFuncionarios = 4000;
		}else {
			totalDeFuncionarios = 0;
		}
		
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}
	
	public Integer getTotalDeFuncionarios() {
		return totalDeFuncionarios;
	}


	public void setTotalDeFuncionarios(Integer totalDeFuncionarios) {
		this.totalDeFuncionarios = totalDeFuncionarios;
	}

	

}
