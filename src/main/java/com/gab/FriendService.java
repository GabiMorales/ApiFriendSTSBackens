package com.gab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {

	@Autowired
	private FriendRepository repository;
	
	public List<Friend> getFriends() {
		return repository.findAll();
	}
	
	public void addFriend(Friend friend) {
		repository.save(friend);
	}
	
	public void updatefriend(Friend friend) {
		repository.save(friend);
	}
	
	public void deleteFriend(Integer id) {
		repository.deleteById(id);
	}
}
