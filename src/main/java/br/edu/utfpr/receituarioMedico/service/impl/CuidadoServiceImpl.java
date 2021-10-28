package br.edu.utfpr.receituarioMedico.service.impl;

import br.edu.utfpr.receituarioMedico.model.Cuidado;
import br.edu.utfpr.receituarioMedico.repository.CuidadoRepository;
import br.edu.utfpr.receituarioMedico.service.CuidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CuidadoServiceImpl extends CrudServiceImpl<Cuidado, Long> implements CuidadoService {

    @Autowired
    private CuidadoRepository cuidadoRepository;

    @Override
    protected JpaRepository<Cuidado, Long> getRepository() {
        return cuidadoRepository;
    }
}
