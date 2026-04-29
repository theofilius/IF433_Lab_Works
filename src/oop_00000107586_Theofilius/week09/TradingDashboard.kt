package oop_00000107586_Theofilius.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog(pair = "BTCUSDT", position = "LONG", roe = 12.5, leverage = 10, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "SHORT", roe = -3.2, leverage = 5, status = "CLOSED"),
        TradeLog(pair = "SOLUSDT", position = "LONG", roe = 25.0, leverage = 20, status = "CLOSED"),
        TradeLog(pair = "XRPUSDT", position = "SHORT", roe = 0.0, leverage = 3, status = "CLOSED"),
        TradeLog(pair = "BNBUSDT", position = "LONG", roe = -8.7, leverage = 8, status = "CLOSED"),
        TradeLog(pair = "ADAUSDT", position = "LONG", roe = 6.1, leverage = 12, status = "OPEN")
    )

    println("Trade history size: ${tradeHistory.size}")
    println(tradeHistory)

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("Closed trades size: ${closedTrades.size}")
    println(closedTrades)

    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("Winning trades size: ${winningTrades.size}")
    println(winningTrades)

    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("Losing trades size: ${losingTrades.size}")
    println(losingTrades)

    val topPerformers = winningTrades
        .sortedByDescending { it.roe }
        .map { trade ->
            "WIN [${trade.pair} - ${trade.position}]: +${trade.roe}% ROE (Lev: ${trade.leverage}x)"
        }
    println("Top performers: $topPerformers")
}
