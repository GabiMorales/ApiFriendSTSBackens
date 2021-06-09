package com.gab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FriendController {

	@Autowired
	private FriendService service;
	
	@GetMapping("/friends")
	public List<Friend> getFriend(){
		return service.getFriends();
	}
	
	@PostMapping("/friends/addnew")
	public void addFriend(@RequestBody Friend friend) {
		service.addFriend(friend);
	}
	
	@PutMapping("/friends/{id}/edit")
	public void updateFriend(@PathVariable("id") Integer id, @RequestBody Friend friend) {
		service.updatefriend(friend);
	}
	
	@DeleteMapping("/friends/{id}/delete")
	public void deleteFriend(@PathVariable("id") Integer id) {
		service.deleteFriend(id);
	}
	
}
