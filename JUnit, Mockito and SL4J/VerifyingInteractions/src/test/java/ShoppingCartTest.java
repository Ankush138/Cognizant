import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    public void testVerifyPayment() {

        PaymentGateway mockGateway = mock(PaymentGateway.class);

        ShoppingCart cart = new ShoppingCart(mockGateway);

        cart.checkout(2499.99);

        verify(mockGateway).processPayment(2499.99);
    }
}