package com.example.RESTAPI.RESTAPIDEMO.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{

}
