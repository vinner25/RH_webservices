/*STATE */
create table state(state_id int  NOT NULL AUTO_INCREMENT, state_name varchar(255),PRIMARY KEY(state_id));

/*CITY */
create table city(city_id int NOT NULL AUTO_INCREMENT, city_name varchar(255),email varchar(255),state_id int,PRIMARY KEY(city_id),FOREIGN KEY(state_id) references state(state_id));

/*PICK_UP_CENTERS*/

create table pickup_centers(pickup_center_id int NOT NULL AUTO_INCREMENT,pickup_center_name varchar(255),address varchar (500),pincode varchar(25),phone varchar(20),city_id int,is_active tinyint,PRIMARY KEY(pickup_center_id),FOREIGN KEY(city_id) references city(city_id));


/*Vehicle Category Master */
create table vehicle_category(vehicle_cat_id int NOT NULL AUTO_INCREMENT,vehicle_category_name varchar(255),PRIMARY KEY(vehicle_cat_id));


/*Vehicle Details */
create table vehicle_details(vehicle_id int NOT NULL AUTO_INCREMENT,city_id int,pickup_center_id int,registration_number varchar(255),chasis_number varchar(255),color varchar(30),make varchar(30),model varchar(50),rc_number varchar(50),insurance_validity varchar(50),vehicle_cat_id int,is_active tinyint,PRIMARY KEY(vehicle_id),FOREIGN KEY(city_id) references city(city_id),FOREIGN KEY(pickup_center_id) references pickup_centers(pickup_center_id));


/*Vehicle Images */

create table vehicle_images(vehicle_image_id int  NOT NULL AUTO_INCREMENT,vehicle_id int,vehicle_image blob,is_active tinyint,PRIMARY KEY(vehicle_image_id),FOREIGN KEY(vehicle_id) REFERENCES vehicle_details(vehicle_id) );


