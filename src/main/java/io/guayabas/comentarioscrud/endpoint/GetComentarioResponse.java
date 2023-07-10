package io.guayabas.comentarioscrud.endpoint;

import io.guayabas.comentarioscrud.endpoint.model.Comentario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetComentarioResponse {
    private Comentario comentario;
}
