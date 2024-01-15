package GDG.whatssue.entity;

import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User {
    @Id
    private Long userId;
    private String userNick;
    private String userPw;
    private String userEmail;
    private String userName;
    private String userPhone;

}
