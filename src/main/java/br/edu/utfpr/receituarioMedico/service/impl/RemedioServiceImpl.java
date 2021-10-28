package br.edu.utfpr.receituarioMedico.service.impl;

import br.edu.utfpr.receituarioMedico.model.Remedio;
import br.edu.utfpr.receituarioMedico.repository.RemedioRepository;
import br.edu.utfpr.receituarioMedico.service.RemedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RemedioServiceImpl extends CrudServiceImpl<Remedio, Long> implements RemedioService {

    @Autowired
    private RemedioRepository remedioRepository;

    @Override
    protected JpaRepository<Remedio, Long> getRepository() {
        return remedioRepository;
    }
}
