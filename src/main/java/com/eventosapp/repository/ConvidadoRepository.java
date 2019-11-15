package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.models.Convidado;
import com.eventoapp.models.Evento;
/****
 * Interface criada para sarvar as informacoes do  convidado
 * @author alex
 * @version 0.0.1
 */
public interface ConvidadoRepository extends CrudRepository <Convidado,String> {
	
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);

}
