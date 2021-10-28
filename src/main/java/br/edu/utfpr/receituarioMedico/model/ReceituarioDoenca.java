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
public class ReceituarioDoenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "receituario_id")
    private Receituario receituario;

    @ManyToOne
    @JoinColumn(name = "doenca_id")
    private Doenca doenca;
}
