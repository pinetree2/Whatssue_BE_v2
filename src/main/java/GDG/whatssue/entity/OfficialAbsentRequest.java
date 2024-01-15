package GDG.whatssue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OfficialAbsentRequest")
public class OfficialAbsentRequest {
    @Id
    private Long officialAbsent;
    private Long clubMemberId;
    private long scheduleId;

}
