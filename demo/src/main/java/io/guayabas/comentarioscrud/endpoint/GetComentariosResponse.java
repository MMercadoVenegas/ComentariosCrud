package io.guayabas.comentarioscrud.endpoint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetComentariosResponse {
    private List<Comentario> comentario;
}
