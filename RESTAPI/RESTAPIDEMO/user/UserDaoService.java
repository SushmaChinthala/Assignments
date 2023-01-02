package com.example.RESTAPI.RESTAPIDEMO.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService 
{
private static List<User> users=new ArrayList<>();
private static int usersCount=0;
static
{
	users.add(new User(++usersCount,"Sushma",LocalDate.now().minusYears(20)));
	users.add(new User(++usersCount,"Srimanya",LocalDate.now().minusYears(21)));
	users.add(new User(++usersCount,"Prathyusha",LocalDate.now().minusYears(19)));
	users.add(new User(++usersCount,"Poojitha",LocalDate.now().minusYears(18)));
			
			
}		
			public User save(User user)
{
	user.setId(++usersCount);
	users.add(user);
	return user;
}
public List<User> findAll()
{
	return users;
}
public User findOne(int id)
{
	Predicate<? super User> predicate=user->user.getId().equals(id);
	return users.stream().filter(predicate).findFirst().orElse(null);
	}
public void deleteById(int id)
{
	Predicate<? super User> predicate=user->user.getId().equals(id);
	users.removeIf(predicate);
	
	}

}



