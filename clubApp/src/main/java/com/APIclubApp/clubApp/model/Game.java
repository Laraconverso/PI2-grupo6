package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name="games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_game")
    private Long idGame;

    @Column(name = "game_day", nullable = false, unique = false)
    private String gameDay;

    @Column(name = "game_address", nullable = false, unique = false)
    private String gameAddress;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_category")
    private Category category;

    //varios equipos
    /*@ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "game_has_team", joinColumns = @JoinColumn(name = "id_game"), inverseJoinColumns = @JoinColumn(name = "id_team"))
    private List<Team> gameTeams;*/

    //solo un equipo por partido
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_team")
    private Team team;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_calendar")
    private Calendar calendar;

    public Game() {
    }

    public Game(String gameDay, Category category, Team team) {
        this.gameDay = gameDay;
        this.category = category;
        this.team = team;
    }

    public Game(Long idGame, String gameDay, Category category, Team team) {
        this.idGame = idGame;
        this.gameDay = gameDay;
        this.category = category;
        this.team = team;
    }

    public Long getIdGame() {
        return idGame;
    }

    public void setIdGame(Long idGame) {
        this.idGame = idGame;
    }

    public String getGameDay() {
        return gameDay;
    }

    public void setGameDay(String gameDay) {
        this.gameDay = gameDay;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
