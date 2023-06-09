package br.com.bethpapp.domain.entidade;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Produto  extends GeradorId{

	
	private static final long serialVersionUID = 1L;
	
	@Setter(value = AccessLevel.NONE)
	@NotEmpty
	@Column(length = 120)
	private String nomeproduto;
	@Setter(value = AccessLevel.NONE)
	@Column(length = 60)
	private String marca;
	@Column(length = 3)
	private String unidade;
	@Column(length = 255)
	private String imagemPrincipal;
	@Column(length = 60)
	private String sku;

	@Column(length = 13)
	private String codigoEan13;
	@Column(length = 255)
	private String caracteristica;
	@Column(length = 13)
	private String codigofabricante;
	@Digits(integer = 9, fraction = 3)
	private BigDecimal precovenda;
	@Digits(integer = 9, fraction = 3)
	private BigDecimal precocusto;
	@Digits(integer = 9, fraction = 3)
	private BigDecimal customedio;
	@JsonIgnoreProperties(value = {  "nomeSubCategoria" }, allowGetters = true)

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private SubCategoria subcategoria;
	
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "produto_atributo", joinColumns = @JoinColumn(name = "produto_id"))
	private List<Atributo> atributos;

}
