package GDG.whatssue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AttendanceByUser")
public class AttendanceByUser {
    @Id
    private Long id;
    private Long clubMemberId;
    private Long scheduleId;
    private String attendanceType;
}
