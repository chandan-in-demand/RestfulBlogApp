package org.jaxs.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jaxs.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
	static List<Post> posts = new ArrayList<>(
			Arrays.asList(
					new Post(1, "DataType1", "sample Text"),
					new Post(2, "DataType1", "sample Text"),
					new Post(3, "DataType1", "sample Text"),
					new Post(4, "DataType1", "sample Text"),
					new Post(5, "DataType1", "sample Text")
			));
	
	public List<Post> getPosts(){
		return posts;
	}
	
	public Post getPost(int id) {
		for(Post post: posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}
	
	public void addPost(Post listElement) {
		System.out.println(posts.add(listElement));
	}

	public void updatePost(Post post, int id) {
		// TODO Auto-generated method stub
		Post tempPost = posts.get(id);
		if(tempPost.getPostId() == id) {
			posts.set(id, post);
		}
	}

	public void deletePost(int id) {
		// TODO Auto-generated method stub
		posts.remove(id);
	}
	
}

