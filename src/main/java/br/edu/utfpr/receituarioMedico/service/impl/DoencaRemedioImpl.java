package br.edu.utfpr.receituarioMedico.service.impl;

import br.edu.utfpr.receituarioMedico.model.DoencaRemedio;
import br.edu.utfpr.receituarioMedico.repository.DoencaRemedioRepository;
import br.edu.utfpr.receituarioMedico.service.DoencaRemedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DoencaRemedioImpl extends CrudServiceImpl<DoencaRemedio, Long> implements DoencaRemedioService {
    @Autowired
    private DoencaRemedioRepository doencaRemedioRepository;

    @Override
    protected JpaRepository<DoencaRemedio, Long> getRepository() {
        return doencaRemedioRepository;
    }
}
