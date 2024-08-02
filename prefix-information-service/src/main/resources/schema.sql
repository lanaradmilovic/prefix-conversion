CREATE TABLE prefixes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    symbol VARCHAR(5),
    amount DECIMAL(40, 10),
    decimalEquivalent VARCHAR(50),
    shortScale VARCHAR(50)
);

