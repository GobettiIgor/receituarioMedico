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
public class DoencaRemedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doenca_id")
    private Doenca doenca;

    @ManyToOne
    @JoinColumn(name = "remedio_id")
    private Remedio remedio;
}
