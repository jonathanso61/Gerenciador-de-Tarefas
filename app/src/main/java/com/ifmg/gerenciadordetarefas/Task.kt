package com.ifmg.gerenciadordetarefas

data class Task(
    var id: Long = 0,
    var description: String = "",
    var dueDate: String = "",
    var dueTime: String = "",
    var priority: String = ""
) {
    fun isValid(): Boolean {
        return description.isNotBlank() && dueDate.isNotBlank() && dueTime.isNotBlank() && priority.isNotBlank()
    }
}
