package br.edu.utfpr.receituarioMedico.repository;

import br.edu.utfpr.receituarioMedico.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemedioRepository extends JpaRepository<Remedio, Long> {

}
