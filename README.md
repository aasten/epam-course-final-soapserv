# epam-course-final-soapserv


MySQL schema

after created schema 'ishop':

```SQL
CREATE TABLE `ishop`.`productEntry` (
  `idproductEntry` INT NOT NULL AUTO_INCREMENT,
  `imgURL` VARCHAR(2083) NULL,
  `rate` DECIMAL(2,1) NULL,
  PRIMARY KEY (`idproductEntry`),
  UNIQUE INDEX `idproductEntry_UNIQUE` (`idproductEntry` ASC));

CREATE TABLE `ishop`.`productSpecification` (
  `idproductSpecification` INT NOT NULL AUTO_INCREMENT,
  `productEntryId` INT NOT NULL,
  `productSpecificationName` VARCHAR(45) NOT NULL,
  `productSpecificationValue` VARCHAR(512) NOT NULL,
  PRIMARY KEY (`idproductSpecification`),
  UNIQUE INDEX `idproductCharacteristics_UNIQUE` (`idproductSpecification` ASC));

CREATE TABLE `ishop`.`productPrice` (
  `idproductPrice` INT NOT NULL AUTO_INCREMENT,
  `productEntryId` INT NOT NULL,
  `currencyCodeISO4217` CHAR(3) NOT NULL DEFAULT 'USD',
  `priceValue` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`idproductPrice`),
  UNIQUE INDEX `idproductPrice_UNIQUE` (`idproductPrice` ASC));
```
