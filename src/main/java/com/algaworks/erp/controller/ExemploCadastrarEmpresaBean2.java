package com.algaworks.erp.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.algaworks.erp.model.Empresa;


@ViewScoped
@Named
public class ExemploCadastrarEmpresaBean2 implements Serializable {

	
	private static final long serialVersionUID = -1213214548422260331L;

	private String nomeFantasia;
	
	private List<Empresa> empresas;
	
	public void adicionar() {
		
		if(empresas == null) {
			empresas = new ArrayList<Empresa>();
		}
		
		Empresa e = new Empresa();
		e.setNomeFantasia(nomeFantasia);
		empresas.add(e);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

}
