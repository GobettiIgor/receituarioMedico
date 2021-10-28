package br.edu.utfpr.receituarioMedico.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class DoencaCuidado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doenca_id")
    private Doenca doenca;

    @ManyToOne
    @JoinColumn(name = "cuidado_id")
    private Cuidado cuidado;
}
