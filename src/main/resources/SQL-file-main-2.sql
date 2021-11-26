CREATE TABLE IF NOT EXISTS `imsdatabase`.`customers` (
    `customer_id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`customers_id`)
);
CREATE TABLE IF NOT EXISTS `imsdb2`.`items` (
    `item_id` INT(11) NOT NULL AUTO_INCREMENT,
    `item_name` VARCHAR(40) DEFAULT NULL,
    `item_price` INT(40) DEFAULT NULL,
    PRIMARY KEY (`items_id`)
);
CREATE TABLE IF NOT EXISTS `imsdb2`.`orders` (
    `order_id` INT(11) NOT NULL AUTO_INCREMENT,
	FOREIGN KEY (customer_id) REFERENCES imsdatabase(customers),
    PRIMARY KEY (`order_id`)
);
CREATE TABLE IF NOT EXISTS `imsdb2`.`order_items` (
    `order_itemsid` INT(11) NOT NULL AUTO_INCREMENT,
	FOREIGN KEY (order_id) REFERENCES imsdatabase(orders),
    FOREIGN KEY (item_id) REFERENCES imsdatabase(items),
    PRIMARY KEY (`order_itemsid`)
);
