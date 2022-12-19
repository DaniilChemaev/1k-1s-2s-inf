class User{
	private String nickname;
	private String name;
	private String discription;
	private User[] followers = {};
	private Post[] posts = {};

	public User(String nickname, String name, String discription, User[] followers, Post[] posts){
		 this.nickname = nickname;
		 this.name = name;
		 this.discription = discription;
		 this.followers = followers;
		 this.posts = posts;

	}

	public User(String nickname, User[] followers, Post[] posts){
		 this.nickname = nickname;
		 this.followers = followers;
		 this.posts = posts;

	}

	public User(String nickname){
		 this.nickname = nickname;

	}

	@Override
	public String toString(){
		return "@" + this.nickname + " " + this.followers.length + " подписчиков";
	}

}