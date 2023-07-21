package com.arica.infraccionservice.converter;

import org.springframework.stereotype.Component;

import com.arica.infraccionservice.dto.InfraccionDTO;
import com.arica.infraccionservice.entity.Infraccion;

@Component
public class InfraccionConverter extends AbstractConverter<Infraccion, InfraccionDTO> {

	@Override
	public InfraccionDTO fromEntity(Infraccion entity) {
		if (entity==null) return null;
		return InfraccionDTO.builder()
				.id(entity.getId())
				.dni(entity.getDni())
				.fecha(entity.getFecha())
				.falta(entity.getFalta())
				.infraccion(entity.getInfraccion())
				.descripcion(entity.getDescripcion())
				.activo(entity.getActivo())
				.build();
	}
	@Override
	public Infraccion fromDTO(InfraccionDTO dto) {
		if (dto==null) return null;
		return Infraccion.builder()
				.id(dto.getId())
				.dni(dto.getDni())
				.fecha(dto.getFecha())
				.falta(dto.getFalta())
				.infraccion(dto.getInfraccion())
				.descripcion(dto.getDescripcion())
				.activo(dto.getActivo())
				.build();
	}

}
