CREATE TABLE category_entity
(
    id   TINYINT NOT NULL,
    name VARCHAR(255) NULL,
    CONSTRAINT pk_categoryentity PRIMARY KEY (id)
);

CREATE TABLE product_entity
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    name        VARCHAR(255) NULL,
    price       DECIMAL NULL,
    category_id TINYINT NULL,
    CONSTRAINT pk_productentity PRIMARY KEY (id)
);

CREATE TABLE profile_entity
(
    id             BIGINT NOT NULL,
    bio            VARCHAR(255) NULL,
    loyalty_points INT    NOT NULL,
    CONSTRAINT pk_profileentity PRIMARY KEY (id)
);

CREATE TABLE user_entity
(
    id    BIGINT AUTO_INCREMENT NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    CONSTRAINT pk_userentity PRIMARY KEY (id)
);

CREATE TABLE wishlist
(
    product_id BIGINT NOT NULL,
    user_id    BIGINT NOT NULL,
    CONSTRAINT pk_wishlist PRIMARY KEY (product_id, user_id)
);

ALTER TABLE product_entity
    ADD CONSTRAINT FK_PRODUCTENTITY_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES category_entity (id);

ALTER TABLE profile_entity
    ADD CONSTRAINT FK_PROFILEENTITY_ON_ID FOREIGN KEY (id) REFERENCES user_entity (id);

ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_product_entity FOREIGN KEY (product_id) REFERENCES product_entity (id);

ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_user_entity FOREIGN KEY (user_id) REFERENCES user_entity (id);