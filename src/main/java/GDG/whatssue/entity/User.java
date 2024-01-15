package GDG.whatssue.entity;

import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User {
    @Id
    private Long userId;

    @Column(nullable = false)
    private String userNick;

    @Column(nullable = false)
    private String userPw;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userPhone;

}
