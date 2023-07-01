package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val postAuthor: Author,
    val comments: List<CommentWithAuthor>,

)
