package com.sparta.ow.blockbuster.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "members", schema = "blockbuster")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "member_name", length = 50)
    private String memberName;

    @Column(name = "member_DOB")
    private LocalDate memberDob;

    @Size(max = 100)
    @Column(name = "member_phone", length = 100)
    private String memberPhone;

    @Size(max = 100)
    @Column(name = "member_email", length = 100)
    private String memberEmail;

    @Size(max = 100)
    @Column(name = "member_address", length = 100)
    private String memberAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public LocalDate getMemberDob() {
        return memberDob;
    }

    public void setMemberDob(LocalDate memberDob) {
        this.memberDob = memberDob;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

}