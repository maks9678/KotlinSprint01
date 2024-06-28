package org.example.lesson_2

fun main() {

    val numberOfEmployees = 50
    val salaryOfEmployees = 30000
    val numberOfInterns = 30
    val salaryOfInterns = 20000

    var totalSalaryOfEmployees = numberOfEmployees * salaryOfEmployees
    var totalSalaryOfInterns = numberOfInterns * salaryOfInterns

    var totalSalary = totalSalaryOfEmployees + totalSalaryOfInterns

    var numberEmployeesAndInterns = numberOfEmployees + numberOfInterns

    var averageSalary = totalSalary / numberEmployeesAndInterns

}