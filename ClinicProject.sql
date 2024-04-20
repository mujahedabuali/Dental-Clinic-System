
-- Create a Clinic DataBase
create database clinicProject;
use clinicProject;

-- Create adminstrator table
create table adminstrator (

id int auto_increment primary key,
adminName varChar(30) not null,
adminPass varchar(30) not null,
adminEmail varChar(30) not null,
adminPhone varChar(30) not null,
adminPhoto BLOB not null
);
-- Create patients table
create table patients (
patientId int not null auto_increment,
patientName varChar(30) not null,
patientAge int not null,
patientPhone varChar(15) not null,
patientEmail varChar(30) not null,
primary key (patientId)
);

-- Create appointments table
create table appointments (
appointId int not null auto_increment,
patientId int not null,
dentistId int not null,
patientName varChar(30) not null,
dentistname varChar(30) not null,
appointDate varchar(10) not null,
appointStart varChar(10) not null,
appointEnd varChar(10) not null,
treatment varChar(50) not null,
primary key (appointId),
Foreign key (patientId) references patients (patientId) ON DELETE CASCADE ON UPDATE CASCADE,
Foreign key (dentistId) references dentists (dentistId) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Create dentists table
create table dentists (
dentistId int not null auto_increment,
dentistName varChar(30) not null,
dentistPhone varChar(15) not null,
dentistEmail varChar(30) not null,
dentistAge int not null,
dentistSex varChar(10) not null,
dentistAddress varchar(40) not null,
dentistGradguate varChar(20) not null,
dentistExp int not null,
userName varChar(30) not null,
pass varChar(30) not null,
primary key (dentistId)
);

-- Create payments table
create table payments (
paymentId int not null auto_increment,
patientId int not null, 
PatientName varChar(20) not null,
paymentMethod varChar(30) not null,
paymentAmount varChar(30) not null,
paymentDate varChar(10),
treatment varchar(30),
isPaid  varChar(10),
primary key (paymentId),
foreign key (patientId) references patients (patientId) on delete cascade on update cascade
);
-- Create prescription table
CREATE TABLE prescription (
  id INT NOT NULL AUTO_INCREMENT, -- A unique identifier for each prescription
  date DATE NOT NULL, -- The date of the prescription
  name VARCHAR(20) NOT NULL, -- The category of the prescription, such as antibiotic, painkiller, etc.
  patient_id INT NOT NULL, -- The id of the patient who received the prescription
  doctor_id INT NOT NULL, -- The id of the doctor who issued the prescription
  patient_name VARCHAR(20) NOT NULL,
  doctor_name VARCHAR(20) NOT NULL,
  PRIMARY KEY (id), -- The primary key of the table is the id column
  FOREIGN KEY (doctor_id) REFERENCES dentists(dentistId) -- The doctor_id column references the id column of the doctor table
);

-- Create DoctorPatient table
CREATE TABLE DoctorPatient (
  dentists_id int NOT NULL,
  patient_id int NOT NULL,
  PRIMARY KEY (dentists_id,patient_id),
  FOREIGN KEY (dentists_id) REFERENCES dentists (dentistId),
  FOREIGN KEY (patient_id) REFERENCES patients (patientId)
);



