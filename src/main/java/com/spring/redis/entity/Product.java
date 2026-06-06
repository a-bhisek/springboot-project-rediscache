package com.spring.redis.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name="CACHE_PRODUCT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Product implements Serializable{

	@Id
	@SequenceGenerator(name="gen1",sequenceName ="sq1",allocationSize=1,initialValue=1001)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer pid;
	@Column(length=30)
	@NonNull
	private String pname;
	@NonNull
	private String price;
}
