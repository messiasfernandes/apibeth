package br.com.bethpapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bethpapp.domain.dao.DaoSubcategoria;
import br.com.bethpapp.domain.entidade.SubCategoria;

@RequestMapping("/subcategorias")
@RestController
public class SubCategoriaController {

	@Autowired
	private DaoSubcategoria daoSubcategoria;

	@GetMapping
	public ResponseEntity<List<SubCategoria>> listar() {

		return ResponseEntity.status(HttpStatus.OK).body(daoSubcategoria.findAll());

	}
}
