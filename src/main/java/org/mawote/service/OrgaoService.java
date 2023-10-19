package org.mawote.service;

import org.mawote.domain.model.Orgao;

public interface OrgaoService {

    Orgao findById(Long id);

    Orgao create(Orgao orgaoToCreate);
}
