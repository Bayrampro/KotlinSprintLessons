package lesson_18

import java.util.Date

// subtyping
open class NoteAppItemSubtyping {
    open fun getItemData() : String = ""
}

class MessageItem(
    private val title: String,
    private val  date: Date,
    private val type: String,
    private val  data: String,
) : NoteAppItemSubtyping() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $date\nType - $type\nData: $data"
    }
}

class NumberItem(
    private val title: String,
    private val  date: Date,
    private val type: String,
    private val  data: Long,
) : NoteAppItemSubtyping() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $date\nType - $type\nData: $data"
    }
}

class TodoItem(
    private val title: String,
    private val  date: Date,
    private val type: String,
    private val  data: List<String>,
) : NoteAppItemSubtyping() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $date\nType - $type\nData: $data"
    }
}