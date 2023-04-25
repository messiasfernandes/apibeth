package br.com.bethpapp.domain.dao;
import br.com.bethpapp.domain.entidade.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DaoProuto extends JpaRepository<Produto, java.lang.Long> {

}
