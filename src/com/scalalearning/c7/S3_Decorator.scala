package com.scalalearning.c7

object S3_Decorator {
  def main(args: Array[String]) {
    val apartmentApplication = new Check with CreditCheck with CriminalRecordCheck
    println(apartmentApplication check)

    val employmentApplication = new Check with CriminalRecordCheck with EmploymentCheck
    println(employmentApplication check)
  }

  abstract class Check {
    def check() : String = "Checked Application Details..."
  }

  trait CreditCheck extends Check {
    override def check() : String = "Checked Credit..." + super.check()
  }

  trait EmploymentCheck extends Check {
    override def check() : String = "Checked Employment..." + super.check()
  }

  trait CriminalRecordCheck extends Check {
    override def check() : String = "Checked Criminal Records..." + super.check()
  }

}
