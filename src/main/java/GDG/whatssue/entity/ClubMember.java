package GDG.whatssue.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ClubMember")
public class ClubMember {
    @Id
    private Long clubMemberId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long clubId;

    @Column(nullable = false)
    private Role role;
}
