INSERT INTO users(username,password,enabled)
values('user','pass',true);
INSERT INTO users (username,password.enabled)
values('admin','pass',true);



INSERT INTO users_roles(username,role)
values('user','ROLE_USER');
INSERT INTO users_roles(username,authority)
values('admin','ROLE_ADMIN');
