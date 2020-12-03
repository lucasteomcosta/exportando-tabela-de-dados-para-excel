package com.algaworks.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class Menu implements Serializable{

	private static final long serialVersionUID = -7951349816149385299L;
	
	public String redirecionar(int opcao) {
		
		if(opcao == 1) {
			return "/cadastrarEmpresa.xhtml";
		}
		
		return "";
	}

}
