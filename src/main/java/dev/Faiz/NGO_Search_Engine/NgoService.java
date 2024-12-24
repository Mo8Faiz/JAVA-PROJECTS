package dev.Faiz.NGO_Search_Engine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NgoService {
    @Autowired
    private NgoRepository ngoRepo;

    public List<ngo> allNgos() {
        return ngoRepo.findAll();
    }
}