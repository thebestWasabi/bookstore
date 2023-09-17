package ru.khamzin.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.khamzin.entity.enums.BookGenre;
import ru.khamzin.entity.enums.BookStatus;

@Getter
@Setter
@Builder
@ToString
public class Book {

    private Long id;
    private String title;
    private String author;
    private float price;
    private BookGenre genre;
    private BookStatus status;

}
