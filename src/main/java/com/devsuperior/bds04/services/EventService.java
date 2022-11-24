package com.devsuperior.bds04.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.bds04.dto.EventDTO;
import com.devsuperior.bds04.entities.Event;
import com.devsuperior.bds04.repositories.EventRepository;

@Service
public class EventService implements Serializable {

	@Autowired
	private EventRepository repository;

	private static final long serialVersionUID = 1L;

	public Page<EventDTO> findAll(Pageable pageable) {
		Page<Event> events = repository.findAll(pageable);
		Page<EventDTO> dto = events.map(event -> new EventDTO(event));
 
		return dto;
	}

	public EventDTO insert(EventDTO dto) {
		Event city = EventDTO.toEntity(dto);
		city = repository.save(city);
		
		return new EventDTO(city);
	}
}
