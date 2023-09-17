package ru.khamzin.entity;

import lombok.*;
import ru.khamzin.entity.enums.BuyerStatus;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Buyer {

    private Long id;
    private String firstname;
    private String lastname;
    private BuyerStatus status;

}
