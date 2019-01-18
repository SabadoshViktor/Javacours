package telran.user.data;

public class Post {
	
	private User author;
	private int postID;
	private String title;
	private String content;
	private int likes;
	
	public Post(User author, int postID, String title, String content) {
		super();
		this.author = author;
		this.postID = postID;
		this.title = title;
		this.content = content;
		this.likes = 0;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public int getPostID() {
		return postID;
	}
	public void setPostID(int postID) {
		this.postID = postID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}

	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public void setContent(String content) {
		
		this.content = content;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Post [author=" + author + ", postID=" + postID + ", title=" + title + ", content=" + content
				+ ", likes=" + likes  ;
	}
	
	public int addLike() {
		
		return 	this.likes = this.likes+1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + likes;
		result = prime * result + postID;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (likes != other.likes)
			return false;
		if (postID != other.postID)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
