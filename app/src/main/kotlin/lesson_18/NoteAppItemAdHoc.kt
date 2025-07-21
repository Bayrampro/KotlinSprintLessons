package lesson_18

import java.util.*

// ad hoc
class NoteAppItemAdHoc {

    fun addNoteItem(
        title: String,
        date: Date,
        type: String,
        data: String,
    ) {
        println("Item \"$title\" added to cell - $date\nType - $type\nData: $data")
    }

    fun addNoteItem(
        title: String,
        date: Date,
        type: String,
        data: Long,
    ) {
        println("Item \"$title\" added to cell - $date\nType - $type\nData: $data")
    }

    fun addNoteItem(
        title: String,
        date: Date,
        type: String,
        data: List<String>,
    ) {
        println("Item \"$title\" added to cell - $date\nType - $type\nData: $data")
    }
}