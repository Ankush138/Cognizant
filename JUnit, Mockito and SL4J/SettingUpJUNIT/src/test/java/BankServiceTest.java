import org.junit.Test;
import static org.junit.Assert.*;

public class BankServiceTest {
    @Test
    public void testDeposit() {
        BankService bank = new BankService();
        bank.deposit(500);
        assertEquals(500, bank.getBalance());
    }
}