package br.com.api.awesome.endPoint;

import br.com.api.awesome.Entity.Object;
import br.com.api.awesome.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("object")
public class ObjectEndPoint {
    @Autowired
    private ObjectService objectService;

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(objectService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(objectService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> newObject(@RequestBody Object object) {
        return new ResponseEntity<>(objectService.saveObject(object), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Object object) {
        objectService.delete(object);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Object object) {
        return new ResponseEntity<>(objectService.updateObject(object), HttpStatus.OK);
    }


}
