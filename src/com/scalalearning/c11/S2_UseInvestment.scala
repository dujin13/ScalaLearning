package com.scalalearning.c11

/**
  * Created by gaolp on 2016/3/1.
  */
object S2_UseInvestment {
  def main(args: Array[String]) {
    val investment = new Investment("XYZ Corporation", InvestmentType.STOCK)
    println(investment.getClass)
    val theYield1 = investment.`yield`
    println(theYield1)
  }
}
