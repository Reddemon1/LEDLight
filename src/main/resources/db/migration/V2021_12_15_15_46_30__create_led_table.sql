CREATE TABLE leds
(
    id bigint primary key auto_increment,
    status varchar(200),
    num_led bigint,
    created_at timestamp null ,
    updated_at timestamp null
);