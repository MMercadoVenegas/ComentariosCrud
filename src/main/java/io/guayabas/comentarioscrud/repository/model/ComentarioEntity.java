package io.guayabas.comentarioscrud.repository.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="comentarios")
@Getter
@Setter
public class ComentarioEntity {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, lenght = 20)
    private String nickName;
    @Column(nullable = false, lenght = 20)
    private String device;
    @Column(nullable = false, lenght = 20)
    private String model;
    @Column(nullable = false, lenght = 4)
    private Number year;
    @Column(nullable = false, lenght = 3)
    private Number ram;
    @Column(nullable = false, lenght = 3)
    private Number mpx;
    @Column(nullable = false, lenght = 3)
    private Number storage;
    @Column(nullable = false, lenght = 1000)
    private String comments;
}
