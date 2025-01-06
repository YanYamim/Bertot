package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.Interfaces.LancheRepository;
import com.example.Services.LancheService;

@Controller
@RequestMapping("/lanches")
@CrossOrigin(origins = "*")
public class LancheController {
   private LancheRepository lancheRepository;
   private LancheService lancheService;

   public LancheController(LancheRepository lancheRepository, LancheService lancheService) {
      this.lancheRepository = lancheRepository;
      this.lancheService = lancheService;
   }

   // @PostMapping("/cadastrar")

}
