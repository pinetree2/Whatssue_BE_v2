package GDG.whatssue.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ClubJoinRequest")
public class ClubJoinRequest {
    @Id
    private Long clubJoinRequestId;

    @Column(nullable = false)
    private Long clubId;

    @Column(nullable = false)
    private Long userId;
}
