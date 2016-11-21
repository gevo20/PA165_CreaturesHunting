package com.monsterhunters.pa165.facade;

import com.monsterhunters.pa165.dto.MonsterCreateDTO;
import com.monsterhunters.pa165.dto.MonsterDTO;
import java.util.List;

/**
 *
 * @author Miroslava Voglova
 */
public interface MonsterFacade {
    
    Long createMonster(MonsterCreateDTO m);
    
    void deleteMonster(Long monsterId);
    
    MonsterDTO getMonsterById(Long monsterId);
    
    List<MonsterDTO> getAllMonsters();
}
