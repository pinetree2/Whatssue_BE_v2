package GDG.whatssue.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Club")
public class Club {
    @Id
    private Long clubId;

    @Column(nullable = false)
    private String clubName;

    @Column(nullable = false)
    private String clubInfo;

    @Column(nullable = false)
    private String clubCategory;

    @Column(nullable = false)
    private String clubCode;
}
