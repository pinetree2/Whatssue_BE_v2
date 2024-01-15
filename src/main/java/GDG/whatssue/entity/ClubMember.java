package GDG.whatssue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ClubMember")
public class ClubMember {
    @Id
    private Long clubMemberId;
    private Long userId;
    private Long clubId;
    private Role role;
}
