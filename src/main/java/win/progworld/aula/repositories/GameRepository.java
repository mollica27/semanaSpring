package win.progworld.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import win.progworld.aula.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    
}
    

