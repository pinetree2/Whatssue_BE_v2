package GDG.whatssue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ClubJoinRequest")
public class ClubJoinRequest {
    @Id
    private Long clubJoinRequestId;
    private Long clubId;
    private Long userId;
}
