package com.btg.pactual.fpv_fondos.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.btg.pactual.fpv_fondos.model.ApiResponse;
import com.btg.pactual.fpv_fondos.model.Fondo;
import com.btg.pactual.fpv_fondos.services.FondoService;
import com.btg.pactual.fpv_fondos.tools.Constants;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/fondos")
@RequiredArgsConstructor
@CrossOrigin(origins = Constants.URL)
public class FondoController {
    
    private final FondoService fondoService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Fondo>>> listarFondos() {
        List<Fondo> fondos = fondoService.listarFondos();
        
        ApiResponse<List<Fondo>> response = new ApiResponse<>(
            HttpStatus.OK.value(), Constants.FONDOS, 
            fondos
        );
        
        return ResponseEntity.ok(response);
    }
}