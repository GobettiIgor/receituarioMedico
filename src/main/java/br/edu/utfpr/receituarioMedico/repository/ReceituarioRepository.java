package br.edu.utfpr.receituarioMedico.repository;

import br.edu.utfpr.receituarioMedico.model.Receituario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceituarioRepository extends JpaRepository<Receituario, Long> {

}
