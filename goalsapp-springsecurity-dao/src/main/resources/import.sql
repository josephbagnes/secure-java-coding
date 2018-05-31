insert into goal(title,target,description) values('First Application','end of day','Build my first application');

--insert into user(username,password) values('user','p');

INSERT INTO ROLE(code,name) VALUES('ROLE_ADMIN','ADMIN');
INSERT INTO ROLE(code,name) VALUES('ROLE_USER','USER');

INSERT INTO USER(username,password,active) VALUES('admin','$2a$11$qU9layCac8f5JMtt90ENNOCpjV1dmZrWQpodeqqoSA5dXDQTLIJtS',1);
INSERT INTO USER(username,password,active) VALUES('user','$2a$11$BrIBtokAQs9d0GHuV6k89OYefwwIpN4VhxE6WmDSWTrlWlgTz5Aiy',1);

INSERT INTO USER_ROLES(user_id,roles_id) VALUES(1,1);
INSERT INTO USER_ROLES(user_id,roles_id) VALUES(2,2);