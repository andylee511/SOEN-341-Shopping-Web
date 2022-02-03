CREATE DATABASE shoppingweb;
CREATE TABLE customer(
    id integer NOT NULL,
    username VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(150)

);

CREATE TABLE item(
    id integer NOT NULL,
    price double precision NOT NULL,
    brand VARCHAR(70),
    description VARCHAR(5000),
    rate double precision,
    review VARCHAR(5000),
    in_stock_status boolean NOT NULL

);

CREATE TABLE shopping_cart(
    id integer NOT NULL,
    name VARCHAR(50),
    price double precision NOT NULL,
    brand VARCHAR(70)

);
