package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLowerZeroException extends Exception {
	
	public BeerStockLowerZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beer with %s ID to decrement doesn't have quantity enough to decrement the quantity informed: %s", id, quantityToDecrement));
    }

}
