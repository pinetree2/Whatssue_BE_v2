package GDG.whatssue.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Club")
public class Club {
    @Id
    private Long clubId;
    private String clubName;
    private String clubInfo;
    private String clubCategory;
    private String clubCode;
}
