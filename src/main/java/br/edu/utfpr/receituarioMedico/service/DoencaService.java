package br.edu.utfpr.receituarioMedico.service;

import br.edu.utfpr.receituarioMedico.model.Doenca;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DoencaService extends CrudService<Doenca, Long> {
    List<Doenca> findDoencaByNome(String nome);
}
