class Post implements Content{
	private Like[] likes = {};
	private Comment[] comments = {};
	private String discription = "";
	private String geotag;
	private boolean commentable = true;  // можно ли оставить комментарий под постом

	public Post(Like[] likes, Comment[] comments, String discription, String geotag, boolean commentable){
		this.likes = likes;
		this.comments = comments;
		this.discription = discription;
		this.geotag = geotag;
		this.commentable = commentable;
	}

	public Post(){
	}

	public Post(String discription){
		this.discription = discription;
	}

	@Override
	public String toString(){
		return "Post: " + this.likes.length + " likes " + this.comments.length + " comments \n" +
		this.discription;
	}
}