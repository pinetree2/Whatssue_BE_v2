package GDG.whatssue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Schedule")
public class Schedule {
    @Id
    private Long scheduleId;
    private Long clubId;
    private String scheduleName;
    private String scheduleContent;
    private LocalDate scheduleDate;
    private LocalTime scheduleTime;
    private boolean isChecked;
}
