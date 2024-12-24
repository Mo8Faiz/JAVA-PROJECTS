package dev.Faiz.NGO_Search_Engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("mit/ngos")

public class NgoController {
    @Autowired
    private NgoService ngoService;

    @GetMapping
    public ResponseEntity<List<ngo>> getallngos() {
        return new ResponseEntity<List<ngo>>(ngoService.allNgos(), HttpStatus.OK);
    }
}