package br.edu.utfpr.receituarioMedico.repository;

import br.edu.utfpr.receituarioMedico.model.Doenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoencaRepository extends JpaRepository<Doenca, Long> {
    List<Doenca> findDoencaByNome(String nome);
}
