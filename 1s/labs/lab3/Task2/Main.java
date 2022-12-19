// 2 вариант
//
// Полиморфизм:
// Массив feed Content[Storie storie1, Post post1, Reels reel1 ...]
// Истории и Посты и Рилс имплементятся от одного интерфеса Content,
// чтобы потом их можно было засунуть в один массив feed



class Main{
	public static void main(String[] args){
		User user1 = new User("sound_banana");
		System.out.println(user1);

		Post post1_user1 = new Post("test discription");
		System.out.println(post1_user1);
		// Like[] likes = {}
		// Post post1 = new Post();
	}
}