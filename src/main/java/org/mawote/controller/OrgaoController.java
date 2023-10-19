package org.mawote.controller;

import org.mawote.domain.model.Orgao;
import org.mawote.service.OrgaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/orgaos")
public class OrgaoController {

    private final OrgaoService orgaoService;

    public OrgaoController(OrgaoService orgaoService){
        this.orgaoService = orgaoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orgao> findById(@PathVariable Long id){
        var orgao = orgaoService.findById(id);
        return ResponseEntity.ok(orgao);
    }

    @PostMapping
    public ResponseEntity<Orgao> create(@RequestBody Orgao orgaoToCreate){
        var orgaoCreated = orgaoService.create(orgaoToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(orgaoCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(orgaoCreated);
    }
}
