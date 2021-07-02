package br.meli.calculadoracalorias.services;

import br.meli.calculadoracalorias.entities.Food;
import br.meli.calculadoracalorias.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> list() {
        return foodRepository.findAll();
    }

    public Food find(@PathVariable Integer id) {
        return foodRepository.findById(id);
    }
}
