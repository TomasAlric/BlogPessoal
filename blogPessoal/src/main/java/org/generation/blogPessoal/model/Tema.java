package org.generation.blogPessoal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "tb_tema")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String descricao;

    @OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("tema")
    private List<Postagem> postagem;
}
