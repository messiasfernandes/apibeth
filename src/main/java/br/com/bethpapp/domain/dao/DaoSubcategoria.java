package br.com.bethpapp.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bethpapp.domain.entidade.SubCategoria;
@Repository
public interface DaoSubcategoria  extends JpaRepository<SubCategoria, Long>{

}
