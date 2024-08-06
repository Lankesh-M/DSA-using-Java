CREATE TABLE NewUsers(
    id int primary key AUTO_INCREMENT,
    email varchar(50) not null,
    bio text,
    country varchar(3)
);

--@block Creating an newuser
INSERT INTO newusers(email, bio, country)
values(
    'lankesh@gmail.com',
    'I am learning Mysql',
    'Ind'
);

--@block Adding multiple data at the same time
INSERT into newusers(email, bio, country) values 
 ('krithik@gmail.com', 'I love cats', 'IND'),
 ('praveen.wow@gmail.com', 'I am an Programmer', 'US'),
 ('habib@gmail.com', 'I am Tech Guy', 'UAE');

--@block where, select limit
SELECT * FROM newusers
-- WHERE country = 'Ind'
ORDER BY id DESC
LIMIT 6;

--@block Creat room table
CREATE TABLE Rooms(
    id INT AUTO_INCREMENT,
    street varchar(10) not null,
    owner_id int not null,
    primary key(id),
    foreign key(owner_id) references NewUsers(id)
);

--@block insert values in rooms
INSERT into rooms(owner_id, street)
values
(1, 'Manchi'),
(1, 'Dhanwar'),
(1, 'Thangalam'),
(2, 'Red Street');

--@block to join NewUsers and Rooms table
SELECT * FROM newusers INNER JOIN rooms on newusers.id = rooms.owner_id;

--@block
DROP TABLE rooms;
DROP TABLE newusers

--@block VIEW
CREATE TABLE person(
    name varchar(20) primary key,
    dob date,
    person_city varchar(20)
);

--@block
desc person;

--@block
INSERT INTO person VALUES
('abdulkalam', '1931-08-18', 'Rameshwaram'),
('maheshboobathy', '1923-02-23', 'chennai'),
('sachin', '1989-05-22', 'mumbai'),
('viswanathanand', '1931-08-31', 'Thiruchi');

--@block
INSERT into person values ('Lankesh', '2005-03-14', 'Chennai');
-- INSERT into person values ('Lankesh', '2005-03-14', 'Chennai');
--@block
INSERT into person values ('Raveena', '2001-12-1', 'Chennai');
--@block
CREATE VIEW person_age as SELECT name, datediff(sysdate(), dob)/365 as age FROM person;

--@block
-- drop table person_age;
SELECT * FROM person_age;

--@block
declare
    a integer := 10;
    b integer := 20;
    c integer;
    f real;
begin
    c := a+b;
    dbms_output.put_line(||c);
end;

