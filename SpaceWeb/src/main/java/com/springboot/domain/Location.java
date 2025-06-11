package com.springboot.domain;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class Location {
	private int id;
	private String name;
	private BigDecimal latitude;
	private BigDecimal longitude;

}
