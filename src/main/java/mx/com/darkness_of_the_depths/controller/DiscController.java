package mx.com.darkness_of_the_depths.controller;

import mx.com.darkness_of_the_depths.entities.Disc;
import mx.com.darkness_of_the_depths.repository.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discs")
public class DiscController {

    @Autowired
    private DiscRepository discRepository;

    @GetMapping
    public List<Disc> getAllDisc() {
        return this.discRepository.findAll();
    }

    @GetMapping("/{id}")
    public Disc getDiscById(@PathVariable Long id) {
        Disc disc = null;
        try {
            disc = this.discRepository.findById(id);
        } catch (RuntimeException runtimeException) {
            new RuntimeException("Not find product whith Id: " + id);
        }

        return disc;
    }

    @PostMapping
    public void create(@RequestBody Disc disc) {
        this.discRepository.save(disc);
    }

    @PutMapping
    public void update(@PathVariable Long id, @RequestBody Disc product) {
        Disc disc = null;
        try {
            disc = this.discRepository.findById(id);
            disc.setName(product.getName());
            disc.setLunchDate(product.getLunchDate());
            disc.setGenre(product.getGenre());
            disc.setBand(product.getBand());
            disc.setArtist(product.getArtist());
            disc.setPrice(product.getPrice());
            disc.setUrlImage(product.getUrlImage());

            this.discRepository.save(disc);
        } catch (RuntimeException runtimeException) {
            new RuntimeException("Not find product whith Id: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        Disc disc = null;
        try {
            disc = this.discRepository.findById(id);
            try {
                this.discRepository.deleteById(id);
            } catch (Exception exception) {
                return "Error To Delete";
            }
        } catch (RuntimeException runtimeException) {
            new RuntimeException("Not find product whith Id: " + id);
        }
        return "Deleted";
    }
}
