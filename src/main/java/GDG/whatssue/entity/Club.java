package GDG.whatssue.entity;


import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;

@Entity
public class Club extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "club_id")
    private Long id;

    @Column(nullable = false)
    private String clubName;

    @Column(nullable = false)
    private String clubInfo;

    @Column(nullable = false)
    private String clubCategory;

    @Column(nullable = false)
    private String clubCode;

    @OneToMany(mappedBy = "club")
    private List<ClubMember> clubMemberList;

    @OneToMany(mappedBy = "club")
    private List<ClubJoinRequest> clubJoinRequestList;

    @OneToMany(mappedBy = "club")
    private List<Schedule> scheduleList;

}
