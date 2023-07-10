package io.guayabas.comentarioscrud.service;

import io.guayabas.comentarioscrud.endpoint.model.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.guayabas.comentarioscrud.repository.ComentarioRespository;
import io.guayabas.comentarioscrud.repository.model.ComentarioEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.util.ClassUtils.isPresent;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRespository comentarioRespository;

    public List<Comentario> getAllComentarios(){
        List<Comentario> finalComentarios = new ArrayList<>();
        List<ComentarioEntity> comentarios = (List<ComentarioEntity>)comentarioRespository.findAll();
        for(ComentarioEntity entity: comentarios){
            Comentario comentario = new Comentario();
            comentario.setId(entity.getId());
            comentario.setNickName(entity.getNickName());
            comentario.setDevice(entity.getDevice());
            comentario.setModel(entity.getModel());
            comentario.setYear(entity.getYear());
            comentario.setRam(entity.getRam());
            comentario.setMpx(entity.getMpx());
            comentario.setStorage(entity.getStorage());
            comentario.setComments(entity.getComments());
            finalComentarios.add(comentario);
        }
        return finalComentarios;
    }
    public Comentario findComentarioById(int id){
        Optional<ComentarioEntity> foundComentario.isPresent();
        boolean isFound = foundComentario.isPresent();
        if(isFound) {
            ComentarioEntity dbComentario = foundComentario.get();
            Comentario comentario = new Comentario();
            comentario.setNickName(dbComentario.getNickName());
            comentario.setDevice(dbComentario.getDevice());
            comentario.setModel(dbComentario.getModel());
            comentario.setYear(dbComentario.getYear());
            comentario.setRam(dbComentario.getRam());
            comentario.setMpx(dbComentario.getMpx());
            comentario.setStorage(dbComentario.getStorage());
            comentario.setComments(dbComentario.getComments());
            return comentario;
        }
        return null;
    }

    public Comentario deleteComentarioById(int id) {
        Optional<ComentarioEntity> foundComentario = comentarioRespository.findById(id);
        boolean isFound = foundComentario.isPresent();
        if(isFound){
            ComentarioEntity dbComentario = foundComentario.get();
            Comentario comentario = new Comentario();
            comentario.setNickName(dbComentario.getNickName());
            comentario.setDevice(dbComentario.getDevice());
            comentario.setModel(dbComentario.getModel());
            comentario.setYear(dbComentario.getYear());
            comentario.setRam(dbComentario.getRam());
            comentario.setMpx(dbComentario.getMpx());
            comentario.setStorage(dbComentario.getStorage());
            comentario.setComments(dbComentario.getComments());
            comentarioRespository.delete(dbComentario);
            return comentario;
        }
        return null;
    }

    public boolean addComentario(Comentario aComentario) {
        ComentarioEntity newComentario = new ComentarioEntity();
        newComentario.setNickName(aComentario.getNickName());
        newComentario.setDevice(aComentario.getDevice());
        newComentario.setModel(aComentario.getModel());
        newComentario.setYear(aComentario.getYear());
        newComentario.setRam(aComentario.getRam());
        newComentario.setMpx(aComentario.getMpx());
        newComentario.setStorage(aComentario.getStorage());
        newComentario.setComments(aComentario.getComments());
        comentarioRespository.save(newComentario);
        return true;
    }

    public Comentario updateComentarioById(int id, Comentario aComentario) {
        Optional<ComentarioEntity> foundComentario = comentarioRespository.findById(id);
        boolean isFound = foundComentario.isPresent();
        if(isFound){
            ComentarioEntity comentario = foundComentario.get();
            comentario.setNickName(aComentario.getNickName());
            comentario.setDevice(aComentario.getDevice());
            comentario.setModel(aComentario.getModel());
            comentario.setYear(aComentario.getYear());
            comentario.setRam(aComentario.getRam());
            comentario.setMpx(aComentario.getMpx());
            comentario.setStorage(aComentario.getStorage());
            comentario.setComments(aComentario.getComments());
            comentarioRespository.save(comentario);
            return aComentario;
        }
        return null;
    }
}
