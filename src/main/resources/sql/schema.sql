CREATE TABLE IF NOT EXISTS COUNTRIES (
    id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
    country                   VARCHAR      NOT NULL
    );