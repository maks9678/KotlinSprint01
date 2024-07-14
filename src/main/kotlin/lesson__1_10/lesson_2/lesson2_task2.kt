package org.example.lesson__1_10.lesson_2

fun main() {

    val numberOfEmployees = 50
    val salaryOfEmployees = 30000
    val numberOfInterns = 30
    val salaryOfInterns = 20000

    val totalSalaryOfEmployees = numberOfEmployees * salaryOfEmployees
    val totalSalaryOfInterns = numberOfInterns * salaryOfInterns

    val totalSalary = totalSalaryOfEmployees + totalSalaryOfInterns

    val numberEmployeesAndInterns = numberOfEmployees + numberOfInterns

    val averageSalary = totalSalary / numberEmployeesAndInterns

}
