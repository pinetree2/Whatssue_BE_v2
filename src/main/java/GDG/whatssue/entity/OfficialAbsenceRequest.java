package GDG.whatssue.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OfficialAbsentRequest")
public class OfficialAbsenceRequest {
    @Id
    private Long officialAbsenceId;

    @Column(nullable = false)
    private Long clubMemberId;

    @Column(nullable = false)
    private long scheduleId;

}
