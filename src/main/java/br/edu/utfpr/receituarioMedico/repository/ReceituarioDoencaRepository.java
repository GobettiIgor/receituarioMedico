package br.edu.utfpr.receituarioMedico.repository;

import br.edu.utfpr.receituarioMedico.model.ReceituarioDoenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceituarioDoencaRepository extends JpaRepository<ReceituarioDoenca, Long> {
}
