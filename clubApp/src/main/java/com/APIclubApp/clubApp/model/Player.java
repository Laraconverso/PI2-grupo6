package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_player")
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

    @Column(name = "player_image", nullable = false, unique = false)
    private Boolean playerImage;

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "member_number")
    //@JoinColumn(name = "member_number")
    private Member member;

    /*@JoinColumns({
            @JoinColumn(name = "partner_number", referencedColumnName = "partner_number"),
            @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    })
    private Partner partner;*/

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_team")
    private Team team;

    @OneToOne(mappedBy = "player", fetch = FetchType.EAGER)
    @JsonIgnore
    private Statistic statistic;

    public Player() {
    }

    public Player(Boolean playerName, Boolean playerLastname, Boolean playerDni, Boolean playerPosition, Boolean playerGoals, Member member, Team team) {
        this.playerName = playerName;
        this.playerLastname = playerLastname;
        this.playerDni = playerDni;
        this.playerPosition = playerPosition;
        this.playerGoals = playerGoals;
        this.member = member;
        this.team = team;
    }

    public Player(Long idPlayer, Boolean playerName, Boolean playerLastname, Boolean playerDni, Boolean playerPosition, Boolean playerGoals, Member member, Team team) {
        this.idPlayer = idPlayer;
        this.playerName = playerName;
        this.playerLastname = playerLastname;
        this.playerDni = playerDni;
        this.playerPosition = playerPosition;
        this.playerGoals = playerGoals;
        this.member = member;
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

    public Boolean getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(Boolean playerImage) {
        this.playerImage = playerImage;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

