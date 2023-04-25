package br.com.bethpapp.coverter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import br.com.bethpapp.domain.entidade.Categoria;
import br.com.bethpapp.model.dto.CategoriaDTO;
import br.com.bethpapp.model.input.CategoriaInput;

@Component
public class CategoriaConverter {

	@Autowired
	private ModelMapper modelMapper;

	public CategoriaDTO toDto(Categoria objeto) {

		return modelMapper.map(objeto, CategoriaDTO.class);
	}
     public Categoria toEntity(CategoriaInput objeto) {
		
		return modelMapper.map(objeto, Categoria.class);
	}

	public Page<CategoriaDTO> topage(Page<Categoria> objetos) {

		return objetos.map(obj -> toDto(obj));
	}
	public List<CategoriaDTO> toCollectionDto(List<Categoria> categorias) {
		return categorias.stream().map(this::toDto).collect(Collectors.toList());
	}
}
