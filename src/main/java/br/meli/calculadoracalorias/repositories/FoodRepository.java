package br.meli.calculadoracalorias.repositories;

import br.meli.calculadoracalorias.entities.Food;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepository {

    private static final File FILE = new File("food.json");

    @Autowired
    private ObjectMapper mapper;

    public List<Food> findAll() {
        return getDb();
    }

    public Food findById(Integer id) {
        List<Food> foods = getDb();

        for (Food v: foods){
            if (v.getId() == 1) {
                return v;
            }
        }

        return null;
    }

    public List<Food> getDb() {
        List<Food> anuncios = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Food>> typeReference = new TypeReference<>() {};
            anuncios = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return anuncios;
    }
}
