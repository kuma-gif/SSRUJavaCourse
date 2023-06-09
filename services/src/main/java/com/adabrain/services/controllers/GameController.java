//package com.adabrain.services.controllers;
//
//import com.adabrain.services.interfaces.GameRepository;
//import com.adabrain.services.models.Game;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/game")
//public class GameController {
//    @Autowired
//    private  final GameRepository gameRepository;
//
//    public GameController(GameRepository gameRepository) {
//        this.gameRepository = gameRepository;
//        this.gameRepository.saveAll(List.of(
//                new Game("Elden Ring", "2022", "ARPG"),
//                new Game("Diablo VI", "2023", "ARPG"),
//                new Game("BloodBorn", "2002", "ARPG")
//        ));
//    }
//
//    @GetMapping
//    Iterable<Game> getGames() {
//        return gameRepository.findAll();
//    }
//
//    @GetMapping("/game/{gameId}")
//    public Game getGameById(@PathVariable("gameId") Long id) {
//        return gameRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping("/game")
//    public Game saveGame(Game product) {
//        return gameRepository.save(product);
//    }
//
//    @DeleteMapping("/game/{gameId}")
//    public void deleteGame(@PathVariable("gameId") Long id) {
//        gameRepository.deleteById(id);
//    }
//}
