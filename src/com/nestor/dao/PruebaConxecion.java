package com.nestor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nestor.conexion.ManejadorConexiones;

public class PruebaConxecion {
	private Connection c;
	private ResultSet rs;
	private PreparedStatement sentencia;
	private Statement stm;
	
	
	public void conectar(){
		this.c = ManejadorConexiones.obtenerConnection();
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		PruebaConxecion con = new PruebaConxecion();
		con.conectar();
	}
	
	
}
