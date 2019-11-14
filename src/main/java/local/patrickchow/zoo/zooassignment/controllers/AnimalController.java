package local.patrickchow.zoo.zooassignment.controllers;

import local.patrickchow.zoo.zooassignment.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    ZooService service;

    @GetMapping(value = "/count")
    public ResponseEntity<?> getCount() {
        return new ResponseEntity<>(service.animalCount(), HttpStatus.OK);
    }
}