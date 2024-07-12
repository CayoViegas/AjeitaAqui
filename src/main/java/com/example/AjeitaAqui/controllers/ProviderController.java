package com.example.AjeitaAqui.controllers;

import com.example.AjeitaAqui.dtos.ProviderRecordDto;
import com.example.AjeitaAqui.models.Provider;
import com.example.AjeitaAqui.repositories.ProviderRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Autowired
    ProviderRepository providerRepository;

    @PostMapping("/provider")
    public ResponseEntity<Provider> registerProvider(@RequestBody @Valid ProviderRecordDto providerRecordDto) {
        var providerModel = new Provider();
        BeanUtils.copyProperties(providerRecordDto, providerModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(providerRepository.save(providerModel));
    }
}
