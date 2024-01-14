package GDG.whatssue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CheckList")
public class CheckList {
    @Id
    private Long id;
    private Long clubMemberId;
    private int checkCount;
    private int absentCount;
    private int officialCount;
}
