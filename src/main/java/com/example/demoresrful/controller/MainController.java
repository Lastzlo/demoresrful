package com.example.demoresrful.controller;

import com.example.demoresrful.entity.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity main() {
        return ResponseEntity.ok("bingo");
    }

    @GetMapping("/task")
    public ResponseEntity task() {
        return ResponseEntity.ok(new Task(1l, "New Task"));
    }


}
