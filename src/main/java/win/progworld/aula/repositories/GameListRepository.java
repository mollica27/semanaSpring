package win.progworld.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import win.progworld.aula.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    
}
    

