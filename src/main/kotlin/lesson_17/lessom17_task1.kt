package org.example.lesson_17

class Quiz(private var _question: String, private var _answer: String) {
    var question:String
        get() = _question
        set(value) {
            _question = value
        }

    var answer:String
        get() = _answer
        set(value) {
            _answer = value
        }
}