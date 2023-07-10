package io.guayabas.comentarioscrud.endpoint.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comentario {
    private int id;
    private String nickName;
    private String device;
    private String model;
    private Number year;
    private Number ram;
    private Number mpx;
    private Number storage;
    private String comments;


}
