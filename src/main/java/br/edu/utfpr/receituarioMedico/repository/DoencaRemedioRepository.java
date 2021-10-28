package br.edu.utfpr.receituarioMedico.repository;

import br.edu.utfpr.receituarioMedico.model.DoencaRemedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoencaRemedioRepository extends JpaRepository<DoencaRemedio, Long> {
}
