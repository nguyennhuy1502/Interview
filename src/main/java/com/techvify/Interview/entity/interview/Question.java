package com.techvify.Interview.entity.interview;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private int levelId;

    @NotBlank
    private int programmingLanguageId;

    @NotBlank
    private boolean question_type;

    @ManyToOne
    @JoinColumn(name = "FW_id")
    private Framework frameworkID;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "interview_session_question",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "interview_session_id"))
    private List<Interview_Session> interview_sessions;

    @NotBlank
    private Date created_at;

    @NotBlank
    private Date updated_at;

}
