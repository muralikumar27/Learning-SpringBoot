package com.murali.basicspringsecurity.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class UserVerification {
    private static final int EXPIRY_TIME = 5;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String token;
    private Date time;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "User_id",
    referencedColumnName="id",
    nullable = false)
    private User user;

    public UserVerification(User user,String token){
        this.user=user;
        this.token=token;
        this.time=calculationOfExpiryTime(EXPIRY_TIME);
    }

    private Date calculationOfExpiryTime(int expiryTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        calendar.add(Calendar.MINUTE,expiryTime);
        return new Date(calendar.getTime().getTime());
    }
}
