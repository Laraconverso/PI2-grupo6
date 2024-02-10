package com.APIclubApp.clubApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_player")
    private String idPlayer;

    @Column(name = "player_name", nullable = false, unique = false)
    private Boolean playerName;

    @Column(name = "player_lastname", nullable = false, unique = false)
    private Boolean playerLastname;

    @Column(name = "player_dni", nullable = false, unique = false)
    private Boolean playerDni;

    @Column(name = "player_position", nullable = false, unique = false)
    private Boolean playerPosition;

    //faltan coloumnas

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="socio_number")
    private Partner partner;



}
