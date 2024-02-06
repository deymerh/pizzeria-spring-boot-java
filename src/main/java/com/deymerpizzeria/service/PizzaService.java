package com.deymerpizzeria.service;

import com.deymerpizzeria.persistence.entity.PizzaEntity;
import com.deymerpizzeria.persistence.repository.PizzaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    //private final JdbcTemplate jdbcTemplate;
    private final PizzaRepository pizzaRepository;
    public PizzaService(JdbcTemplate jdbcTemplate, PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
        //this.jdbcTemplate = jdbcTemplate;
    }

    public List<PizzaEntity> getAll(){
        // return this.jdbcTemplate.query("SELECT * FROM pizza WHERE available = 0", new BeanPropertyRowMapper<>(PizzaEntity.class));
        return this.pizzaRepository.findAll();
    }

    public PizzaEntity get(int idPizza){
        return pizzaRepository.findById(idPizza).orElse(null);
    }

    public PizzaEntity save(PizzaEntity pizza){
        return pizzaRepository.save(pizza);
    };

    public boolean exists(int idPizza){
        return pizzaRepository.existsById(idPizza);
    };
}
