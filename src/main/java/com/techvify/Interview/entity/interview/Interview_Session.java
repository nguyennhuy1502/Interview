package com.techvify.Interview.entity.interview;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Interview_Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private int interviewee_id;

    @NotBlank
    private Date created_at;

    @NotBlank
    private Date updated_at;

}
