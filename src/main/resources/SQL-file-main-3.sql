CREATE TABLE IF NOT EXISTS `imsdb2`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `imsdb2`.`items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `item_name` VARCHAR(40) DEFAULT NULL,
    `item_price` INT(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `imsdb2`.`orders` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
	customer_id int,
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `imsdb2`.`order_items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    order_id int,
    item_id int,
	FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (item_id) REFERENCES items(id),
    PRIMARY KEY (`id`)
);
