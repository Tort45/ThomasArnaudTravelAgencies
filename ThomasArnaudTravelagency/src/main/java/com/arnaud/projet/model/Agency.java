package com.arnaud.projet.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
@RequiredArgsConstructor
@Entity
@NamedQuery(
		name="Agency.searchAllTravel",
		query="select t from Travel t where t.agency.name = :name"
	)
public class Agency {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	private String name;
	
	@OneToMany(mappedBy = "agency", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Travel> travels;


}
