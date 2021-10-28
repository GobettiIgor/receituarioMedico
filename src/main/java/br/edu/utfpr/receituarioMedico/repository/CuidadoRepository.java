package br.edu.utfpr.receituarioMedico.repository;

import br.edu.utfpr.receituarioMedico.model.Cuidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuidadoRepository extends JpaRepository<Cuidado, Long> {
}
