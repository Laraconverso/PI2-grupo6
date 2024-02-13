package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_player")
    private Long idPlayer;

    @Column(name = "player_name", nullable = false, unique = false)
    private Boolean playerName;

    @Column(name = "player_lastname", nullable = false, unique = false)
    private Boolean playerLastname;

    @Column(name = "player_dni", nullable = false, unique = false)
    private Boolean playerDni;

    @Column(name = "player_position", nullable = false, unique = false)
    private Boolean playerPosition;

    @Column(name = "player_goals", nullable = false, unique = false)
    private Boolean playerGoals;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="socio_number")
    private Partner partner;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_team")
    private Team team;

    public Player() {
    }

    public Player(Long idPlayer, Boolean playerName, Boolean playerLastname, Boolean playerDni, Boolean playerPosition, Boolean playerGoals, Partner partner, Team team) {
        this.idPlayer = idPlayer;
        this.playerName = playerName;
        this.playerLastname = playerLastname;
        this.playerDni = playerDni;
        this.playerPosition = playerPosition;
        this.playerGoals = playerGoals;
        this.partner = partner;
        this.team = team;
    }

    public Long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Boolean getPlayerName() {
        return playerName;
    }

    public void setPlayerName(Boolean playerName) {
        this.playerName = playerName;
    }

    public Boolean getPlayerLastname() {
        return playerLastname;
    }

    public void setPlayerLastname(Boolean playerLastname) {
        this.playerLastname = playerLastname;
    }

    public Boolean getPlayerDni() {
        return playerDni;
    }

    public void setPlayerDni(Boolean playerDni) {
        this.playerDni = playerDni;
    }

    public Boolean getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(Boolean playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Boolean getPlayerGoals() {
        return playerGoals;
    }

    public void setPlayerGoals(Boolean playerGoals) {
        this.playerGoals = playerGoals;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
