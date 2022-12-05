package com.stackti.server.Answear;

import com.stackti.server.User.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answear {
    private long answear_id;
    private long question_id;
    private User author;
    private String body;
    private int score;
    private Timestamp answearCreatedAt;
    private Timestamp answearUpdatedAt;
}
