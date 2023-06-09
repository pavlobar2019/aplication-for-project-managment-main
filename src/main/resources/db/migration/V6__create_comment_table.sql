CREATE TABLE comment
(
    id           uuid PRIMARY KEY,
    text         VARCHAR(200) NOT NULL,
    updated_by   varchar(25) ,
    created_by   varchar(25)  NOT NULL,
    created_date DATE    NOT NULL DEFAULT now(),
    updated_date DATE,
    card_id      uuid NOT NULL ,
    FOREIGN KEY (card_id) REFERENCES card (id)
);