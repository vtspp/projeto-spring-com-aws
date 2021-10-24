package com.vtspp.resources;

import com.vtspp.domain.Pessoa;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@Log4j2
public class TestController {

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        log.info("Test Controller - name: {}", name);
        return ResponseEntity.ok(name);
    }

    @PostMapping("/pessoa")
    public ResponseEntity<Pessoa> getAllNames (@RequestBody Pessoa pessoa) {
        log.info("Retornou o objeto {}", pessoa.toString());
        return ResponseEntity.ok(pessoa);
    }
}
