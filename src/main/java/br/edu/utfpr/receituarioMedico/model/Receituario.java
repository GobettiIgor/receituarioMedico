package br.edu.utfpr.receituarioMedico.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Receituario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomePaciente;

    @Column
    private int diasAtestado;

    @OneToMany(mappedBy = "receituario")
    private List<ReceituarioDoenca> receituarioDoencas;
}
