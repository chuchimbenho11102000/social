package com.chien.social.social.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SendMail {
    private String toMail;
    private String subject;
    private String body;
}
