package br.edu.utfpr.receituarioMedico.service.impl;

import br.edu.utfpr.receituarioMedico.model.Doenca;
import br.edu.utfpr.receituarioMedico.repository.DoencaRepository;
import br.edu.utfpr.receituarioMedico.service.DoencaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoencaServiceImpl extends CrudServiceImpl<Doenca, Long> implements DoencaService {

    @Autowired
    private DoencaRepository doencaRepository;

    @Override
    protected JpaRepository<Doenca, Long> getRepository() {
        return doencaRepository;
    }

    @Override
    public List<Doenca> findDoencaByNome(String nome) {
        return doencaRepository.findDoencaByNome(nome);
    }
}
