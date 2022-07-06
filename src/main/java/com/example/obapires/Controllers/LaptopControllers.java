package com.example.obapires.Controllers;

import com.example.obapires.Entity.Laptop;
import com.example.obapires.Repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopControllers {

    private LaptopRepository laptopRepository;

    public LaptopControllers(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("api/laptop/{id}")
    public ResponseEntity<Laptop> findById(@PathVariable Long id){
        Optional<Laptop> laptop = this.laptopRepository.findById(id);

        if(laptop.isPresent()){
            return ResponseEntity.ok(laptop.get());
        }

       return ResponseEntity.notFound().build();
    }

    @GetMapping("api/laptops")
    public List<Laptop> findAll(){
       return this.laptopRepository.findAll();
    }

    @PostMapping("api/laptop")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        Laptop laptop1 = this.laptopRepository.save(laptop);

        if(laptop1 instanceof Laptop){
            return ResponseEntity.ok(laptop1);
        }
        return ResponseEntity.notFound().build();
    }


}
