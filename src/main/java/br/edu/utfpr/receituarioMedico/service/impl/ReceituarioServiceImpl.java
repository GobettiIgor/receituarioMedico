package br.edu.utfpr.receituarioMedico.service.impl;

import br.edu.utfpr.receituarioMedico.model.Receituario;
import br.edu.utfpr.receituarioMedico.repository.ReceituarioRepository;
import br.edu.utfpr.receituarioMedico.service.ReceituarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReceituarioServiceImpl extends CrudServiceImpl<Receituario, Long> implements ReceituarioService {

    @Autowired
    private ReceituarioRepository receituarioRepository;

    @Override
    protected JpaRepository<Receituario, Long> getRepository() {
        return receituarioRepository;
    }
}
