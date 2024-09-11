package com.example.Lanches;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lanches")
@CrossOrigin(origins = "*")
public class LancheController {
    private List<Lanche> lanches = new ArrayList<>();

    public LancheController() {
        lanches.addAll(List.of(
                new Lanche("Cachorro quente"),
                new Lanche("Batata frita"),
                new Lanche("Hambúrguer"),
                new Lanche("Água")
        ));
    }

    @GetMapping(produces = "text/html")
    @ResponseBody
    public String getLanches() {
        StringBuilder html = new StringBuilder("<ul>");
        lanches.forEach(lanche -> html.append("<li>")
                .append(lanche.getId()).append(": ")
                .append(lanche.getNome()).append("</li>"));
        html.append("</ul>");
        return html.toString();
    }

    @PostMapping(consumes = "application/json", produces = "text/html")
    @ResponseBody
    public String postLanche(@RequestBody Lanche newLanche) {
        lanches.add(newLanche);
        return getLanches();
    }

    @PutMapping("/{id}")
    @ResponseBody
    public String putLanche(@PathVariable String id, @RequestBody Lanche updatedLanche) {
        lanches.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .ifPresent(lanche -> lanche.setNome(updatedLanche.getNome()));
        return getLanches();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteLanche(@PathVariable String id) {
        lanches.removeIf(l -> l.getId().equals(id));
        return getLanches();
    }
}
