CREATE DATABASE IF NOT EXISTS cardekho;

USE cardekho;

CREATE TABLE vehicle (
vehicle_id int AUTO_INCREMENT PRIMARY KEY,
make varchar(20),
model varchar(20),
engine_in_cc decimal(7,2),
fuel_capacity decimal(5,2),
milage decimal(4,2),
road_tax int,
price int
);

CREATE TABLE car (
car_id int AUTO_INCREMENT PRIMARY KEY,
vehicle_id int ,
ac bool,
power_steering bool,
accessory_kit bool,
create_date timestamp,
update_date timestamp,
FOREIGN KEY (vehicle_id) REFERENCES vehicle(vehicle_id)
);

INSERT INTO vehicle (make,model,engine_in_cc,fuel_capacity,milage,road_tax,price) VALUES('Maruti','Wagon-R',514.0,19.0,6.0,8803,352145);

SELECT * FROM vehicle;

SELECT * FROM car;

SELECT MAX(vehicle_ID) FROM vehicle;

SELECT v.make,v.model,v.engine_in_cc,v.fuel_capacity,v.milage,v.road_tax,v.price,c.ac,c.power_steering,
c.accessory_kit FROM vehicle v,car c WHERE v.price BETWEEN 100 AND 960000;