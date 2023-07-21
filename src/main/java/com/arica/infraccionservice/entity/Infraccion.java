package com.arica.infraccionservice.entity;

import java.util.Date;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="infraccion")
public class Infraccion {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true,nullable = false, length = 8)
	private String dni;
	
	@Column(nullable = true)
	private Date fecha;
	
	@Column(nullable = false, length = 3)
	private String falta;
	
	@Column(nullable = false, length = 200)
	private String infraccion;
	
	@Column(nullable = true, length = 255)
	private String descripcion;
	
	@Column(name="activo", nullable = false)
	private Boolean activo;
}
