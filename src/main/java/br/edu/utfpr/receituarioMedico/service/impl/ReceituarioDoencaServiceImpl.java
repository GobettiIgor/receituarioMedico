package br.edu.utfpr.receituarioMedico.service.impl;

import br.edu.utfpr.receituarioMedico.model.ReceituarioDoenca;
import br.edu.utfpr.receituarioMedico.repository.ReceituarioDoencaRepository;
import br.edu.utfpr.receituarioMedico.service.ReceituarioDoencaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReceituarioDoencaServiceImpl extends CrudServiceImpl<ReceituarioDoenca, Long> implements ReceituarioDoencaService {

    @Autowired
    private ReceituarioDoencaRepository receituarioDoencaRepository;

    @Override
    protected JpaRepository<ReceituarioDoenca, Long> getRepository() {
        return receituarioDoencaRepository;
    }
}
