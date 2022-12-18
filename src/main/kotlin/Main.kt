fun main(args: Array<String>) {
  var total = 12000
  val withMinDiscount = total - 100
  val withMaxDiscount = total * 0.95
  var everyMonth: Boolean = true

  if (total <= 1000) {
      if (everyMonth == true) {
          var total = total * 0.99
          println("Скидка не предоставляется. К оплате: $total руб.")
      }
  } else if (1001 <= total || total <= 10000) {
      if (everyMonth == true) {
          var withMinDiscount = withMinDiscount * 0.99
          println("К оплате с учетом скидки в 100 рублей: $withMinDiscount руб.")
      }
  } else if (total > 10000) {
      if (everyMonth == true) {
          var withMaxDiscount = withMaxDiscount * 0.99
      println("К оплате с учетом скидки 5%: $withMaxDiscount руб.")
      }
  }

}