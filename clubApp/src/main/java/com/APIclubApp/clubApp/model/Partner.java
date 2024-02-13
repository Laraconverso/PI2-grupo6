package com.APIclubApp.clubApp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="partners")
public class Partner extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "socio_number")
    private Long socioNumber;

    @OneToMany(mappedBy = "partner", fetch = FetchType.EAGER)
    @JsonIgnore
    //private List<Player> playersPartner;
    private Set<Player> playersPartner =new HashSet<Player>();

    @Column(name = "partner_feePaid", nullable = false, unique = false)
    private Boolean partnerFeePaid;

    @Column(name = "partner_ChangePassword", nullable = false, unique = false)
    private Boolean partner_ChangePassword;

    @Column(name = "partner_token", nullable = false, unique = false)
    private String partnerToken;

    public Partner() {
    }


    public Partner(String userName, String userLastname, String userDni, String userEmail, String userAddress, Role role, Club club, Long socioNumber, Set<Player> playersPartner, Boolean partnerFeePaid, Boolean partner_ChangePassword, String partnerToken) {
        super(userName, userLastname, userDni, userEmail, userAddress, role, club);
        this.socioNumber = socioNumber;
        this.playersPartner = playersPartner;
        this.partnerFeePaid = partnerFeePaid;
        this.partner_ChangePassword = partner_ChangePassword;
        this.partnerToken = partnerToken;
    }

    public Partner(Long idUser, String userName, String userLastname, String userDni, String userEmail, String userAddress, Role role, Club club, Long socioNumber, Set<Player> playersPartner, Boolean partnerFeePaid, Boolean partner_ChangePassword, String partnerToken) {
        super(idUser, userName, userLastname, userDni, userEmail, userAddress, role, club);
        this.socioNumber = socioNumber;
        this.playersPartner = playersPartner;
        this.partnerFeePaid = partnerFeePaid;
        this.partner_ChangePassword = partner_ChangePassword;
        this.partnerToken = partnerToken;
    }

    public Long getSocioNumber() {
        return socioNumber;
    }

    public void setSocioNumber(Long socioNumber) {
        this.socioNumber = socioNumber;
    }

    public Set<Player> getPlayersPartner() {
        return playersPartner;
    }

    public void setPlayersPartner(Set<Player> playersPartner) {
        this.playersPartner = playersPartner;
    }

    public Boolean getPartnerFeePaid() {
        return partnerFeePaid;
    }

    public void setPartnerFeePaid(Boolean partnerFeePaid) {
        this.partnerFeePaid = partnerFeePaid;
    }

    public Boolean getPartner_ChangePassword() {
        return partner_ChangePassword;
    }

    public void setPartner_ChangePassword(Boolean partner_ChangePassw) {
        this.partner_ChangePassword = partner_ChangePassword;
    }

    public String getPartnerToken() {
        return partnerToken;
    }

    public void setPartnerToken(String partnerToken) {
        this.partnerToken = partnerToken;
    }
}
