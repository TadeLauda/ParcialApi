package com.example.ApiRest.services;

import com.example.ApiRest.entites.Localidad;
import com.example.ApiRest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
   public LocalidadServiceImpl(BaseRepository<Localidad,Long>baseRepository){
       super(baseRepository);
   }
}
