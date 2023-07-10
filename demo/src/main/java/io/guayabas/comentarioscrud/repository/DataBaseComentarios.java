package io.guayabas.comentarioscrud.repository;

import io.guayabas.comentarioscrud.endpoint.model.Comentario;

import java.util.ArrayList;
import java.util.List;

public class DataBaseComentarios {

    public static List<Comentario> comentarios;

    private static void generateComentarioList() {
        comentarios = new ArrayList<>();

        Comentario comentarioOne = new Comentario();
        comentarioOne.setId(1);
        comentarioOne.setNickName("Guayabas");
        comentarioOne.setDevice("Xiaomi");
        comentarioOne.setModel("Mi 11 Lite 5G");
        comentarioOne.setYear(2019);
        comentarioOne.setRam(8+4);
        comentarioOne.setMpx(40);
        comentarioOne.setStorage(128);
        comentarioOne.setComments("El telefono es de muy buena calidad y ademas muy economico");
        comentarios.add(comentarioOne);
    }

    public static List<Comentario> getAllCars() {
        if (comentarios == null) {
            generateComentarioList();
        }
        return comentarios;
    }
}
