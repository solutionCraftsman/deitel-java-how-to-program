package two.nine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossingTest {

    CoinTossing coinTossing;

    @BeforeEach
    void setUp() {
        coinTossing = new CoinTossing();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testProgramRealisticallySimulatesCoinTossing() {
        coinTossing.tossCoin();
        coinTossing.tossCoin();
        coinTossing.tossCoin();
        coinTossing.tossCoin();

        System.out.println(coinTossing.getNoOfHeads());
        System.out.println(coinTossing.getNoOfTails());

        assertTrue(1 <= coinTossing.getNoOfHeads() && coinTossing.getNoOfHeads() <= 3);
        assertTrue(1 <= coinTossing.getNoOfTails() && coinTossing.getNoOfTails() <= 3);
    }

    @Test
    void testFlip() {
        System.out.println(coinTossing.flip());
        assertTrue(coinTossing.flip() == CoinTossing.Coin.HEADS ||
                coinTossing.flip() == CoinTossing.Coin.TAILS);
    }
}