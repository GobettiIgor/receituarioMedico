package br.edu.utfpr.receituarioMedico.service.impl;

import br.edu.utfpr.receituarioMedico.model.DoencaCuidado;
import br.edu.utfpr.receituarioMedico.repository.DoencaCuidadoRepository;
import br.edu.utfpr.receituarioMedico.service.DoencaCuidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DoencaCuidadoServiceImpl extends CrudServiceImpl<DoencaCuidado, Long> implements DoencaCuidadoService {

    @Autowired
    private DoencaCuidadoRepository doencaCuidadoRepository;

    @Override
    protected JpaRepository<DoencaCuidado, Long> getRepository() {
        return doencaCuidadoRepository;
    }
}
