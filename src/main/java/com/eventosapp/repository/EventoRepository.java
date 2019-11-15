package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.models.Evento;

/****
 * Interface criada para extender a class Crud * @author alex
 * @version 0.0.1
 */
public interface EventoRepository extends CrudRepository<Evento,String> {
	Evento findByCodigo(long codigo);

}
