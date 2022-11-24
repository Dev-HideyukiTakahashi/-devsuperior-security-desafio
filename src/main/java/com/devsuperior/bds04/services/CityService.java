package com.devsuperior.bds04.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devsuperior.bds04.dto.CityDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.repositories.CityRepository;

@Service
public class CityService implements Serializable {

	@Autowired
	private CityRepository repository;

	private static final long serialVersionUID = 1L;

	public List<CityDTO> findAll() {
		List<City> cities = repository.findAll(Sort.by("name"));
		List<CityDTO> dto = cities.stream()
								  .map(city -> new CityDTO(city))
								  .toList();
 
		return dto;
	}

	public CityDTO insert(CityDTO dto) {
		City city = CityDTO.toEntity(dto);
		city = repository.save(city);
		
		return new CityDTO(city);
	}
}
