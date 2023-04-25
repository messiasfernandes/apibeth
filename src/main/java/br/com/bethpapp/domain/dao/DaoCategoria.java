package br.com.bethpapp.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bethpapp.domain.entidade.Categoria;


@Repository
public interface DaoCategoria extends JpaRepository <Categoria, Long> {

}
