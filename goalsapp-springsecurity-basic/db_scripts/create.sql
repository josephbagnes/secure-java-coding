create table goal (id integer generated by default as identity, description varchar(255), target varchar(255), title varchar(25) not null, primary key (id))
create table user (id integer generated by default as identity, password varchar(255), username varchar(255), primary key (id))