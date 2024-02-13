package com.APIclubApp.clubApp.model;

import jakarta.persistence.*;

@Entity
@Table(name="payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private Long idPayment;

    @Column(name = "amount")
    private Integer amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "member_number")
    private Member member;

    public Payment() {
    }

    public Payment(Integer amount, Member member) {
        this.amount = amount;
        this.member = member;
    }

    public Payment(Long idPayment, Integer amount, Member member) {
        this.idPayment = idPayment;
        this.amount = amount;
        this.member = member;
    }

    public Long getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Long idPayment) {
        this.idPayment = idPayment;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
