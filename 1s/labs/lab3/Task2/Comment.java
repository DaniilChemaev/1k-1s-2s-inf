class Comment extends Like{
	private User user;  // Пользователь, который оставил комментарий
	private String text;  // Текст комментария 
	private Like[] likes;  // Количество лайков на комментарии
}