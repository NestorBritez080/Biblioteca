package com.nestor.pruebas;

import com.nestor.dao.AreaDAO;
import com.nestor.dto.AreaDTO;

public class ABMAreas {
	
	public ABMAreas(){
		AreaDTO areaDTO = new AreaDTO();
		areaDTO.setAre_codigo(15);
		areaDTO.setAre_descri("Informatica");
		areaDTO.setAre_obse("Programacion...,.");
		
		AreaDAO areaDAO = new AreaDAO();
		areaDAO.insertar(areaDTO);
		System.out.println("Procesado!");
		
		
	}
	
	public static void main(String[] args) {
		ABMAreas a = new ABMAreas();
		
	}

}
