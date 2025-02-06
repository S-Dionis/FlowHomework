package otus.homework.flowcats

sealed class Result {
    data class Success<T>(val data: T) : Result()
    data class Error(val message: String?, val throwable: Throwable? = null) : Result()
}