package com.example.ApiRest.services;

import com.example.ApiRest.entites.Autor;
import com.example.ApiRest.repositories.AutorRepository;
import com.example.ApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository,AutorRepository autorRepository) {
        super(baseRepository);
    }
}
