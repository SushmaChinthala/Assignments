CREATE TABLE users(
username varchar(45) NOT NULL,
password varchar(45) NOT NULL,
enabled TINYINT NOT NULL DEFAULT 1,
accountNonExpired TINYINT NOT NULL DEFAULT 1,
accountNonLocked TINYINT NOT NULL DEFAULT 1,
credentialsNonExpired TINYINT NOT NULL DEFAULT 1,
primary key (username));

CREATE TABLE users_roles(
user_role_id int(11) NOT NULL AUTO_INCREMENT,
username varchar(45) NOT NULL,
role varchar(45) NOT NULL,
PRIMARY KEY (user_role_id),
UNIQUE KEY uni_username_role(role.username),
KEY fk_username_idx(username),
CONSTRAINT  fk_username FOREIGN KEY (username) references users (username));

CREATE TABLE users_attempts(
id int(11) NOT NULL AUTO_INCREMENT,
username varchar(45) NOT NULL,
attempts varchar(45) NOT NULL,
lastModified datetime,
PRIMARY KEY (id));

