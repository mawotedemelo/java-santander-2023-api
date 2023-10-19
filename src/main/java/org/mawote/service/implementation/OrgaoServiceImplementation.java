package org.mawote.service.implementation;

import org.mawote.domain.model.Orgao;
import org.mawote.domain.repository.OrgaoRepository;
import org.mawote.service.OrgaoService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class OrgaoServiceImplementation implements OrgaoService {

    private final OrgaoRepository orgaoRepository;

    public OrgaoServiceImplementation(OrgaoRepository orgaoRepository){
        this.orgaoRepository = orgaoRepository;
    }
    @Override
    public Orgao findById(Long id) {
        return orgaoRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Orgao create(Orgao orgaoToCreate) {
        if(orgaoRepository.existsById(orgaoToCreate.getId())){
            throw new IllegalArgumentException("Este ID ja existe.");
        }
        return orgaoRepository.save(orgaoToCreate);
    }
}
