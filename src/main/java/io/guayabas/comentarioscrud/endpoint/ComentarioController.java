package io.guayabas.comentarioscrud.endpoint;

import io.guayabas.comentarioscrud.endpoint.model.Comentario;
import io.guayabas.comentarioscrud.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

     @GetMapping("/comentarios")
    public ResponseEntity<GetComentariosResponse> get() {
         GetComentariosResponse response = new GetComentariosResponse();
         response.setComentarios(comentarioService.getAllComentarios());
         return ResponseEntity.ok(response);
     }

    @GetMapping("comentarios/{id}")
    public ResponseEntity<GetComentarioResponse> get(@PathVariable int id) {
         Comentario foundComentario = comentarioService.findComentarioById(id);
         if (foundComentario != null) {
             GetComentarioResponse response = new GetComentarioResponse();
             response.setComentario(foundComentario);
             return ResponseEntity.ok(response);
         } else {
             return ResponseEntity.notFound().build();
         }
    }

    @DeleteMapping("/comentarios/{id}")
    public ResponseEntity<GetComentarioResponse> delete(@PathVariable int id) {
         Comentario deleteComentario = comentarioService.deleteComentarioById(id);
         if (deleteComentario != null) {
             GetComentarioResponse response = new GetComentarioResponse();
             response.setComentario(deleteComentario);
             return ResponseEntity.ok(response);
         } else {
             return ResponseEntity.notFound().build();
         }
    }

    @PostMapping("/comentarios")
    public ResponseEntity<GetComentarioResponse> post(@RequestBody Comentario aComentario){
         boolean added = comentarioService.addComentario(aComentario);
         if (added){
             return ResponseEntity.satatus(HttpStatus.CREATED).build();
         } else {
             return ResponseEntity.badRequest().build();
         }
    }

    @PutMapping("/comentarios/{id}")
    public ResponseEntity<GetComentarioResponse> put(@PathVariable("id") int id, @RequestBody Comentario aComentario){
         Comentario update = comentarioService.updateComentarioById(id, aComentario);
         if (update != null) {
             GetComentarioResponse response = new GetComentarioResponse();
             response.setComentario(update);
             return ResponseEntity.ok(response);
         } else {
             return ResponseEntity.badRequest().build();
         }
    }

}

















































