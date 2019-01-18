package telran.user.dao;

import telran.user.data.*;

public class Forum {
	
	private Post[] posts;
	private int size;
		
	
	public Forum(int capacity) {
		posts = new Post[capacity];
	}
	
	public int size() {
		return size;
	}
	
	public boolean addPost(Post post) {
		if(size<posts.length) {
			posts[size]=post;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean removePost (int postID) {
		for (int i = 0; i < size; i++) {
			if(posts[i].getPostID()==postID) {
				posts[i]=posts[size-1];
				size--;
				return true;
			}
		}
		return false;
	}
	
	public boolean removePostByAuthor (User author) {
		for (int i = 0; i < size; i++) {
			if(posts[i].getAuthor()==author) {
				posts[i]=posts[size-1];
				size--;
				return true;
			}
		}
		return false;
	}
	
	public Post getPostByID(int postID) {
		for (int i = 0; i <size; i++) {
			if(postID==posts[i].getPostID()) {
				return posts[i];
			}
		}
		return null;
	}
	
	public Post[] getPostByAuthor(String author, int numberOfPost) {
		Post[] p2 = new Post[numberOfPost];
		int size1=0;
		for (int i = 0; i < size; i++) {
			if(posts[i].getAuthor().toString() == author) {
				p2[size1]=posts[i];
				size1++;
		}
	}
		return p2;
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(posts[i]);
		}
	}
	

}
