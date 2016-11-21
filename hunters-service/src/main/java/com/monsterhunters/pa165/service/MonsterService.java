package com.monsterhunters.pa165.service;

import com.monsterhunters.pa165.entity.Location;
import com.monsterhunters.pa165.entity.Monster;
import java.util.List;

/**
 *
 * @author Miroslava Voglova
 */
public interface MonsterService {
    
    void createMonster(Monster m);
    
    void deleteMonster(Monster m);
    
    void updateMonster(Monster m);
    
    Monster findById(Long id);
    
    List<Monster> findAll();
    
    void addType();
    
    void removeType();
    
    void relocateMonster(Location newLocation);    
}
