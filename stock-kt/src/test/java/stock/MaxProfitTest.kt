package stock;

import org.amshove.kluent.`should equal`
import org.jetbrains.spek.api.Spek

class MaxProfitSpec: Spek ({
    describe("MaxProfit") {
        it("should be") {
            MaxProfit.maxProfit(arrayOf(5, 4, 3, 2, 1)) `should equal` 0
            MaxProfit.maxProfit(arrayOf(1, 2, 3, 4, 5)) `should equal` 4
            MaxProfit.maxProfit(arrayOf(5, 4, 3, 2, 1, 5)) `should equal` 4
            MaxProfit.maxProfit(arrayOf(3, 2, 1, 2, 3)) `should equal` 2
            MaxProfit.maxProfit(arrayOf(3, 2, 1, 1, 2, 3)) `should equal` 2
            MaxProfit.maxProfit(arrayOf(5, 3, 1, 2, 3, 2, 3, 4, 3, 2, 1)) `should equal` 3
            MaxProfit.maxProfit(arrayOf(5, 6, 4, 7, 9, 8, 8)) `should equal` 5
            MaxProfit.maxProfit(arrayOf(15, 5, 6, 4, 7, 9, 8, 8)) `should equal` 5
            MaxProfit.maxProfit(arrayOf(15, 5, 6, 4, 10, 7, 15, 8, 8)) `should equal` 11
            MaxProfit.maxProfit(arrayOf(1, 2, 3, 4, 5, 1, 9)) `should equal` 8
        }
    }
})
