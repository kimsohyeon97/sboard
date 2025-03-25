package kr.co.sboard.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class TermsDTO {

    private int no;
    private String terms;
    private String privacy;

}