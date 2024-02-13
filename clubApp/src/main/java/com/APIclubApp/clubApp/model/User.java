package com.APIclubApp.clubApp.model;

import jakarta.persistence.*;

@MappedSuperclass
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Table(name="users")
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name= "user_name", nullable = false, unique = false)
    private String userName;

    @Column(name = "user_lastname", nullable = false, unique = false)
    private String userLastname;

    @Column(name = "user_dni", nullable = false, unique = false)
    private String userDni;

    @Column(name = "user_email", nullable = false, unique = false)
    private String userEmail;

    @Column(name = "user_address", nullable = false, unique = false)
    private String userAddress;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_role")
    private Role role;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_club")
    private Club club;

    public User() {
    }

    public User(String userName, String userLastname, String userDni, String userEmail, String userAddress, Role role, Club club) {
        this.userName = userName;
        this.userLastname = userLastname;
        this.userDni = userDni;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.role = role;
        this.club = club;
    }

    public User(Long idUser, String userName, String userLastname, String userDni, String userEmail, String userAddress, Role role, Club club) {
        this.idUser = idUser;
        this.userName = userName;
        this.userLastname = userLastname;
        this.userDni = userDni;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.role = role;
        this.club = club;
    }

    public User(String userDni) {

        this.userDni = userDni;

    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserDni() {
        return userDni;
    }

    public void setUserDni(String userDni) {
        this.userDni = userDni;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
