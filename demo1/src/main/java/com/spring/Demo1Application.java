package com.spring;

import java.util.List;
import java.util.Optional;import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.dao.UserRepo;
import com.spring.entities.User;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		
		UserRepo beanUserRepo = context.getBean(UserRepo.class);
//		User user= new User();
//		user.setName("Mohit Yadav");
//		user.setCity("Dehli");
//		user.setStatus("I am a java programmer");
//		
//		User user1= new User();
//		user1.setName("nishu");
//		user1.setCity("Dehli");
//		user1.setStatus("I am a ruby programmer");
//		
//		List<User> users = List.of(user, user1);
//		
//		Iterable<User> itr = beanUserRepo.saveAll(users);
//		itr.forEach(x->{
//			System.out.println(x);
//		});
		
		
//		update the data
		
//		Optional<User> op = beanUserRepo.findById(2);
//		User user = op.get();
//		user.setName("John");
//		beanUserRepo.save(user);
//		
//		System.out.println(user);
		
		
//		find all
		
//		Iterable<User> findAll = beanUserRepo.findAll();
//		
//		findAll.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//				
//			}
//		});
//		
//		
		 
		Iterable<User> allusers = beanUserRepo.findAll();
		allusers.forEach(users->{
			System.out.println(users);
		});
		
//		after deleting
		
		beanUserRepo.deleteAll(allusers);
		System.out.println("deleted all users......................");
		
		
	}

}

