package br.meli.calculadoracalorias.controllers;

import br.meli.calculadoracalorias.entities.Food;
import br.meli.calculadoracalorias.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping()
    public ResponseEntity<?> index(){
        return ResponseEntity.ok(foodService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(Integer id){
        return ResponseEntity.ok(foodService.find(id));
    }
}
