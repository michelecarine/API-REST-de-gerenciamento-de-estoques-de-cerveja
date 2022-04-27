package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockEmptyException extends Exception {
	
	public BeerStockEmptyException(Long id, int quantityToDecrement) {
        super(String.format("Beer with %s ID to decrement is EMPTY stock. Don't decrement the quantity informed: %s", id, quantityToDecrement));
    }

}
