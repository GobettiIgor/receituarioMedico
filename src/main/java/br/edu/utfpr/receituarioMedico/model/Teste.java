package br.edu.utfpr.receituarioMedico.model;

import br.edu.utfpr.receituarioMedico.service.DoencaService;
import br.edu.utfpr.receituarioMedico.service.ReceituarioDoencaService;
import br.edu.utfpr.receituarioMedico.service.ReceituarioService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Teste {
    @Autowired
    ReceituarioService receituarioService;

    @Autowired
    ReceituarioDoencaService receituarioDoencaService;

    @Autowired
    DoencaService doencaService;

    public void gerarTeste(String nomePaciente, String doenca, int diasAtestado){
        List<Doenca> doencas = doencaService.findDoencaByNome(doenca);
        Doenca doencaRes = new Doenca();
        doencaRes = (Doenca) doencas.get(0);

        if(doenca.equals("Doenca 1")){


            System.out.println(doencas);
        }
        else if(doenca.equals("Doenca 2")){

        }
        else if(doenca.equals("Doenca 3")){

        }
        else{

        }
    }
}
