package org.example.lesson_11

fun main() {
    val participant1 = Participant("alfred", "ссылка на аватар", "разговаривает")
    val participant2 = Participant("foma", "ссылка на аватар", "разговаривает")
    val room1 = Rooms("ссылка на обложку", "artists", "participant2")
    room1.addParticipant(participant1)
    room1.addParticipant(participant2)
    room1.statusUpdates("foma", "mut")
}

class Rooms(
    val cover: String,
    val nameCover: String,
    val listOfParticipants: String,
) {
    val participantsRooms: MutableList<Participant> = mutableListOf()

    fun addParticipant(participant: Participant) {
        participantsRooms.add(participant)
    }

    fun statusUpdates(userName: String, newStatus: String) {
        participantsRooms.find { it.userName == userName }?.status = newStatus
    }
}

class Participant(
    val userName: String,
    val userAvatar: String,
    var status: String,
) {}