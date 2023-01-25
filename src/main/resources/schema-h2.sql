create table Carts (
    id BIGINT AUTO_INCREMENT NOT NULL,
    item BIGINT,
    created_at datetime NOT NULL,
    updated_at datetime NOT NULL
--     PRIMARY KEY (id),
);

create table Items(
    id BIGINT AUTO_INCREMENT NOT NULL,
    name VARCHAR(500) NOT NULL,
    price FLOAT NOT NULL,
    created_at datetime NOT NULL,
    updated_at datetime NOT NULL
);

Insert into Items (id,name,price,created_at,updated_at) values (1,'new item',10000.0,now(),now())

--
-- insert into boards (title, content, updated_at, created_at) values ('Title 1', 'Content1', now(), now());
-- insert into boards (title, content, updated_at, created_at) values ('Title 2', 'Content2', now(), now());
-- insert into boards (title, content, updated_at, created_at) values ('Title 3', 'Content3', now(), now());