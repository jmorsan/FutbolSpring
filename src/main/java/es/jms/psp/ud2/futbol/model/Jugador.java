/*********************************************************************************************************************************
 This class has been automatically generated using KLTT-APIRestGenerator project, don't do manual file modifications.
 Sun Nov 27 12:18:49 CET 2022

 "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements;
  and to You under the Apache License, Version 2.0. "
**********************************************************************************************************************************/

package es.jms.psp.ud2.futbol.model;

/** 
 * Class - Numeros
 */
public final class Jugador
{
	/** value is not set in definition */
	private String nombre ;
	/** value is not set in definition */
	private Integer dorsal ;
	/** value is not set in definition */
	private Integer goles ;
	/** value is not set in definition */
	private Integer tarjetas ;

	/**
	 * Empty constructor for the class
	 */
	public Jugador()
	{
		// Empty constructor
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public Integer getDorsal()
	{
		return this.dorsal;
	}

	public void setDorsal(Integer dorsal)
	{
		this.dorsal = dorsal;
	}

	public Integer getGoles()
	{
		return this.goles;
	}

	public void setGoles(Integer goles)
	{
		this.goles = goles;
	}

	public Integer getTarjetas()
	{
		return this.tarjetas;
	}

	public void setTarjetas(Integer tarjetas)
	{
		this.tarjetas = tarjetas;
	}

	@Override
	public String toString()
	{
		return "Jugador{" +
				"nombre='" + nombre + '\'' +
				", dorsal=" + dorsal +
				", goles=" + goles +
				", tarjetas=" + tarjetas +
				'}';
	}
}
