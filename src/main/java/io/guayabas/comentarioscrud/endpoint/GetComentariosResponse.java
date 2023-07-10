package io.guayabas.comentarioscrud.endpoint;

import io.guayabas.comentarioscrud.endpoint.model.Comentario;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetComentariosResponse {
    private List<Comentario> comentario;
}
