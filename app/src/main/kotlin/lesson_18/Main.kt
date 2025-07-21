package lesson_18

import java.util.*

// ad hoc
// subtyping
// parametric

fun main() {

    val noteAdHoc: NoteAppItemAdHoc = NoteAppItemAdHoc()

    noteAdHoc.addNoteItem(
        title = "Work",
        type = "message",
        date =  Date(),
        data = "Hello teammates you are awful!"
    )

    noteAdHoc.addNoteItem(
        title = "Add number",
        type = "Number",
        date = Date(),
        data = 79197456143
    )

    noteAdHoc.addNoteItem(
        title = "What i should do",
        type = "todo",
        date = Date(),
        data = listOf<String>("Go to work", "Eat", "Learn Kotlin", "Sleep")
    )

   ////////////////////////////////////////////////////////////////////////

    val noteSubtypingMessage : NoteAppItemSubtyping = MessageItem(
        title = "Work",
        type = "message",
        date =  Date(),
        data = "Hello teammates you are awful!"
    )
    val noteSubtypingNumber : NoteAppItemSubtyping = NumberItem(
        title = "Add number",
        type = "Number",
        date = Date(),
        data = 79197456143
    )
    val noteSubtypingTodo : NoteAppItemSubtyping = TodoItem(
        title = "What i should do",
        type = "todo",
        date = Date(),
        data = listOf<String>("Go to work", "Eat", "Learn Kotlin", "Sleep")
    )

    println(noteSubtypingMessage.getItemData())
    println(noteSubtypingNumber.getItemData())
    println(noteSubtypingTodo.getItemData())
}