DROP TABLE IF EXISTS prefix;

CREATE TABLE prefix (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    symbol VARCHAR(5),
    amount DECIMAL(40, 10),
    decimal_equivalent VARCHAR(50),
    short_scale VARCHAR(50)
);

