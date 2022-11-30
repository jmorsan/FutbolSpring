/*********************************************************************************************************************************
 This class has been automatically generated using KLTT-APIRestGenerator project, don't do manual file modifications.
 Sun Nov 27 12:18:50 CET 2022

 "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements;
  and to You under the Apache License, Version 2.0. "
**********************************************************************************************************************************/

package es.jms.psp.ud2.futbol.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import es.jms.psp.ud2.futbol.exception.JugadorError;
import es.jms.psp.ud2.futbol.model.Jugador;

/**
 * ------------------------------------------------
 * @author API Rest Generator
 * ------------------------------------------------
 */
@RequestMapping(value = "/Jugadores", produces = {"application/json"})
@RestController
@Component
@Service
public final class RestHandlerJugador
{
	/**
	 * Public constructor
	 */
    public RestHandlerJugador()
    {
	    // Empty constructor because of Spring dependency
    }
	//PathVariable -> parametros del Path -> Los relacionamos directamente con las variables
	//No se puede cambiar el nombre de PathVariable pero si el de la variable.
	@RequestMapping(method = RequestMethod.GET, value = "/Jugador/Acciones/{numeroDorsal}"	)
	public ResponseEntity<?> buscarJugador(@PathVariable(value="dorsal") final Integer dorsal)
	{
		try
		{
			//List<Jugador>listaJugadores = crearLista();
			List<Jugador>listaJugadores = new ArrayList<Jugador>();

			Jugador jugador1 = new Jugador();
			jugador1.setDorsal(12);
			jugador1.setGoles(3);
			jugador1.setNombre("David Tyson");

			Jugador jugador2 = new Jugador();
			jugador2.setDorsal(69);
			jugador2.setGoles(9);
			jugador2.setNombre("Neil Ramires");

			listaJugadores.add(jugador1);
			listaJugadores.add(jugador2);

			//Jugador jugadorDorsal = null;

			for(Jugador jugador : listaJugadores)
			{

				if(jugador.getDorsal().equals(dorsal))
				{

					return ResponseEntity.ok().body(jugador.toString()) ;

				}
			}

			throw new JugadorError(404, "Jugador con dorsal: " + dorsal + "no existe");

		}
		catch (JugadorError jugadorError)
		{
			return ResponseEntity.status(400).body(jugadorError.getBodyExceptionMessage()) ;
		}
	}

	/**
	public List<Jugador> crearLista()
	{


		return listaJugadores;
	}
	 **/
	

}
